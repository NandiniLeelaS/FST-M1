package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import okio.Timeout;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity2 {

    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void aboutus(){
        //open URL
        driver.get("https://www.training-support.net/");
        //wait till the page completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Locate the heading on the page and print it to console
        MobileElement heading = driver.findElementByXPath("//android.widget.TextView[@text='Training Support']");
        //get the text of the heading
        String Headingtext = heading.getText();
        //print the text of the heading
        System.out.println("The heading text is: "+Headingtext);
        //locate the BAout US link and click
        driver.findElementByXPath("//android.widget.TextView[@text='About Us']").click();
        //Wait until the page is loaded completely - Implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Get the header of About Us page
        String Aboutusheader = driver.findElementByXPath("//android.widget.TextView[@text='About Us']").getText();
        System.out.println(Aboutusheader);
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}