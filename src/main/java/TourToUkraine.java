import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourToUkraine extends BaseActions {
    public TourToUkraine(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlTourToUkraine;
    String expectedUrlTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";

    public void testTourToUkraine() {
        getNavigateToLinkPage(Locators.TOUR_TO_UKRAINE_LINK);
        currentUrlTourToUkraine = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlTourToUkraine, expectedUrlTourToUkraine);
        getBackStep();
    }
}



