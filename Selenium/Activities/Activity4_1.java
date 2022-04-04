package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) throws InterruptedException {
        //Create a firefox Instance
        WebDriver driver = new FirefoxDriver();
        //open training-support.net page
        driver.get("https://www.training-support.net");
        //wait for 2000 millisec
        Thread.sleep(2000);
        //get Page Title
        String title = driver.getTitle();
        System.out.println(title);
        //Click About us using xpath
        driver.findElement(By.xpath("//a[@id = \"about-link\"]")).click();
        //get the page title of current page
        String newTitle = driver.getTitle();
        System.out.println(newTitle);
        //Close the browser
        driver.close();
    }
}