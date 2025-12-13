package POM;

import Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PassengarDetails extends Baseclass {

    By Name = By.name("fname");
    By personAge = By.xpath("//input[@id='age']");
    By Female = By.xpath("//div[@class='femaleTab ']");
    By Email = By.id("contactEmail");
    By Mobile = By.id("mobileNumber");
    By checkbobtn = By.xpath("(//p[@for='cb_gst_info'])[1]");
    By continueToPayment = By.xpath("//span[text()='Continue']");
    By noTripAssured = By.xpath("//span[contains(text(),\"I don't need it\")]");


    public void BookingDetails(String name, String age, String email, String mobile) throws InterruptedException {

        WebElement nameField = driver.findElement(Name);
        nameField.sendKeys(name);
        Thread.sleep(1000);

        WebElement ageField = driver.findElement(personAge);
        ageField.clear();
        ageField.sendKeys(age);
        Thread.sleep(1000);

        WebElement Gender = driver.findElement(Female);
        Gender.click();
        Thread.sleep(1000);

        WebElement emailField = driver.findElement(Email);
        emailField.sendKeys(email);
        Thread.sleep(1000);

        WebElement mobileField = driver.findElement(Mobile);
        mobileField.sendKeys(mobile);
        Thread.sleep(1000);
        WebElement check = driver.findElement(checkbobtn);
        check.click();
        Thread.sleep(1000);
    }

    public void handleTripAssured() {
        WebElement noThanks = wait.until(ExpectedConditions.elementToBeClickable(noTripAssured));
        noThanks.click();
    }

    public void ClickContinueToPaymentpage() throws InterruptedException {
//        jsScroll(800);
//        WebElement continueBtn = driver.findElement(continueToPayment);
//
//        Thread.sleep(2000);
//        continueBtn.click();
//        Thread.sleep(2000);
        jsScroll(800);
        wait.until(ExpectedConditions.elementToBeClickable(continueToPayment)).click();
    }

}



