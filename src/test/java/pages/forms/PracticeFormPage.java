package pages.forms;

import model.forms.practiceform.Content;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PracticeFormPage extends BasePage {

    // UWAGA DODATKOWO TWORZE POLA OBIEKTU
    private String firstName;
    private String lastName;
    private String email;
    private int mobile;
    private String currentAddress;

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


    // Poniżej wersja nr 1
    public void sendPracticeFormContent(Content content) {
        firstnameLabel.sendKeys(content.getFirstName());
        lastNameLabel.sendKeys(content.getLastName());
        emailLabel.sendKeys(content.getEmail());
        mobileLabel.sendKeys(Integer.toString(content.getMobile()));
        currentAddressLabel.sendKeys(content.getCurrentAddress());
    }

    // UWAGA, PONIŻEJ WERSJA ALTERNATYWNA - UPROSZCZONA (bez dodatkowego obiektu)

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        firstnameLabel.sendKeys(firstName);
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        lastNameLabel.sendKeys(lastName);
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        emailLabel.sendKeys(email);
//        this.email = email;
//    }
//
//    public int getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(int mobile) {
//        mobileLabel.sendKeys(Integer.toString(mobile));
//        this.mobile = mobile;
//    }
//
//    public String getCurrentAddress() {
//        return currentAddress;
//    }
//
//    public void setCurrentAddress(String currentAddress) {
//        currentAddressLabel.sendKeys(currentAddress);
//        this.currentAddress = currentAddress;
//    }

}
