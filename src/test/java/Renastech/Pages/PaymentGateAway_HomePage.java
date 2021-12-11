package Renastech.Pages;

import Renastech.Utils.CommonUtils;
import Renastech.Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentGateAway_HomePage extends Base_Page {

    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement header;
    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement priceHeader;
    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDrop;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNowButton;

    public WebElement getHeader(){
        return header;
    }

    public WebElement getPriceHeader(){
        return priceHeader;
    }

    public void setQuantity(String setQuantity){

        Select select=new Select(quantityDrop);
        select.selectByValue(setQuantity);

    }
    public void clickBuyNow(){
        CommonUtils.clickWithWait(buyNowButton);
    }
}
