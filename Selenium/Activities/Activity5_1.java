package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        driver.getTitle();
        Boolean checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed();
        System.out.println(checkbox);
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        Boolean checkbox1 = driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed();
        System.out.println(checkbox1);
        driver.close();
    }
}