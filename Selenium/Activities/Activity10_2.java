package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title is: " +driver.getTitle());
        WebElement text = driver.findElement(By.xpath("//div[@id='keyPressed']"));
        Actions action = new Actions(driver);
        action.sendKeys("K").build().perform();
        System.out.println("the entered text is: " +text.getText());
        Action actionSequence2 = action
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        String text1 = text.getText();
        System.out.println("Pressed key is: " + text1);
        driver.close();

    }
}