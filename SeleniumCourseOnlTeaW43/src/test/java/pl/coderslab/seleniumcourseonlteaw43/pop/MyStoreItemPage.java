package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreItemPage {

    public MyStoreItemPage(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#group_1 > option:nth-child(2)")
    private WebElement chooseSize;

    @FindBy(id = "quantity_wanted")
    private WebElement quantity;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedButton;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement proceedAgainButton;

    public void submitSize () { chooseSize.click();}

    public void submitQuantity (String pieces) {
        quantity.clear();
        quantity.sendKeys(Keys.BACK_SPACE+pieces+Keys.ENTER);}

    public void addingToCart() {
        proceedButton.click();
        proceedAgainButton.click();
    }

}
