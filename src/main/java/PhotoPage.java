import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotoPage extends BaseActions {
    public PhotoPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void VerifyALLFromUkranianWomensPhoto() {
        WebElement all = driver.findElement(Locators.ALL);

        if (all.isEnabled()) {
            System.out.println("All is enabled");
        }
        all.click();
    }

    public void verifySortByDropdownList() {
        getClick(Locators.SORT_BY_DROPDOWN);
    }

    public void selectViewCountFromSortByDropdownlist() {
        getDropdownlistByIndex(Locators.SORT_BY_DROPDOWN, 1);
    }

}



