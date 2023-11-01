package pl.coderslab.seleniumcourseonlteaw43.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourseonlteaw43.pop.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

public class BuyingItemWithMyStoreSteps {

    private WebDriver driver;
    private MyStoreLoginPage myStoreLoginPage;
    private MyStoreItemPage myStoreItemPage;
    private MyStoreShoppingConfirmation myStoreShoppingConfirmation;


    @Given("Page MyStore opened in browser")
    public void openedInABrowser() {
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        this.driver.get("https://mystore-testlab.coderslab.pl");
        this.myStoreLoginPage = new MyStoreLoginPage(driver);
        this.myStoreItemPage = new MyStoreItemPage(driver);
        this.myStoreShoppingConfirmation = new MyStoreShoppingConfirmation(driver);

    }

    @When("User is signed in and item is found")
    public void loginAndPassword() {myStoreLoginPage.signIn();}

    @And("Size M is chosen")
    public void chooseSize() {myStoreItemPage.submitSize();}

    @And("Quantity {string} is chosen")
    public void quantity(String pieces) {myStoreItemPage.submitQuantity(pieces);}

    @Then("Product is successfully added to cart")
    public void submitCart() {myStoreItemPage.addingToCart();}

    @And("Address, Delivery, payment options are confirmed")
    public void submitOrder() {myStoreShoppingConfirmation.orderConfirmed();}

    @And("Screenshot is done")
    public void saveScreenshot() throws IOException {
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test", "zadanie2-"+currentDateTime+".png"));
    }

    }

