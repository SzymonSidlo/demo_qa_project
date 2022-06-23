package tests.widgets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainBannersPage;
import pages.widgets.ProgressBarPage;
import pages.widgets.WidgetsMenuPage;
import tests.BaseTest;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgressBarTest extends BaseTest {

    private MainBannersPage mainBannersPage;
    private WidgetsMenuPage widgetsMenuPage;
    private ProgressBarPage progressBarPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.PAGE_TITLE);

        mainBannersPage = new MainBannersPage(driver);
        widgetsMenuPage = new WidgetsMenuPage(driver);
        progressBarPage = new ProgressBarPage(driver);
    }

    @Test
    public void shouldProgressBarLoadCorrectly() {
        mainBannersPage.clickOnWidgetsBanner();
        widgetsMenuPage.clickOnProgressBarMenuButton();
        assertThat(progressBarPage.isEmptyProgressBarDisplayed()).isTrue();

        progressBarPage.clickOnStartButton();
        assertThat(progressBarPage.isStopButtonDisplayed()).isTrue();

        progressBarPage.waitForProgressBarLoadingCompletion();
        assertThat(progressBarPage.isCompleteProgressBarDisplayed()).isTrue();

        progressBarPage.clickOnResetButton();
        assertThat(progressBarPage.isEmptyProgressBarDisplayed()).isTrue();
        assertThat(progressBarPage.isStartButtonDisplayed()).isTrue();

    }

}
