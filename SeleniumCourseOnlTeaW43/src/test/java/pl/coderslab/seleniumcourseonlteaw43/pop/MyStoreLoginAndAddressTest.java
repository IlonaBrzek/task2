package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static pl.coderslab.seleniumcourseonlteaw43.Util.assertDisplayedAndEnabled;

public class MyStoreLoginAndAddressTest {

    @Test
    public void searchByCssSelector() {
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
        // your account page
        WebElement addressesButton = driver.findElement(By.id("addresses-link"));
        addressesButton.click();
        WebElement createNewButton = driver.findElement(By.cssSelector("[href=\"https://mystore-testlab.coderslab.pl/index.php?controller=address\"]"));
        createNewButton.click();
        // adding new address
        WebElement aliasInput = driver.findElement(By.id("field-alias"));
        assertDisplayedAndEnabled(aliasInput);
        aliasInput.sendKeys("Mrs");
        WebElement addressInput = driver.findElement(By.id("field-address1"));
        assertDisplayedAndEnabled(addressInput);
        addressInput.sendKeys("Downing Street 10");
        WebElement cityInput = driver.findElement(By.id("field-city"));
        assertDisplayedAndEnabled(cityInput);
        cityInput.sendKeys("London");
        WebElement zipInput = driver.findElement(By.id("field-postcode"));
        assertDisplayedAndEnabled(zipInput);
        zipInput.sendKeys("SW1A 2AA");
        WebElement phoneInput = driver.findElement(By.id("field-phone"));
        assertDisplayedAndEnabled(phoneInput);
        phoneInput.sendKeys("506123456");
        WebElement saveButton = driver.findElement(By.cssSelector("[type='submit']"));
        saveButton.click();

}}
