package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> colcount = driver.findElements(By.xpath("//div[@class='spaced']//tbody//tr[1]//td"));
        List<WebElement> rowcount = driver.findElements(By.xpath("//div[@class='spaced']//tbody//tr"));
        System.out.println("Row size is: " +rowcount.size());
        System.out.println("Column size is: " +colcount.size());
        List<WebElement> thirdrow = driver.findElements(By.xpath("//div[@class='spaced']//tbody//tr[3]//td"));
        for(WebElement str : thirdrow)
        System.out.println(str.getText());
        System.out.println("The second row second column value is: " + driver.findElement(By.xpath("//div[@class='spaced']//tbody//tr[2]//td[2]")).getText());;
        driver.close();

    }
}