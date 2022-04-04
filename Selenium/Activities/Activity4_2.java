package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        //Create a firefox Instance
        WebDriver driver = new FirefoxDriver();
        //open training-support.net page
        driver.get(" https://www.training-support.net/selenium/simple-form");
        //wait for 2000 millisec
        Thread.sleep(2000);
        //get Page Title
        String title = driver.getTitle();
        System.out.println(title);
        //enter values into all input fields using xpath
        driver.findElement(By.xpath("//input[@id = \"firstName\"]")).sendKeys("Siddula");
        driver.findElement(By.xpath("//input[@id = \"lastName\"]")).sendKeys("Hani");
        driver.findElement(By.xpath("//input[@id = \"email\"]")).sendKeys("hani@gmail.com");
        driver.findElement(By.xpath("//input[@id = \"number\"]")).sendKeys("9494696955");
        //submit the form by clicking on Submit button
        driver.findElement(By.xpath("//input[@type = \"submit\"]")).click();
        Thread.sleep(2000);
        //Close the browser
        driver.close();
    }
}