package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Activity7 {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        //driver Initialization
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @DataProvider(name="Authentication")
    public static Object[][] data(){
        return new Object[][] { { "admin", "password" }};
    }

    @Test(dataProvider = "Authentication")
    public void activity(String username, String password){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }

    @AfterClass
    public void tearDown(){
        //close the browser
        driver.close();
    }
}