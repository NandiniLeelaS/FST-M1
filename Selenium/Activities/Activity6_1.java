package Activities;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.support.ui.ExpectedConditions;
 import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title is:" +driver.getTitle());
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='willDisappear']")));
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='willDisappear']")));
        driver.close();
    }
}