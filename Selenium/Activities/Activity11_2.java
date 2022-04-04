package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.xpath("//button[@class='ui inverted blue button']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("the confirmation alert text is: "+alert.getText());
        alert.accept();
        driver.findElement(By.xpath("//button[@class='ui inverted blue button']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("the confirmation alert text is: "+alert.getText());
        alert.dismiss();
        driver.close();

    }
}