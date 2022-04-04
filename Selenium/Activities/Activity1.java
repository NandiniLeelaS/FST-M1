package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        //Create a firefox Instance
        WebDriver driver = new FirefoxDriver();
        //open training-support.net page
        driver.get("https://www.training-support.net");
        //wait for 2000 millisec
        Thread.sleep(2000);
        driver.close();
    }
}