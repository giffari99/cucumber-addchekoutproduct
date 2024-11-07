package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutProductPage {

    WebDriver driver;

    public CheckoutProductPage(){
    driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@name='checkout']")
    private WebElement btnCheckout;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement btnHome;


public void information(String firstname, String lastname, String postalcode){

    if(this.firstName.getText() != null || this.lastName.getText() != null || this.postalCode.getText() != null)
    Utils.delay(1);
    this.firstName.clear();
    this.lastName.clear();
    this.postalCode.clear();


    this.firstName.sendKeys(firstname);
    Utils.delay(1);
    this.lastName.sendKeys(lastname);
    Utils.delay(1);
    this.postalCode.sendKeys(postalcode);
}





    public void setBtnCheckout(){
        btnCheckout.click();
    }

    public void setFirstName(String firstname){
        firstName.sendKeys(firstname);
    }

    public void setLastName(String lastname){
        lastName.sendKeys(lastname);
    }

    public void setPostalCode(String postalcode){
        postalCode.sendKeys(postalcode);
    }

    public void setBtnContinue(){
        btnContinue.click();
    }

    public void setBtnFinish(){
        btnFinish.click();
    }

    public void setBtnHome(){
        btnHome.click();
    }


}
