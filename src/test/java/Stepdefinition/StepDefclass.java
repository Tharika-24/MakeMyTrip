package Stepdefinition;

import Base.Baseclass;
import POM.BusSearchPage;
import POM.Homepage;
import POM.PassengarDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefclass extends Baseclass {

    Homepage Bus = new Homepage();
    BusSearchPage Filterpage=new BusSearchPage();
    PassengarDetails Book=new PassengarDetails();


    @Given("the user launches the MakeMyTrip website")
    public void the_user_launches_the_make_my_trip_website() {
        launch();
        Url("https://www.makemytrip.com/");
         windowMaximize();
    }

    @Given("the user clicks on the Buses option")
    public void the_user_clicks_on_the_buses_option() throws InterruptedException {
        Thread.sleep(2000);
        Bus.handleLoginPopup();

        Bus.searchBusday();
        Thread.sleep(2000);
    }

    @When("the user enters pickup location {string}")
    public void the_user_enters_pickup_location(String city) throws InterruptedException {
        Thread.sleep(2000);

        Bus.selectFromCity(city);
//        Bus.selectToCity(city);
        Bus.secondpopupclose();
    }

    @When("the user enters drop location {string}")
    public void the_user_enters_drop_location(String destiny) throws InterruptedException {
        Bus.selectToCity(destiny);
        Bus.secondpopupclose();
    }

    @When("the user selects the journey date")
    public void the_user_selects_the_journey_date() throws InterruptedException {
        Bus.selectdate();


    }

    @When("the user clicks on Search Buses")
    public void the_user_clicks_on_search_buses() {
        Bus.searcbutton();
    }

    @When("the user applies filters the list of buses should be displayed")
    public void the_user_applies_filters_the_list_of_buses_should_be_displayed() throws InterruptedException {
       Filterpage.Searchfilters();

    }



    @When("the user clicks on Select Seat the user chooses any available berth")
    public void the_user_clicks_on_select_seat_the_user_chooses_any_available_berth() throws InterruptedException {
       Filterpage.Seatselection();
       Filterpage.Boardplace();
       Filterpage.Droppoints();
    }
    @When("the user clicks on Continue")
    public void the_user_clicks_on_continue() throws InterruptedException {
        Filterpage.Conbutton();
    }
//    @Then("the user should be navigated to the traveller details page")
//    public void the_user_should_be_navigated_to_the_traveller_details_page() {
//
//    }



    @When("the user enters traveller details {string} {string}  {string} {string}")
    public void the_user_enters_traveller_details(String name, String age, String Email, String Mobile) throws InterruptedException {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Email="+Email);
        System.out.println("Mobile="+Mobile);

        Book.BookingDetails(name,age,Email,Mobile);
    }

    @When("the user clicks on Continue to payment")
    public void the_user_clicks_on_continue_to_payment() throws InterruptedException {
        Thread.sleep(1000);
        Book.handleTripAssured();
          Book.ClickContinueToPaymentpage();
    }

    @Then("the payment page should be displayed")
    public void the_payment_page_should_be_displayed() {

    }

    @Then("click on the popup option")
    public void click_on_the_popup_option() {

    }

}


