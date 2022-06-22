package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ElementsMenuButtons extends BasePage {

    public ElementsMenuButtons(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[child::span[text()='Text Box']]")
    WebElement textBoxMenuButton;

    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header' and child::div[text()='Elements']]")
    WebElement elementsMainHeader;

    public void clickOnTextBoxMenuButton() {
        textBoxMenuButton.click();
    }

}
