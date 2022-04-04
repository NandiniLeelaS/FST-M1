package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        //Create a firefox Instance
        WebDriver driver = new FirefoxDriver();
        //open training-support.net page
        driver.get("https://training-support.net/selenium/simple-form");
        //wait for 2000 millisec
        Thread.sleep(2000);
        //get the PageTitle
        System.out.println("PageTitle is: " +driver.getTitle());
        //Enter value to First Name field using name() locator. As there is no name attribute to this field selecting id selector
        WebElement FN = driver.findElement(By.id("firstName"));
        FN.sendKeys("Keerthana");
        //Enter value to Last Name field using name() locator. As there is no name attribute to this field selecting id selector
        WebElement LN = driver.findElement(By.id("lastName"));
        LN.sendKeys("Siddula");
        //Enter value to Email field
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("keerthanasiddula@gmail.com");
        //Enter value to Contact field
        WebElement Contact = driver.findElement(By.id("number"));
        Contact.sendKeys("9494696955");
        //Submit the form
        WebElement submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        submit.submit();
        //Add some sleep time to see the submission
        Thread.sleep(2000);
        //close the browser
        driver.close();


    }
}