package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement ajaxcontent = driver.findElement(By.id("ajax-content"));
        wait.until(ExpectedConditions.textToBePresentInElement(ajaxcontent, "HELLO!"));
        String text = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("the first text is:" +text);
        wait.until(ExpectedConditions.textToBePresentInElement(ajaxcontent, "I'm late!"));
        System.out.println("the second text is:" +driver.findElement(By.id("ajax-content")).getText());
        driver.close();
    }
}