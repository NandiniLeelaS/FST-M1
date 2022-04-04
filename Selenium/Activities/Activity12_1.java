package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("page title is: " +driver.getTitle());
        driver.switchTo().frame(0);
        String frame1heading = driver.findElement(By.xpath("//div[contains(text(), 'Frame 1')]")).getText();
        System.out.println(frame1heading);
        WebElement frame1button = driver.findElement(By.xpath("//button[@class='ui inverted red button']"));
        String frame1buttontext = frame1button.getText();
        String frame1buttoncolor = frame1button.getCssValue("color");
        System.out.println("Frame1 button text is: " +frame1buttontext);
        System.out.println("Frame1 button color is: "+frame1buttoncolor);
        frame1button.click();
        WebElement frame1buttonupdate = driver.findElement(By.xpath("//button[@class='ui inverted button blue']"));
        String frameupdatedtext = frame1buttonupdate.getText();
        String frameupdatedcolor = frame1buttonupdate.getCssValue("color");
        System.out.println("Frame1 updated button text is: " +frameupdatedtext);
        System.out.println("Frame1 updated button color is: "+frameupdatedcolor);

        //WebElement frame2 = driver.findElement(By.xpath("/html/body/div[1]"));
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        String frame2heading = driver.findElement(By.xpath("//div[contains(text(), 'Frame 2')]")).getText();
        System.out.println(frame2heading);
        WebElement frame2button = driver.findElement(By.cssSelector("button"));
        System.out.println("frame2 button text is: " + frame2button.getText());
        System.out.println("frame2 button color is: " + frame2button.getCssValue("color"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        frame2button.click();
        Thread.sleep(2000);
        WebElement frame2buttonupdate = driver.findElement(By.xpath("//button[@class='ui inverted button purple']"));
        System.out.println("frame2 button updated text is: " +frame2buttonupdate.getText());
        System.out.println("frame2 button updated color is: "+frame2buttonupdate.getCssValue("color"));
        driver.close();




    }
}