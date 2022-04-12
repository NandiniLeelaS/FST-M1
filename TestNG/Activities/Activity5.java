package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        //driver Initialization
        driver = new FirefoxDriver();
        //Open Browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 0)
    public void HomePage() throws InterruptedException {
        Thread.sleep(2000);
        //checking the page Title
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is: " + PageTitle);
        Assert.assertEquals(PageTitle, "Training Support");
    }

    @Test(groups = {"HeaderGroups"})
            public void headergroups() {
        //Header Tests
        //Find the third header and assert the text in the h3 tag.
        String header3 = driver.findElement(By.xpath("//h3[@class='ui yellow header']")).getText();
        Assert.assertEquals(header3, "Third header");
        //Find and assert the colour of the fifth header tag element
        String h5color = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        Assert.assertEquals(h5color, "rgb(251, 189, 8)");
    }
    @Test(groups = {"buttontests"})
            public void buttontests(){
        //Button Tests
            //Find the button with the class olive and assert it text
        String olivebuttontext = driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
        Assert.assertEquals(olivebuttontext, "Olive");
            //Find and assert the colour of the first button in the third row
        String brownbuttoncolor = driver.findElement(By.xpath("//button[@class='ui brown button']")).getCssValue("color");
        Assert.assertEquals(brownbuttoncolor, "rgb(255, 255, 255)");
    }

    @AfterTest
    public void tearDown(){
        //close the browser
        driver.close();
    }
}