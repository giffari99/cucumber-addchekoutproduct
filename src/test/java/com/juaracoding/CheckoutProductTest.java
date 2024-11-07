package com.juaracoding;

import com.juaracoding.pages.CheckoutProductPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;

public class CheckoutProductTest {

        static WebDriver driver;

        static ExtentTest extentTest;

        static CheckoutProductPage checkoutProductPage = new CheckoutProductPage();

        public CheckoutProductTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        }

        @Given("Customer click button checkout")
        public void customer_click_button_checkout(){
            Utils.delay(2);
            checkoutProductPage.setBtnCheckout();
            Utils.delay(2);
        }

        @When("Customer input firstname")
        public void customer_input_firstname(){
            checkoutProductPage.information("Juara","","");
            Utils.delay(2);
        }

        @Then("Customer click button continue")
        public void customer_click_button_continue(){
        checkoutProductPage.setBtnContinue();
            Utils.delay(2);
        }

        @Given("Customer input lastname")
        public void customer_input_lastname(){
            checkoutProductPage.information("","Coding","");
        }

        @Given("Customer input postal code")
        public void customer_input_postal_code(){
            checkoutProductPage.information("","","12630");
        }

        @Given("Customer input valid information")
        public void customer_input_valid_information(){
            checkoutProductPage.information("Juara","Coding","12630");
            Utils.delay(2);
        }


        @When("Customer click button finish")
        public void customer_click_button_finish(){
        checkoutProductPage.setBtnFinish();
            Utils.delay(2);
        }

        @Then("Customer click button back home")
        public void customer_click_button_back_home(){
        checkoutProductPage.setBtnHome();
        }


}
