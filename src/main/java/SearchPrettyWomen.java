import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPrettyWomen extends BaseActions {
    public SearchPrettyWomen(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String expectedNumber = "People found: 72";


    public void selectViewsFromListViewDropdownList() {
        getDropdownByVisibleText(Locators.LIST_VIEW, "Views");
    }

    public void verifyNumberOfPeopleFoundByListView() {

        String number = driver.findElement(Locators.PEOPLE_FOUND).getText();
        System.out.println(number);
        Assert.assertEquals(number, expectedNumber);
    }


}


