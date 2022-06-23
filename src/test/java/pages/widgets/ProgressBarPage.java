package pages.widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ProgressBarPage extends BasePage {

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='progressBar' and child::div[contains(@class,'bg-info') and @aria-valuenow='0']]")
    WebElement emptyProgressBar;

    @FindBy(xpath = "//div[@id='progressBar' and child::div[contains(@class,'bg-success') and @aria-valuenow='100']]")
    WebElement completeProgressBar;

    @FindBy(xpath = "//button[@id='startStopButton' and text()='Start']")
    WebElement startButton;

    @FindBy(xpath = "//button[@id='startStopButton' and text()='Stop']")
    WebElement stopButton;

    @FindBy(xpath = "//button[@id='resetButton' and text()='Reset']")
    WebElement resetButton;


    public boolean isEmptyProgressBarDisplayed() {
        return emptyProgressBar.isDisplayed();
    }

    public boolean isStopButtonDisplayed() {
        return stopButton.isDisplayed();
    }

    public boolean isStartButtonDisplayed() {
        return startButton.isDisplayed();
    }

    public boolean isCompleteProgressBarDisplayed() {
        return completeProgressBar.isDisplayed();
    }

    public void waitForProgressBarLoadingCompletion() {
        wait.until(ExpectedConditions.visibilityOf(completeProgressBar));
    }

    public void clickOnStartButton() {
        startButton.click();
    }

    public void clickOnResetButton() {
        resetButton.click();
    }

}
