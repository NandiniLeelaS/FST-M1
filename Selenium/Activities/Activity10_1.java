package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title is: " +driver.getTitle());
        WebElement cube = driver.findElement(By.xpath("//div[@id='D3Cube']"));
        Actions action = new Actions(driver);
        action.click(cube).perform();
        Thread.sleep(2000);
        String leftclick = driver.findElement(By.xpath("//div[@class='active']")).getText();
        System.out.println("The cube text after left click: " +leftclick);
        action.doubleClick(cube).perform();
        Thread.sleep(2000);
        String doubleclick = driver.findElement(By.xpath("//div[@class='active']")).getText();
        System.out.println(doubleclick);
        action.contextClick(cube).perform();
        Thread.sleep(2000);
        String rightclick = driver.findElement(By.xpath("//div[@class='active']")).getText();
        System.out.println(rightclick);
        driver.close();



    }
}