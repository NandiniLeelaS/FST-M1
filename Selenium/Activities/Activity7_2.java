package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("The Page Title is: " +driver.getTitle());
        driver.findElement(By.xpath("//div[@class='column'][2]//input[@placeholder = 'Username']")).sendKeys("keerthana");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]")).sendKeys("password");
        driver.findElement(By.xpath("//input[@placeholder = 'totally.real.email@xyz.com']")).sendKeys("keerthana@gmail.com");
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();
        String successmessgae = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println(successmessgae);
        driver.close();
    }
}