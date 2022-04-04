package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("page title is: " +driver.getTitle());
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement frame1heading = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frame1heading.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        WebElement frame2heading = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frame2heading.getText());
        driver.close();
    }
}