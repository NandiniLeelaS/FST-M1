package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title is:" +driver.getTitle());
        Boolean textbox = driver.findElement(By.xpath("//div[@id=\"dynamicText\"]")).isEnabled();
        System.out.println(textbox);
        driver.findElement(By.xpath("//button[@id=\"toggleInput\"]")).click();
        Boolean textbox1 = driver.findElement(By.xpath("//div[@id=\"dynamicText\"]")).isEnabled();
        System.out.println(textbox1);
        driver.close();
    }
}