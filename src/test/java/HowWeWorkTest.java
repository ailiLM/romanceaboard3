import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTest extends BaseUI {
    String currentUrlHowWeWork;
    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";

    @Test
    public void testHowWeWork() {
        driver.findElement(Locators.HOW_WE_WORK).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlHowWeWork, expectedUrlHowWeWork);
    }
    @Test
    public void testFindPeople () {
        driver.findElement(Locators.HOW_WE_WORK).click();
        WebElement findPeople = driver.findElement(Locators.FIND_PEOPLE_FROM_HOW_WE_WORK_PAGE);
        findPeople.click();

        if (driver.findElement(Locators.AGE_TABLE_FROM_HOW_WE_WORK_PAGE).isDisplayed()) {
            System.out.println("Ages table displays");
        }
        Select ageDropDown = new Select(driver.findElement(Locators.MIN_AGE_DROPDOWN_FROM_HOW_WE_WORK_PAGE));
       ageDropDown.selectByIndex(2);
        Select maxAgeDropDown = new Select(driver.findElement(Locators.MAX_AGE_DROPDOWN_FROM_HOW_WE_WORK_PAGE));
        maxAgeDropDown.selectByIndex(32);

        driver.findElement(Locators.AGE_SEARCH_FROM_HOW_WE_WORK_PAGE).click();
    }

    @Test
    public void selectGirlFromList () {
        driver.findElement(Locators.HOW_WE_WORK).click();
        WebElement findPeople = driver.findElement(Locators.FIND_PEOPLE_FROM_HOW_WE_WORK_PAGE);
        findPeople.click();
        WebElement girlList = driver.findElement(Locators.GIRLS_LIST);
        boolean checkGirlList = girlList.isDisplayed();
        if (checkGirlList == true) {
            girlList.findElement(Locators.SELECTED_GIRL).click();
        }
        driver.navigate().to(mainUrl);
    }
}
