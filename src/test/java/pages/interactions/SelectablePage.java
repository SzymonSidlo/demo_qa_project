package pages.interactions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SelectablePage extends BasePage {

    public SelectablePage(WebDriver driver) {
        super(driver);
    }

    //selektory niezaznaczone
    @FindBy(xpath = "//li[contains(@class,'group-item list') and text()='Cras justo odio']")
    WebElement inactiveCrasItem;

    @FindBy(xpath = "//li[contains(@class,'group-item list') and text()='Dapibus ac facilisis in']")
    WebElement inactiveDapibusItem;

    @FindBy(xpath = "//li[contains(@class,'group-item list') and text()='Morbi leo risus']")
    WebElement inactiveMorbiItem;

    @FindBy(xpath = "//li[contains(@class,'group-item list') and text()='Porta ac consectetur ac']")
    WebElement inactivePortaItem;

    //selektory zaznaczone
    @FindBy(xpath = "//li[contains(@class,'group-item active list') and text()='Cras justo odio']")
    WebElement activeCrasItem;

    @FindBy(xpath = "//li[contains(@class,'group-item active list') and text()='Dapibus ac facilisis in']")
    WebElement activeDapibusItem;

    @FindBy(xpath = "//li[contains(@class,'group-item active list') and text()='Morbi leo risus']")
    WebElement activeMorbiItem;

    @FindBy(xpath = "//li[contains(@class,'group-item active list') and text()='Porta ac consectetur ac']")
    WebElement activePortaItem;


    public void clickOnInactiveCrasItem() {
        inactiveCrasItem.click();
    }

//    public void clickOnInactiveDapibusItem(){
//        inactiveDapibusItem.click();
//    }

    public void clickOnInactiveMorbiItem() {
        inactiveMorbiItem.click();
    }

//    public void clickOnInactivePortaItem(){
//        inactivePortaItem.click();
//    }

    public void clickOnActiveCrasItem() {
        activeCrasItem.click();
    }

    public void clickOnActiveDapibusItem() {
        activeDapibusItem.click();
    }

    public void clickOnActiveMorbiItem() {
        activeMorbiItem.click();
    }

    public void clickOnActivePortaItem() {
        activePortaItem.click();
    }

    public boolean verifyActiveCrassItem() {
        return activeCrasItem.isDisplayed();
    }

    public boolean verifyActiveMorbiItem() {
        return activeMorbiItem.isDisplayed();
    }

    public boolean verifyInactiveCrassItem() {
        return inactiveCrasItem.isDisplayed();
    }

    public boolean verifyInactiveDapibusItem() {
        return inactiveDapibusItem.isDisplayed();
    }

    public boolean verifyInactiveMorbiItem() {
        return inactiveMorbiItem.isDisplayed();
    }


    public boolean verifyInactivePortaItem() {
        return inactivePortaItem.isDisplayed();
    }

}
