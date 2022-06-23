package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class MainBannersPage extends BasePage {

    public MainBannersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='card-body']/child::h5")
    List<WebElement> banersLabels;

    @FindBy(xpath = "//div[@class='card mt-4 top-card' and descendant::h5[text()='Elements']]")
    WebElement elementsBanner;

    @FindBy(xpath = "//div[@class='card mt-4 top-card' and descendant::h5[text()='Forms']]")
    WebElement formsBanner;

    @FindBy(xpath = "//div[@class='card mt-4 top-card' and descendant::h5[text()='Interactions']]")
    WebElement interactionsBanner;

    @FindBy(xpath = "//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]")
    WebElement widgetsBanner;


    public List<String> getBannerLabels() {
        return banersLabels.stream()
                .map(el -> el.getText().trim())
                .collect(Collectors.toList());
    }

    public void clickOnElementsBanner() {
        elementsBanner.click();
    }

    public void clickOnFormsBanner() {
        formsBanner.click();
    }

    public void clickOnInteractionsBanner() {
        interactionsBanner.click();
    }

    public void clickOnWidgetsBanner() {
        widgetsBanner.click();
    }


}
