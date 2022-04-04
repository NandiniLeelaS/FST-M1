package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2b {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String filePath = "C:\\Users\\001ZLV744\\Desktop\\FST\\FST_Selenium\\src\\test\\java\\Activities\\sample.xlsx";
        Activity13_2b srcExcel = new Activity13_2b();
        List<List<String>> data = srcExcel.readExcel(filePath);
        List<String> row;
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        row = data.get(3);
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys(row.get(1));
        lastName.sendKeys(row.get(2));
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(row.get(3));
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys(row.get(4));
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        Alert message = driver.switchTo().alert();
        System.out.println("Alert message: " + message.getText());
        message.accept();
        driver.close();
    }

    public List<List<String>> readExcel(String filePath) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            FileInputStream file = new FileInputStream(filePath);

            //Create Workbook instance holding reference to Excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
                //Temp variable
                List<String> rowData = new ArrayList<String>();
                Row row = rowIterator.next();

                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(row.getLastCellNum() == 5) {
                        //Store row data
                        rowData.add(cell.getStringCellValue());
                    }
                }
                //Store row data in List
                data.add(rowData);
            }
            file.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    }