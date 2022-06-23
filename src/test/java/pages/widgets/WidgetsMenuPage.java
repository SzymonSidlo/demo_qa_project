package pages.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class WidgetsMenuPage extends BasePage {

    public WidgetsMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[descendant::span[text()='Progress Bar']]")
    WebElement progressBarMenuButton;

    @FindBy(xpath = "//div[@class='pattern-backgound playgound-header' and child::div[text()='Progress Bar']]")
    WebElement progressBarMainHeader;

    public void clickOnProgressBarMenuButton() {
        progressBarMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(progressBarMainHeader));
    }

}
