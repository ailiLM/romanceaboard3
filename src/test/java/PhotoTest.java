import org.testng.annotations.Test;

public class PhotoTest extends BaseUI {

    @Test
    public void testViewCount() {
        mainPage.verifyPhotoLinkDisplays();
        photoPage.VerifyALLFromUkranianWomensPhoto();
        photoPage.verifySortByDropdownList();
        photoPage.selectViewCountFromSortByDropdownlist();
        driver.navigate().to(Data.mainUrl);
    }
}
