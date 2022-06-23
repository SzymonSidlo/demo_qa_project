package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ElementsMenuPage extends BasePage {

    public ElementsMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[child::span[text()='Text Box']]")
    WebElement textBoxMenuButton;

    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header' and child::div[text()='Elements']]")
    WebElement elementsMainHeader;

    public void clickOnTextBoxMenuButton() {
        wait.until(ExpectedConditions.visibilityOf(elementsMainHeader));
        textBoxMenuButton.click();
    }

}
