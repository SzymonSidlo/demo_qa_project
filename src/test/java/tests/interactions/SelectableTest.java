package tests.interactions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainBannersPage;
import pages.interactions.InteractionsMenuPage;
import pages.interactions.SelectablePage;
import tests.BaseTest;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectableTest extends BaseTest {

    private MainBannersPage mainBannersPage;
    private InteractionsMenuPage interactionsMenuPage;
    private SelectablePage selectablePage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.PAGE_TITLE);

        mainBannersPage = new MainBannersPage(driver);
        interactionsMenuPage = new InteractionsMenuPage(driver);
        selectablePage = new SelectablePage(driver);
    }

    @Test
    public void shouldMarkAndVerifyItemsActivity() {
        mainBannersPage.clickOnInteractionsBanner();
        interactionsMenuPage.clickOnSelectableMenuButton();

        selectablePage.clickOnInactiveCrasItem();
        selectablePage.clickOnInactiveMorbiItem();

        assertThat(selectablePage.verifyActiveCrassItem()).isTrue();
        assertThat(selectablePage.verifyActiveMorbiItem()).isTrue();
        assertThat(selectablePage.verifyInactiveDapibusItem()).isTrue();
        assertThat(selectablePage.verifyInactivePortaItem()).isTrue();

        selectablePage.clickOnActiveCrasItem();
        selectablePage.clickOnActiveMorbiItem();

        assertThat(selectablePage.verifyInactiveCrassItem()).isTrue();
        assertThat(selectablePage.verifyInactiveMorbiItem()).isTrue();
    }
}
