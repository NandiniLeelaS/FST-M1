package LiveProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LiveProject {

    AndroidDriver<MobileElement> driver;
    DesiredCapabilities caps;
    URL appServer;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
    }

    @Test(priority = 0)
    public void GoogleTasks() throws MalformedURLException {
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);

        String task1 = "Complete Activity with Google Tasks";
        String task2 = "Complete Activity with Google Keep";
        String task3 = "Complete the second Activity Google Keep";

        //wait till the app completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Create task1
        //Click the button to add a new task
        driver.findElementByAccessibilityId("Create new task").click();
        //enter name of the task
        driver.findElementByXPath("//android.widget.EditText[@text='New task']").sendKeys(task1);
        //click save
        driver.findElementByXPath("//android.widget.Button[@text = 'Save']").click();
        //Create task2
        //Click the button to add a new task
        driver.findElementByAccessibilityId("Create new task").click();
        //enter name of the task
        driver.findElementByXPath("//android.widget.EditText[@text='New task']").sendKeys(task2);
        //click save
        driver.findElementByXPath("//android.widget.Button[@text = 'Save']").click();
        //Create task3
        //Click the button to add a new task
        driver.findElementByAccessibilityId("Create new task").click();
        //enter name of the task
        driver.findElementByXPath("//android.widget.EditText[@text='New task']").sendKeys(task3);
        //click save
        driver.findElementByXPath("//android.widget.Button[@text = 'Save']").click();
        String Task1text = driver.findElementByXPath("//android.widget.TextView[@text = 'Complete Activity with Google Tasks']").getText();
        String Task2text = driver.findElementByXPath("//android.widget.TextView[@text = 'Complete Activity with Google Keep']").getText();
        String Task3text = driver.findElementByXPath("//android.widget.TextView[@text = 'Complete the second Activity Google Keep']").getText();
        Assert.assertEquals(task1, Task1text);
        Assert.assertEquals(task2, Task2text);
        Assert.assertEquals(task3, Task3text);
        //delete the created tasks for next execution
        driver.findElementByXPath("//android.widget.TextView[@text = 'Complete Activity with Google Tasks']").click();
        driver.findElementByAccessibilityId("Delete").click();
        driver.findElementByXPath("//android.widget.TextView[@text = 'Complete Activity with Google Keep']").click();
        driver.findElementByAccessibilityId("Delete").click();
        driver.findElementByXPath("//android.widget.TextView[@text = 'Complete the second Activity Google Keep']").click();
        driver.findElementByAccessibilityId("Delete").click();

    }

    @Test(priority = 1)
    public void GoogleKeeptask() throws MalformedURLException {

        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);

        //wait till the app completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Click the button to add a new task
        driver.findElementById("com.google.android.keep:id/new_note_button").click();
        //Enter title and Description
        String Title = "Title";
        driver.findElementByXPath("//android.widget.EditText[@text='Title']").sendKeys(Title);
        driver.findElementByXPath("//android.widget.EditText[@text='Note']").sendKeys("description");
        //Click back button
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        String notetitle = driver.findElementByXPath("//android.widget.TextView[@text = 'Title']").getText();
        Assert.assertEquals(notetitle, Title);
        //Delete the note for next execution
        driver.findElementByXPath("//android.widget.TextView[@text = 'Title']").click();
        driver.findElementByAccessibilityId("Action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Delete']").click();
    }

    @Test(priority = 2)
    public void chromeactivity() throws MalformedURLException, InterruptedException {
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        // Instantiate Appium Driver
        appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        //open https://www.training-support.net/selenium
        driver.get("https://www.training-support.net/selenium");
        //wait till the page completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //scroll to view To-Do List card
        String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"To-Do List\").instance(0))";
        driver.findElementByAndroidUIAutomator(scrollElement).click();
        //wait till the page completely loads
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Enter tasks and click Add task
            //task1
        driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']").sendKeys("Add tasks to list");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
            //task2
        driver.findElementByClassName("android.widget.EditText").sendKeys("Get number of tasks");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
            //task3
        driver.findElementByClassName("android.widget.EditText").sendKeys("Clear the list");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();
        //Strike off the tasks
        driver.findElementByXPath("//android.widget.TextView[@text='Add tasks to list']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Get number of tasks']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Clear the list']").click();
        Thread.sleep(5000);
        //clear the list
        driver.findElementByXPath("//android.widget.TextView[@text='Clear List']").click();

    }



    @AfterClass
    public void teardown(){
        driver.quit();
    }
}