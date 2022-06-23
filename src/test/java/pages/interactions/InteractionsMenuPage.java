package pages.interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class InteractionsMenuPage extends BasePage {

    public InteractionsMenuPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//li[descendant::span[text()='Selectable']]")
    WebElement selectableMenuButton;

    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header' and child::div[text()='Selectable']]")
    WebElement selectableMainHeader;

    public void clickOnSelectableMenuButton(){
        selectableMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(selectableMainHeader));
    }

}
