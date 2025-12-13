package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Baseclass {

    public static WebDriver driver;
    public static WebDriverWait wait;

    // Launch Browser
    public static void launch() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    // Load URL
    public static void Url(String url) {
        driver.get(url);
    }

    // Click element normally
    public static void click(WebElement ele) {
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
    }

    // Send text to field
    public static void sendkeys(WebElement ele, String text) {
        wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys(text);
    }

    // Hard wait (use rarely)
    public void waitFor(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    // Close browser
    public static void closebrowser() {
        driver.quit();
    }
    public static void windowMaximize(){
        driver.manage().window().maximize();
    }
    public static void Click(WebElement element){
        element.click();
    }

    // Scroll until element is visible
    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
    }

    // Scroll using JavaScript by pixel height
    public static void jsScroll(int height) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + height + ");");
    }

    // Scroll a scrollable DIV
    public static void elementScroll(WebElement element, int height) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + " + height + ";", element);
    }

    // JS Click
    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    // Scroll to element using JS (best for seat maps)
    public static void jsScrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    // Switch to newly opened tab
    public static void switchToNewWindow() {
        String parent = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
            }
        }
    }

    // Switch to tab by index
    public static void switchToTab(int index) {
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }

    // Double click
    public static void doubleClick() {
        new Actions(driver).doubleClick().perform();
    }

    // Press ESC
    public static void ESC() {
        new Actions(driver).sendKeys(Keys.ESCAPE).perform();
    }

    // Press & Release PAGE UP using Robot
    public static void pageUp() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
    }


}
