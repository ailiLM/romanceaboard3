import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseUI {


    @Test
    public void testJoinForFreeNowRegistration() {
        mainPage.clickJoinForFreeButton();
        mainPage.firstPartOfRegistration();
        mainPage.secondPartOfRegistration();
    }
}
