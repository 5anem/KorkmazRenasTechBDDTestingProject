package Renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_Approvel_Page extends Base_Page{

        @FindBy(xpath = "//h2[.='Payment successfull!']")
        private WebElement paymentSuccessfull;

        public WebElement getPaymentSuccessfull() {
            return paymentSuccessfull;
        }
    }


