package pages.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class FormsMenuPage extends BasePage {

    public FormsMenuPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//li[child::span[text()='Practice Form']]")
    WebElement practiceFormButton;

    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header' and child::div[text()='Practice Form']]")
    WebElement practiceFormMainHeader;


    public void clickOnPracticeFormButton() {
        practiceFormButton.click();
        wait.until(ExpectedConditions.visibilityOf(practiceFormMainHeader));
    }

}
