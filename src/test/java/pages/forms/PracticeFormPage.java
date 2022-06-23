package pages.forms;

import model.forms.practiceform.Content;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    WebElement firstnameLabel;

    @FindBy(id = "lastName")
    WebElement lastNameLabel;

    @FindBy(id = "userEmail")
    WebElement emailLabel;

    @FindBy(id = "userNumber")
    WebElement mobileLabel;

    @FindBy(id = "currentAddress")
    WebElement currentAddressLabel;

    @FindBy(xpath = "//label[@class='custom-control-label' and text() = 'Male']")
    WebElement maleGenderRadioButton;

    @FindBy(xpath = "//label[@class='custom-control-label' and text() = 'Sports']")
    WebElement sportHobbyCheckbox;

    @FindBy(xpath = "//label[@class='custom-control-label' and text() = 'Reading']")
    WebElement readingHobbyCheckbox;


    public void clickonMaleGenderRadioButton() {
        maleGenderRadioButton.click();
    }

    public void clickonSportHobbyCheckbox() {
        sportHobbyCheckbox.click();
    }

    public void clickOnReadingHobbyCheckbox() {
        readingHobbyCheckbox.click();
    }


    public void sendPracticeFormContent(Content content) {
        firstnameLabel.sendKeys(content.getFirstName());
        lastNameLabel.sendKeys(content.getLastName());
        emailLabel.sendKeys(content.getEmail());
        mobileLabel.sendKeys(Integer.toString(content.getMobile()));
        currentAddressLabel.sendKeys(content.getCurrentAddress());
    }

}
