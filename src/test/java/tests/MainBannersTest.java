package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainBannersPage;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class MainBannersTest extends BaseTest {

    private MainBannersPage mainBannersPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.PAGE_TITLE);

        mainBannersPage = new MainBannersPage(driver);
    }

    @Test
    public void verifyAllBannersLabels() {
        assertThat(mainBannersPage.getBannerLabels().contains("Elements")).isTrue();
        assertThat(mainBannersPage.getBannerLabels().contains("Forms")).isTrue();
        assertThat(mainBannersPage.getBannerLabels().contains("Alerts, Frame & Windows")).isTrue();
        assertThat(mainBannersPage.getBannerLabels().contains("Widgets")).isTrue();
        assertThat(mainBannersPage.getBannerLabels().contains("Interactions")).isTrue();
        assertThat(mainBannersPage.getBannerLabels().contains("Book Store Application")).isTrue();
    }

}
