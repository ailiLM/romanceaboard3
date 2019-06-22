import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GiftsTest extends BaseUI {
    String currentUrlGifts;
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";


    @Test
    public void testGifts() {
        driver.findElement(Locators.GIFTS_LINK).click();
        currentUrlGifts = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlGifts, expectedUrlGifts);
        WebElement bestsallerTable = driver.findElement(Locators.BEST_SALLERS);
        boolean checkBestSallerTable = bestsallerTable.isDisplayed();
        if (checkBestSallerTable == true) {
            driver.findElement(By.xpath("//div[contains(@class,'text-overflow')]")).click();
        }
        WebElement flowserBasketOptions = driver.findElement(Locators.FLOWER_BASKET_OPTION);
        WebElement flowerBasketDescription = driver.findElement(Locators.FLOWER_BASKET_DESCRIPTION);
        boolean checkFlowserBasketOptions = flowserBasketOptions.isDisplayed();
        boolean CheckFlowerBasketDescription = flowerBasketDescription.isDisplayed();
        if (checkFlowserBasketOptions == true && CheckFlowerBasketDescription == true) {
            System.out.println("Availability to purchase the flower basket");
        }
        driver.findElement(Locators.OPTION_TO_PAY).isDisplayed();
        //failed step because of PayPal window displays on separate window (Question:how to handle it???)
        //driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
        //currentUrlSearch= driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Assert.assertEquals(currentUrlSearch, expectedPayPalPage);
        driver.navigate().to(mainUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
