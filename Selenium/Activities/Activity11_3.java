package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.xpath("//button[@class='ui inverted green button']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yes, you are!");
        alert.accept();
        driver.close();
    }
}