package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement multiselect = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select ms = new Select(multiselect);
        if(ms.isMultiple())
        {
            ms.selectByVisibleText("Javascript");
            ms.selectByValue("node");
            for(int i =4; i<=6;i++)
            {
                ms.selectByIndex(i);
            }
            ms.deselectByValue("node");
            ms.deselectByIndex(7);
            WebElement first = ms.getFirstSelectedOption();
            System.out.println("First selected option is: " +first.getText());
            List<WebElement> allseletedoptions = ms.getAllSelectedOptions();
            for(WebElement options : allseletedoptions)
                System.out.println(options.getText());
            ms.deselectAll();
            driver.close();
        }
    }
}