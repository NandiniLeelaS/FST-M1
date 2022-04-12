package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity4 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }
    @Test
    public void activity4(){
        //wait till the app completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Add a new contact to the list of contacts:
            //Find and click the button to add a new contact
            driver.findElementByAccessibilityId("Create new contact").click();
            //enter firstname, lastname, phone number
            driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
            driver.findElementByXPath("//android.widget.EditText[@text = 'Last name']").sendKeys("Varma");
            driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
            //Click save
            driver.findElementById("editor_menu_save_button").click();
            //wait till the app completely loads
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //wait until contact created
            String contact = driver.findElementById("large_title").getText();
            Assert.assertEquals(contact, "Aaditya Varma");
            //Delete the contact for the next execution
            driver.findElementByAccessibilityId("More options").click();
            driver.findElementByXPath("//android.widget.TextView[@text='Delete']").click();
            driver.findElementByXPath("//android.widget.Button[@text='DELETE']").click();

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}