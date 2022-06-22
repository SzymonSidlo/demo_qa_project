package pages.elements;

import model.elements.textbox.Content;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='output' and child::div[contains(@class,'border') and child::p[@id='name' and following-sibling::p[@id='email']and following-sibling::p[@id='currentAddress']and following-sibling::p[@id='permanentAddress']]]]")
    WebElement outputFrameWithFullContent;

    @FindBy(xpath = "//div[@id='output' and child::div[contains(@class,'border')]]")
    WebElement outputFrameWithAnyContent;

    @FindBy(id = "userName")
    WebElement fullNameInput;

    @FindBy(id = "userEmail")
    WebElement emailInput;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currentAddressInput;


    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permanentAddressInput;

    @FindBy(id = "submit")
    WebElement submitButton;

    public void sendTextBoxContent(Content content) {
        fullNameInput.sendKeys(content.getFullName());
        emailInput.sendKeys(content.getEmail());
        currentAddressInput.sendKeys(content.getCurrentAddress());
        permanentAddressInput.sendKeys(content.getPremanentAddress());
        submitButton.click();
    }

    public boolean isFullOutputFrameDisplayed() {
        return outputFrameWithFullContent.isDisplayed();
    }

    public boolean isAnyOutputFrameDisplayed() {
        boolean isDisplayed = false;
        try {
            isDisplayed = outputFrameWithAnyContent.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return isDisplayed;
    }


    public void clickOnSubmitButton() {
        submitButton.click();
    }

}
