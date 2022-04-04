package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        //Create a firefox Instance
        WebDriver driver = new FirefoxDriver();
        //open training-support.net page
        driver.get("https://www.training-support.net");
        //wait for 2000 millisec
        Thread.sleep(2000);
        //Get the Pagetitle and Print
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is: " +PageTitle);
        //Usage of Locators and Print the text of that Locator
        System.out.println("Locator text is: " +driver.findElement(By.id("about-link")).getText());
        System.out.println("Locator text is: " +driver.findElement(By.className("green")).getText());
        System.out.println("Locator text is: " +driver.findElement(By.linkText("About Us")).getText());
        System.out.println("Locator text is: " +driver.findElement(By.cssSelector("a#about-link")).getText());
        //Close the Browser
        driver.close();

    }
}