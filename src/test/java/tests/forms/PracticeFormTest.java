package tests.forms;

import model.forms.practiceform.Content;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainBannersPage;
import pages.forms.FormsMenuPage;
import pages.forms.PracticeFormPage;
import tests.BaseTest;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class PracticeFormTest extends BaseTest {

    private MainBannersPage mainBannersPage;
    private FormsMenuPage formsMenuPage;
    private PracticeFormPage practiceFormPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.PAGE_TITLE);

        mainBannersPage = new MainBannersPage(driver);
        formsMenuPage = new FormsMenuPage(driver);
        practiceFormPage = new PracticeFormPage(driver);
    }

    @Test
    public void shouldFillInPracticeFormContent() {
        mainBannersPage.clickOnFormsBanner();
        formsMenuPage.clickOnPracticeFormButton();

        practiceFormPage.clickonMaleGenderRadioButton();

        practiceFormPage.clickonSportHobbyCheckbox();
        practiceFormPage.clickOnReadingHobbyCheckbox();

        Content content = new Content();
        content.setFirstName("Simon");
        content.setLastName("Tester");
        content.setEmail("simontest321@interia.pl");
        content.setMobile(1234567890);
        content.setCurrentAddress("Simple Street 12, 302001 Jaipur, Rajasthan");
        practiceFormPage.sendPracticeFormContent(content);

    }

}
