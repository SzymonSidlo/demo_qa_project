package tests.forms;

import model.forms.practiceform.Content;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainBannersPage;
import pages.forms.FormsMenuPage;
import pages.forms.PracticeFormPage;
import tests.BaseTest;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.*;
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



        // Poniżej testy dla wersji nr 1
        Content content = new Content();
        content.setFirstName("Simon");
        content.setLastName("Tester");
        content.setEmail("simontest321@interia.pl");
        content.setMobile(1234567890);
        content.setCurrentAddress("Simple Street 12, 302001 Jaipur, Rajasthan");
        practiceFormPage.sendPracticeFormContent(content);

        assertThat(content.getFirstName().equals("Simon")).isTrue();
        assertThat(content.getLastName().equals("Tester")).isTrue();
        assertThat(content.getEmail().equals("simontest321@interia.pl")).isTrue();
        assertThat(content.getMobile()).isEqualTo(1234567890);
        assertThat(content.getCurrentAddress().equals("Simple Street 12, 302001 Jaipur, Rajasthan")).isTrue();

        // UWAGA :  PONIŻEJ TESTY DLA WERSJI ALTERNATYWNEJ- UPROSZCZONEJ (bez dodatkowego obiektu)
//        practiceFormPage.setFirstName("Simon");
//        practiceFormPage.setLastName("Tester");
//        practiceFormPage.setEmail("simontest321@interia.pl");
//        practiceFormPage.setMobile(1234567890);
//        practiceFormPage.setCurrentAddress("Simple Street 12, 302001 Jaipur, Rajasthan");
//
//        assertThat(practiceFormPage.getFirstName().equals("Simon")).isTrue();
//        assertThat(practiceFormPage.getLastName().equals("Tester")).isTrue();
//        assertThat(practiceFormPage.getEmail().equals("simontest321@interia.pl")).isTrue();
//        assertThat(practiceFormPage.getMobile()).isEqualTo(1234567890);
//        assertThat(practiceFormPage.getCurrentAddress().equals("Simple Street 12, 302001 Jaipur, Rajasthan")).isTrue();

    }
}
