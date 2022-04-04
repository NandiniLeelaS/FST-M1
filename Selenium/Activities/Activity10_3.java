package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Page title is: " +driver.getTitle());
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//img[@class='ui-draggable ui-draggable-handle']"));
        WebElement destination = driver.findElement(By.xpath("//div[@class='spaced dropzone ui-widget-header ui-droppable']"));
        action.dragAndDrop(source, destination).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.attributeToBeNotEmpty(destination, "background-color"));
        System.out.println("Dropped in DROPZONE 1 successfully");
        WebElement source1 = driver.findElement(By.xpath("//div[@class='spaced dropzone ui-widget-header ui-droppable']"));
        WebElement destination1 = driver.findElement(By.xpath("//div[@class='spaced dropzone ui-droppable']"));
        action.dragAndDrop(source1,destination1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(destination1, "background-color"));
        System.out.println("Dropped in DROPZONE 2 successfully");
        driver.close();
    }
}