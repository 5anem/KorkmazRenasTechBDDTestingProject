Feature: Making a payment
  Background:
    Given The user wants to go to Payment Gateway
  @Smoke
  Scenario: Verify that expected header
    When The user wants to verify that header is present as "Mother Elephant With Babies Soft Toy"
  @Smoke
  Scenario: Verify that toy's price
    When The user wants to verify that the toy's price is "$20"
  @Smoke
  Scenario:  Verify that url contains "payment-gateway"
    When The user wants to verify that URL contains "payment-gateway"
  @Regression
  Scenario: Verify that you can successfully buy 5 toys
    When The user wants to choose quantity as "5"
    And The user wants to click on Buy Now button
    And The user wants to verify that total payment is shown for quantity
    And The user wants to enter payment information as
      |cardnumber    |1111222233334444|
      |expmont       |    12      |
      |expyear       |    2023    |
      |CVVCode       |    234     |
    And The user wants to clik on pay button
    Then The user wants to verify that "Payment successfull!" is shown
  @Regression
  Scenario Outline:
    When The user wants to choose different "<quantity>"
    And  The user wants to click on Buy Now button
    And The user wants to enter payment information as
      |cardnumber    |1111222233334444|
      |expmont       |    12      |
      |expyear       |    2023    |
      |CVVCode       |    234     |
    And The user wants to clik on pay button
    Then The user wants to verify that "Payment successfull!" is shown

    Examples:
      |quantity|
      |5       |
      |8       |
      |9       |
      |2       |
      |4       |