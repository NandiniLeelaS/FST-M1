package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity10 {
    WebDriver driver;
    Actions builder;
    @BeforeClass
    public void setup(){
        //driver Initialization
        driver = new FirefoxDriver();
        builder = new Actions(driver);
        //Open Browser
        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @Test(priority = 0)
    public void middlevalue(){
        WebElement move = driver.findElement(By.xpath("//input[@id='slider']"));
        move.click();
        String halftext = driver.findElement(By.xpath("//span[@id='value']")).getText();
        System.out.println(halftext);
        Assert.assertEquals(halftext, "50");
    }

    @Test(priority = 1)
    public void maximumvalue(){
        WebElement max = driver.findElement(By.xpath("//input[@id='slider']"));
        builder.clickAndHold(max).moveByOffset(75, 0).release().build().perform();
        String maximum = driver.findElement(By.xpath("//span[@id='value']")).getText();
        System.out.println(maximum);
        Assert.assertEquals(maximum, "100");
    }

    @Test(priority = 2)
    public void minimumvalue(){
        WebElement min = driver.findElement(By.xpath("//input[@id='slider']"));
        builder.clickAndHold(min).moveByOffset(-75, 0).release().build().perform();
        String minimum = driver.findElement(By.xpath("//span[@id='value']")).getText();
        System.out.println(minimum);
        Assert.assertEquals(minimum, "0");
    }

    @Test(priority = 3)
    public void value1(){
        WebElement value1 = driver.findElement(By.xpath("//input[@id='slider']"));
        builder.clickAndHold(value1).moveByOffset(-30, 0).release().build().perform();;
        String va1 = driver.findElement(By.xpath("//span[@id='value']")).getText();
        System.out.println(va1);
        Assert.assertEquals(va1, "30");
    }

    @Test(priority = 4)
    public void value2(){
        WebElement value2 = driver.findElement(By.xpath("//input[@id='slider']"));
        builder.clickAndHold(value2).moveByOffset(44, 0).release().build().perform();
        String va2 = driver.findElement(By.xpath("//span[@id='value']")).getText();
        System.out.println(va2);
        Assert.assertEquals(va2, "80");
    }

    @AfterClass
    public void teardown(){
        //close the browser
        driver.close();
    }

}