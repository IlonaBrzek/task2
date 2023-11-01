package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class MyStoreBuyingItemTest {

    @Test
    public void buyItem() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        // main page
        driver.get("https://mystore-testlab.coderslab.pl");
        WebElement signInLink = driver.findElement(By.className("user-info"));
        signInLink.click();
        // sign in page
        WebElement emailInput = driver.findElement(By.id("field-email"));
        emailInput.sendKeys("tern.verde@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("field-password"));
        passwordInput.sendKeys("CodersLab2023");
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();
        // finding sweater
        WebElement searchBox = driver.findElement(By.name("s"));
        searchBox.sendKeys("Hummingbird Printed Sweater"+ Keys.ENTER);
        WebElement sweaterButton = driver.findElement(By.className("thumbnail-top"));
        sweaterButton.click();
        // choosing options
        WebElement chooseSize = driver.findElement(By.cssSelector("#group_1 > option:nth-child(2)"));
        chooseSize.click();
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        quantity.clear();
        quantity.sendKeys(Keys.BACK_SPACE+"5"+Keys.ENTER);
        WebElement proceedButton = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        proceedButton.click();
        WebElement proceedAgainButton = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        proceedAgainButton.click();
        // Address and other confirmations
        WebElement confirmAddress = driver.findElement(By.name("confirm-addresses"));
        confirmAddress.click();
        WebElement confirmDelivery = driver.findElement(By.name("confirmDeliveryOption"));
        confirmDelivery.click();
        WebElement paymentOption = driver.findElement(By.id("payment-option-1"));
        paymentOption.click();
        WebElement termsButton = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        termsButton.click();
        WebElement placeOrder = driver.findElement(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button"));
        placeOrder.click();
        //Screenshot


    }
}
