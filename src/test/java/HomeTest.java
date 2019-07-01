import org.testng.annotations.Test;


public class HomeTest extends BaseUI {

    @Test
    public void testHomeLinkValidation() {
        mainPage.verifyLinkHomeDisplays();
    }

    @Test
    public void testDiscountAlert() {
        mainPage.verifyDiscountAlert();
    }

    @Test
    public void testBookNow() {
        mainPage.verifyLinkHomeDisplays();
        mainPage.verifyBookNow();
    }

    @Test
    public void iFrameYoutube() {
        mainPage.verifyIFrameSizeFromMainPage();
        mainPage.verifyIFrameYoutube();
    }

    @Test
    public void testHeartRomanceAboardHeade() {
        mainPage.verifyHeartRomanceAboardHeader();
    }

    @Test
    public void testHowWeWorkLinkDisplays() {
        mainPage.verifyHowWeWorkLinkDisplays();
    }

    @Test
    public void testPrettyWomenLinkDisplays() {
        mainPage.verifyPrettyWomenLinkDisplays();
    }
}
