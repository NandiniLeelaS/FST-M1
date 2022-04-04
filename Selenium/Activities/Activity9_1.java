package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui selection dropdown']"));
        Select dd = new Select(dropdown);
        dd.selectByVisibleText("Option 2");
        dd.selectByIndex(3);
        dd.selectByValue("4");
        List<WebElement> ddvalues = dd.getOptions();
        for(WebElement option : ddvalues){
            System.out.println(option.getText());
        }
        driver.close();
    }
}