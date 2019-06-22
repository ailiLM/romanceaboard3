import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PhotoTest extends BaseUI {
    String currentUrlPhoto;
    String expetctedUrlPhoto = "https://romanceabroad.com/media/index";

    @Test
    public void testViewCount() {
        driver.findElement(Locators.PHOTO_LINK).click();
        currentUrlPhoto = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhoto, expetctedUrlPhoto);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement all = driver.findElement(Locators.ALL);
        boolean checkAll = all.isEnabled();

        if (checkAll) {
            System.out.println("All is enabled");
        }
        if (checkAll) {
            all.click();

            driver.findElement(Locators.SORT_BY_DROPDOWN).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Select date = new Select(driver.findElement(Locators.SORT_BY_DROPDOWN));
            date.selectByVisibleText("Views count");
        }
        driver.navigate().to(mainUrl);
    }
}
