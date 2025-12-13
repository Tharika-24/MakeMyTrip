package POM;

import Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BusSearchPage extends Baseclass {

    By AcFilter = By.xpath("(//p[text()='AC'])[2]");
    By SeatType = By.xpath("//span[@class='sleeperIcon appendRight5']");
    By Pickupmore = By.xpath("(//span[contains(text(),'Show all')])[1]");
    By LocationToPick = By.xpath("//li[@class='appendBottom20'][1]");
    By SelectBus = By.xpath("//button[@data-testid='select-seats'][1]");
    By price = By.xpath("//div[@aria-label='Sort by Price ascending']");
//    By Seatselection = By.xpath("(//div[@class='SeatMapContainer_seat__FPUJ3 undefined'])[43]");
    By Boardingpont=By.xpath("//div[@class='PickUpDropSelection_pickDropAddress__JcRY2'][1]");
    By Dropingpoint=By.xpath("(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[2]");
    By ContinueButton=By.xpath("//button[text()='Continue']");
    By allSeats = By.xpath("//img[@src='/bus-mmt-next/_next/image?url=%2Fbus-mmt-next%2FSleeper_Available.png&w=64&q=75']");


    public void Searchfilters() throws InterruptedException {
        Thread.sleep(2000);
        WebElement Ac = driver.findElement(AcFilter);
        Ac.click();
        Thread.sleep(1000);
        WebElement sleeper = driver.findElement(SeatType);
        sleeper.click();
        Thread.sleep(1000);

        WebElement showmoreFrom = driver.findElement(Pickupmore);
        showmoreFrom.click();
        WebElement boardingpoint = driver.findElement(LocationToPick);
        Thread.sleep(2000);
        boardingpoint.click();

        WebElement lowest = driver.findElement(price);
        lowest.click();
        Thread.sleep(2000);


        WebElement Seat = driver.findElement(SelectBus);
        Seat.click();
        Thread.sleep(2000);
    }

    public void Seatselection() throws InterruptedException {

       Thread.sleep(1000);
        jsScroll(800);
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Seats = driver.findElement(allSeats);
        click(Seats);




//        // Get all seats
//        List<WebElement> seats = wait.until(
//                ExpectedConditions.visibilityOfAllElementsLocatedBy(allSeats)
//        );
//
//        List<WebElement> availableSeats = new java.util.ArrayList<>();
//
//        // Loop to collect ONLY available seats
//        for (WebElement seat : seats) {
//            try {
//                WebElement img = seat.findElement(By.tagName("img")); // available seat has <img>
//                if (img.isDisplayed()) {
//                    availableSeats.add(seat);
//                }
//            } catch (Exception e) {
//                // Unavailable seat – skip
//            }
//        }
//
//        if (availableSeats.isEmpty()) {
//            System.out.println("No available seats found!");
//            return;
//        }
//
//        // Pick random seat
//        Random random = new Random();
//        WebElement randomSeat = availableSeats.get(random.nextInt(availableSeats.size()));
//
//        // Scroll to random seat
//        jsScrollToElement(randomSeat);
//        Thread.sleep(800);
//
//        // Click random seat
//        randomSeat.click();
//
//        System.out.println("Random seat selected!");
    }


    public void Boardplace() throws InterruptedException {

        WebElement Meeting = driver.findElement(Boardingpont);
        Meeting.click();
        Thread.sleep(1000);

    }

    public void Droppoints() throws InterruptedException {
        WebElement drop = driver.findElement(Dropingpoint);
        drop.click();
        Thread.sleep(2000);
    }

    public void Conbutton() throws InterruptedException {
        jsScroll(800);

        WebElement Continue = driver.findElement(ContinueButton);
         Thread.sleep(1000);
        Continue.click();
        Thread.sleep(2000);
    }
}

