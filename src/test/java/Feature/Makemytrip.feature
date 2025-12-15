Feature: Book Cheapest Bus

  Scenario Outline: User books the cheapest bus successfully

    Given the user launches the MakeMyTrip website
    Then click on the popup option
    And the user clicks on the Buses option
    When the user enters pickup location "<FromCity>"
    And the user enters drop location "<ToCity>"
    And the user selects the journey date
    And the user clicks on Search Buses


    When the user applies filters the list of buses should be displayed
    And the user clicks on Select Seat the user chooses any available berth
    And the user clicks on Continue

#    Then the user should be navigated to the traveller details page
    When the user enters traveller details "<Name>" "<Age>"  "<Emailid>" "<Mobile>"
    And the user clicks on Continue to payment
    Then the payment page should be displayed

    Examples:
      | FromCity | ToCity    | Name    | Age | Emailid                   | Mobile     |
      | Madurai  | Bangalore | Tharika | 30  | Cheruku.tharika@gmail.com | 9100384842 |



