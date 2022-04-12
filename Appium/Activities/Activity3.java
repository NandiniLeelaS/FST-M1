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

public class Activity3 {
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
    public void activity3(){
        //Calculate 5 + 9 and print the result to the console
        driver.findElementById("digit_5").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("digit_9").click();
        driver.findElementByAccessibilityId("equals").click();
        String result1 = driver.findElementById("result").getText();
        System.out.println("The result of 5+9 is: " +result1);
        Assert.assertEquals(result1, "14");

        //Calculate 10 - 5 and print the result to the console
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementByAccessibilityId("minus").click();
        driver.findElementById("digit_5").click();
        driver.findElementByAccessibilityId("equals").click();
        String result2 = driver.findElementById("result").getText();
        System.out.println("The result of 10-5 is: " +result2);
        Assert.assertEquals(result2, "5");

        //Calculate 5 * 100 and print the result to the console
        driver.findElementById("digit_5").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        driver.findElementByAccessibilityId("equals").click();
        String result3 = driver.findElementById("result").getText();
        System.out.println("The result of 5*100 is: " +result3);
        Assert.assertEquals(result3, "500");

        //Calculate 50 / 2 and print the result to the console.
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        driver.findElementByAccessibilityId("divide").click();
        driver.findElementById("digit_2").click();
        driver.findElementByAccessibilityId("equals").click();
        String result4 = driver.findElementById("result").getText();
        System.out.println("The result of 50/2 is: " +result4);
        Assert.assertEquals(result4, "25");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}