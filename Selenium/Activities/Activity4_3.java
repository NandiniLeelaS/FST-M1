package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) throws InterruptedException {
        //Create a firefox Instance
        WebDriver driver = new FirefoxDriver();
        //open training-support.net page
        driver.get("https://www.training-support.net/selenium/target-practice");
        //wait for 2000 millisec
        Thread.sleep(2000);
        //get Page Title
        String title = driver.getTitle();
        System.out.println(title);
        //get the third header
        String thirdheader = driver.findElement(By.xpath("//h3[@id = \"third-header\"]")).getText();
        System.out.println(thirdheader);
        //get the color of Fifth header
        String fifthheadercolor = driver.findElement(By.xpath("//h5[@class = \"ui green header\"]")).getCssValue("color");
        System.out.println(fifthheadercolor);
        //print all the class attribute values of violet button
        String classattribute = driver.findElement(By.xpath("//button[@class = \"ui violet button\"]")).getAttribute("class");
        System.out.println(classattribute);
        //Find the grey button on the page with Absolute XPath
        String greybutton = driver.findElement(By.xpath("//button[@class = \"ui grey button\"]")).getText();
        System.out.println(greybutton);
        //Close the browser
        driver.close();
    }
}