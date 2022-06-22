package tests.elements;

import model.elements.textbox.Content;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainBannersPage;
import pages.elements.ElementsMenuButtons;
import pages.elements.TextBoxPage;
import tests.BaseTest;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class TextBoxTest extends BaseTest {

    private TextBoxPage textBoxPage;
    private MainBannersPage mainBannersPage;
    private ElementsMenuButtons elementsMenuButtons;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.PAGE_TITLE);

        textBoxPage = new TextBoxPage(driver);
        mainBannersPage = new MainBannersPage(driver);
        elementsMenuButtons = new ElementsMenuButtons(driver);
    }

    @Test
    public void shouldFillInTextBoxContentAndSubmit() {
        mainBannersPage.clickOnElementsBanner();
        //dodaj wait

        elementsMenuButtons.clickOnTextBoxMenuButton();

        Content content = new Content();
        content.setFullName("Simon The Snare");
        content.setEmail("simon123@wp.pl");
        content.setCurrentAddress("Straight Street 11 , 39300 Acapulco");
        content.setPremanentAddress("S/A");
        textBoxPage.sendTextBoxContent(content);

        assertThat(textBoxPage.isFullOutputFrameDisplayed()).isTrue();
    }

    @Test
    public void shouldNotBeAbleToSubmitWithoutContent() {
        mainBannersPage.clickOnElementsBanner();
        //dodaj wait
        elementsMenuButtons.clickOnTextBoxMenuButton();
        textBoxPage.clickOnSubmitButton();

        assertThat(textBoxPage.isAnyOutputFrameDisplayed()).isFalse();
    }


}
