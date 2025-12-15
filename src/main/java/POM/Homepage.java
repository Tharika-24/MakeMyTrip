package POM;

import Base.Baseclass;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;


public class Homepage extends Baseclass {


    By searchbox = By.xpath("//span[text()='Buses']");
    By closePopup = By.xpath("//span[@class='commonModal__close']");
    By Fromcity = By.xpath("//label[@for='fromCity']");
    By Frominput = By.xpath("//input[@placeholder='From']");
    //    By chennaiCity = By.xpath("//ul//li//span[contains(text(),'Chennai')]");
    By ToCity = By.xpath("//label[@for='toCity']");
    By Toinput = By.xpath("//input[@placeholder='To']");
    By BangaloreCity = By.xpath("//span[normalize-space()='Bangalore, Karnataka']");
    By popupclose = By.xpath("//img[@alt='minimize']");

    By searchdate = By.xpath("//div[@class='DayPicker-Day'][5]");

//    By Traveldate = By.xpath("//span[contains(text(),'Travel Date')]");
    By Search = By.xpath("//button[@data-cy='submit']");


    public void searchBusday() {
        WebElement clickbus = driver.findElement(searchbox);
        clickbus.click();
    }

    public void handleLoginPopup() {
        try {
            WebElement popup = driver.findElement(closePopup);

            if (popup.isDisplayed()) {

                popup.click();
            }
        } catch (Exception e) {
            System.out.println("Popup not displayed, continuing test...");
        }
    }

    public void selectFromCity(String cityName) throws InterruptedException, IOException {

//        FileInputStream excell = new FileInputStream("C:\\Users\\Thari\\eclipse-workspace\\Makemytrip\\Data\\Test data.xlsx");
//        Workbook book = new XSSFWorkbook(excell);
//        Sheet sheet = book.getSheet("travel");
//        Row row = sheet.getRow(1);
//        Cell cell = sheet.getRow(1).getCell(0);
//        String stringCellValue = cell.getStringCellValue();


        Thread.sleep(1000);
        WebElement from = driver.findElement(Fromcity);
        from.click();
        sendkeys(from, cityName);
        Thread.sleep(1000);
        WebElement input = driver.findElement(Frominput);
        Thread.sleep(2000);
        input.sendKeys(cityName);
        Thread.sleep(2000);
        input.sendKeys(Keys.DOWN);
        input.sendKeys(Keys.ENTER);


    }

    public void selectToCity(String destination) throws InterruptedException {

//        Thread.sleep(2000);
//        WebElement Reach = driver.findElement(ToCity);
//        Reach.click();
        WebElement input1 = driver.findElement(Toinput);
        Thread.sleep(2000);
        input1.sendKeys(destination);
        Thread.sleep(2000);
        input1.sendKeys(Keys.DOWN);
        input1.sendKeys(Keys.ENTER);


    }

    public void secondpopupclose() throws InterruptedException {
//        Thread.sleep(1000);
//        WebElement close = driver.findElement(popupclose);
//         close.click();

        try {
            WebElement popup1 = driver.findElement(popupclose);

            if (popup1.isDisplayed()) {

                popup1.click();
            }
        } catch (Exception e) {
            System.out.println("Popup not displayed, continuing test...");
        }
    }

    public void selectdate() throws InterruptedException {
//               Thread.sleep(1000);
//            WebElement travel = driver.findElement(Traveldate);
//            Thread.sleep(2000);
//              travel.click();
        Thread.sleep(2000);
        WebElement date = driver.findElement(searchdate);
        Thread.sleep(2000);
//            date.sendKeys(day);
        date.click();
    }

    public void searcbutton() {

        WebElement S = driver.findElement(Search);
             S.click();

    }

}








