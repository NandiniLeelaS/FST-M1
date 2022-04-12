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

public class Activity1 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void add(){
        //click number 8
        driver.findElementById("digit_8").click();
        //click multiply(*) button
        driver.findElementById("op_mul").click();
        //click number 6
        driver.findElementById("digit_6").click();
        //click equals button
        driver.findElementByAccessibilityId("equals").click();
        //get the text of multiplication result
        String result = driver.findElementById("result").getText();
        //print the multiplication result
        System.out.println("the result is: " +result);
        //assertion statement to verify your result
        Assert.assertEquals(result, "48");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}