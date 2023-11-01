package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreShoppingConfirmation {

    public MyStoreShoppingConfirmation(WebDriver driver) { PageFactory.initElements(driver, this);
    }
    @FindBy(name = "confirm-addresses")
    private WebElement confirmAddress;

    @FindBy(name = "confirmDeliveryOption")
    private WebElement confirmDelivery;

    @FindBy(id = "payment-option-1")
    private WebElement paymentOption;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsButton;

    @FindBy(css = "#payment-confirmation > div.ps-shown-by-js > button")
    private WebElement placeOrder;

    public void orderConfirmed(){
        confirmAddress.click();
        confirmDelivery.click();
        paymentOption.click();
        termsButton.click();
        placeOrder.click();
    }

}
