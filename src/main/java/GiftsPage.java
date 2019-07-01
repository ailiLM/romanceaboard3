import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftsPage extends BaseActions {
    public GiftsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void verifyBestSallerTableDisplays() {
        WebElement bestsallerTable = driver.findElement(Locators.BEST_SALLERS);
        if (bestsallerTable.isDisplayed()) {
            getClick(Locators.BEST_SALLERS);
        }
    }

    public void verifyAbilityToPurchaseFlowerBasket() {
        WebElement flowserBasketOptions = driver.findElement(Locators.FLOWER_BASKET_OPTION);
        WebElement flowerBasketDescription = driver.findElement(Locators.FLOWER_BASKET_DESCRIPTION);
        if (flowserBasketOptions.isDisplayed() && flowerBasketDescription.isDisplayed()) {
            System.out.println("Availability to purchase the flower basket");
        }
    }

    public void verifyOptionToPayDisplays() {
        if (driver.findElement(Locators.OPTION_TO_PAY).isDisplayed()) {
        }
    }


}


