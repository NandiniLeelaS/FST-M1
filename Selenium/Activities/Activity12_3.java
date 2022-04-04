package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("page title is: " +driver.getTitle());
        WebElement ele = driver.findElement(By.xpath("//button[@class='ui huge inverted orange button']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        String toottiptext = driver.findElement(By.xpath("//button[@data-tooltip=\"Click to sign in\"]")).getText();
        System.out.println("tooltip text is: " +toottiptext);
        ele.click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        Thread.sleep(2000);
        System.out.println("login successfull message is: " +driver.findElement(By.xpath("//div[@class='ui positive floating message']")).getText());
        driver.close();


    }
}