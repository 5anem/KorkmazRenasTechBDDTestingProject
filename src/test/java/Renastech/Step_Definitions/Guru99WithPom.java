package Renastech.Step_Definitions;

import Renastech.Pages.Base_Page;
import Renastech.Pages.PaymentGateAway_HomePage;
import Renastech.Pages.Payment_Approvel_Page;
import Renastech.Pages.paymentProcess;
import Renastech.Utils.CommonUtils;
import Renastech.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class Guru99WithPom {

    paymentProcess paymentProcess=new paymentProcess();
    PaymentGateAway_HomePage paymentGateAway = new PaymentGateAway_HomePage();
    Payment_Approvel_Page paymentApprovel = new Payment_Approvel_Page();


    @Given("The user wants to go to Payment Gateway")
    public void the_user_wants_to_go_to_payment_gateway() {





    }

    @When("The user wants to verify that header is present as {string}")
    public void the_user_wants_to_verify_that_header_is_present_as(String ToyHeader) {
        Assert.assertEquals(paymentGateAway.getHeader().getText(),ToyHeader);

    }

    @When("The user wants to verify that the toy's price is {string}")
    public void the_user_wants_to_verify_that_the_toy_s_price_is(String ToyPrice) {
        Assert.assertTrue(paymentGateAway.getPriceHeader().getText().contains(ToyPrice));


    }

    @When("The user wants to verify that URL contains {string}")
    public void the_user_wants_to_verify_that_url_contains(String urlText) {
    Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(urlText));

    }

    @When("The user wants to choose quantity as {string}")
    public void the_user_wants_to_choose_quantity_as(String quantity) {
        paymentGateAway.setQuantity(quantity);
        CommonUtils.hardWait(10);

    }

    @When("The user wants to click on Buy Now button")
    public void the_user_wants_to_click_on_buy_now_button() {
        paymentGateAway.clickBuyNow();

    }

    @When("The user wants to verify that total payment is shown for quantity")
    public void the_user_wants_to_verify_that_total_payment_is_shown_for_quantity() {

    }

    @When("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
paymentProcess.getCardNumber().sendKeys(dataTable.get("cardnumber"));
paymentProcess.getExpMonth().sendKeys(dataTable.get("expmont"));
paymentProcess.getExpYear().sendKeys(dataTable.get("expyear"));
paymentProcess.getCvvCode().sendKeys(dataTable.get("CVVCode"));

CommonUtils.clickWithWait(paymentProcess.getCvvCode());
    }

    @When("The user wants to clik on pay button")
    public void the_user_wants_to_clik_on_pay_button() {
        paymentProcess.setPayButton();

    }

    @Then("The user wants to verify that {string} is shown")
    public void the_user_wants_to_verify_that_is_shown(String succes) {
Assert.assertEquals(paymentApprovel.getPaymentSuccessfull().getText(),succes);
    }

    @When("The user wants to choose different {string}")
    public void the_user_wants_to_choose_different(String different ){

        paymentGateAway.setQuantity(different);

    }}


