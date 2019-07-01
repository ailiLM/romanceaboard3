import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FindPeople extends BaseActions {
    public FindPeople(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void testFindPeople() {
        WebElement findPeople = driver.findElement(Locators.FIND_PEOPLE_FROM_HOW_WE_WORK_PAGE);
        findPeople.click();

    }

    public void searchGirls() {
        getDropdownlistByIndex(Locators.MIN_AGE_DROPDOWN_FROM_HOW_WE_WORK_PAGE, 2);
        getDropdownlistByIndex(Locators.MAX_AGE_DROPDOWN_FROM_HOW_WE_WORK_PAGE, 32);
        getClick(Locators.AGE_SEARCH_FROM_HOW_WE_WORK_PAGE);

    }

    public void ageTableDisplays() {
        if (driver.findElement(Locators.AGE_TABLE_FROM_HOW_WE_WORK_PAGE).isDisplayed()) {
            System.out.println("Ages table displays");
        }
    }

    public void selectGirlFromList() {
        WebElement girlList = driver.findElement(Locators.GIRLS_LIST);
        if (girlList.isDisplayed()) {
            girlList.findElement(Locators.SELECTED_GIRL).click();
        }
        //driver.navigate().to(mainUrl);
    }

}

