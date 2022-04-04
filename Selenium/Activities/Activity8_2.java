package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> colcount = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr[1]//td"));
        List<WebElement> rowcount = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody//tr"));
        System.out.println("Row size is: " +rowcount.size());
        System.out.println("Column size is: " +colcount.size());
        System.out.println("Second row, second column value is: " +driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]")).getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']//thead//tr/th[1]")).click();
        System.out.println("Second row, second column value is: " +driver.findElement(By.xpath("//table[@id='sortableTable']//tbody//tr[2]//td[2]")).getText());
        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());
        driver.close();


    }
}