import org.testng.annotations.Test;


public class GiftsTest extends BaseUI {


    @Test
    public void testGifts() {
        mainPage.verifyGiftLinkDisplays();
        giftsPage.verifyBestSallerTableDisplays();
        giftsPage.verifyAbilityToPurchaseFlowerBasket();
        giftsPage.verifyOptionToPayDisplays();


    }

}
