package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {

    public MyStoreLoginPage(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-email")
    private WebElement emailInput;

    @FindBy(id = "field-password")
    private WebElement passwordInput;

    @FindBy(id ="submit-login")
    private WebElement signInButton;

    @FindBy(className = "user-info")
    private WebElement signInLink;

    @FindBy(name = "s")
    private WebElement searchBox;

    @FindBy(className = "thumbnail-top")
    private WebElement sweaterButton;

    public void signIn(){
        signInLink.click();
        emailInput.sendKeys("tren.verde@gmail.com");
        passwordInput.sendKeys("CodersLab2023");
        signInButton.click();
        searchBox.sendKeys("Hummingbird Printed Sweater"+ Keys.ENTER);
        sweaterButton.click();
    }

}
