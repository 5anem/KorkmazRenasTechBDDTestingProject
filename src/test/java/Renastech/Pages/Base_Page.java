package Renastech.Pages;

import Renastech.Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {



    public Base_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
