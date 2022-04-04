package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.xpath("//button[@id='simple']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("text in the alert:" +alert.getText());
        alert.accept();
        driver.close();
    }
}