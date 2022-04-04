package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("The page title is: " + driver.getTitle());
        driver.findElement(By.xpath("//div[@class='column'][1]//input[@placeholder = 'Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@class='column'][1]//input[@placeholder = 'Password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        WebElement loginmessage = driver.findElement(By.xpath("//div[@class='ui massive green label']"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(loginmessage , "Welcome Back, admin"));
        System.out.println("The login message is: " +loginmessage.getText());
        driver.close();
    }
}