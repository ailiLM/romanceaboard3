import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HeartRomanceAboardTest extends BaseUI {

    @Test
    public void testHeartRomanceAboardHeader() {
        WebElement header = driver.findElement(Locators.HEART_ROMANCE_ABOARD);
        boolean headerIsDisplayed = header.isDisplayed();
        if (headerIsDisplayed == true) {
            System.out.println(headerIsDisplayed);
        }
    }
}
