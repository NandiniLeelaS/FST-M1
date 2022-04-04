package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title is:" +driver.getTitle());
        Boolean checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected();
        System.out.println(checkbox);
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
        Boolean checkbox1 = driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected();
        System.out.println(checkbox1);
        driver.close();
    }
}