package Renastech.Pages;

import Renastech.Utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentProcess extends Base_Page {

    @FindBy(xpath = "//input[@id='card_nmuber']")
    private WebElement cardNumber;
    @FindBy(id = "month")
    private WebElement expMonth;
    @FindBy(id = "year")
    private WebElement expYear;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement payButton;

    public WebElement getCardNumber() {
        return cardNumber;
    }

    public WebElement getExpMonth() {
        return expMonth;
    }

    public WebElement getExpYear() {
        return expYear;
    }

    public WebElement getCvvCode() {
        return cvvCode;
    }

    public void setPayButton(){
        CommonUtils.clickWithWait(payButton);
    }

}
