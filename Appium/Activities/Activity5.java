package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity5 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.messaging");
        caps.setCapability("appActivity", ".ui.ConversationListActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void activity5() {
        //wait till the app completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //click on + button to create new message
        driver.findElementById("start_new_conversation_button").click();
        //wait till the app completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Locate the contact fields and enter your own phone number to send a message to your own phone number
        MobileElement phoneno = driver.findElementById("recipient_text_view");
        phoneno.sendKeys("9743180718");
        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        //phoneno.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Locate the message input field and enter the message "Hello from Appium".
        driver.findElementById("compose_message_text").sendKeys("Hello from Appium");
        //Locate the send button and click it
        driver.findElementById("send_message_button_icon").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Write an assertion to verify that the message has been sent successfully.
        String message = driver.findElementById("message_text").getText();
        Assert.assertEquals(message, "Hello from Appium");

        //Delete the message for next execution
        driver.findElementByAccessibilityId("More options").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Delete']").click();
        driver.findElementByXPath("//android.widget.Button[@text='DELETE']").click();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}