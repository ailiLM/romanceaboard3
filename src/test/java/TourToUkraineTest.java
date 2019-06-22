import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TourToUkraineTest extends BaseUI {
    String currentUrlTourToUkraine;
    String expectedUrlTourToUkraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";

    @Test
    public void testTourToUkraine() {

        driver.findElement(Locators.TOUR_TO_UKRAINE_LINK).click();
        currentUrlTourToUkraine = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlTourToUkraine, expectedUrlTourToUkraine);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }
}
