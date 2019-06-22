
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeTest extends BaseUI {
    String currentUrlHome;
    String expectedURLHome = "https://romanceabroad.com/#";
    MainPage mainPage = new MainPage();

    @Test
    public void testHomeLinkValidation() {
    //Create object from mainPage
        mainPage.printpage();
        driver.findElement(Locators.LINK_HOME).click();
        currentUrlHome = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlHome, expectedURLHome);
        System.out.println(expectedURLHome);

    }

    @Test
    public void testDiscountAlert() {
        WebElement discountAlert = driver.findElement(Locators.DISCOUNT_ALERT_ORANGE);
        boolean discountAlertDisplayed = discountAlert.isDisplayed();
        if (discountAlertDisplayed == true) {
            System.out.println(discountAlertDisplayed);
        }
    }
    @Test
    public void testBookNow() {

        WebElement bookNow = driver.findElement(Locators.BOOK_NOW);
        boolean bookNowDisplays = bookNow.isDisplayed();
        if (bookNowDisplays == true) {
            bookNow.click();
            driver.navigate().back();
        } else {
            System.out.println("Not able to click on Book Now link");
        }
    }

    @Test
    public void testJoinForFreeNowRegistration() {
        WebElement joinForFreeNow = driver.findElement(Locators.JOIN_FOR_FREE_REGISTRATION);
        joinForFreeNow.isEnabled();
        System.out.println("Verify webelement is enabled");
        joinForFreeNow.click();
        driver.findElement(Locators.EMAIL_TEXT_FIELD).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_TEXT_FIELD).sendKeys(Data.password);
        driver.findElement(Locators.NEXT_BUTTON).click();
        driver.findElement(Locators.USERNAME_TEXT_FIELD).sendKeys(Data.username);

        WebElement days = driver.findElement(Locators.BIRTH_DATE_DAY);
        days.click();
        Actions action=new Actions(driver);
        action.moveToElement(days).perform();
        //how can I parametrize?
        driver.findElement(Locators.DAY10).click();

        WebElement month = driver.findElement(Locators.MONTH_OPTION);
        month.click();
        Actions actionMonth = new Actions(driver);
        actionMonth.moveToElement(month).perform();
        //how can I parametrize? Like store is in a list or array and to be able to pick different option anytime I run the scrit.
       driver.findElement(Locators.MAY).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("passed");

        WebElement year = driver.findElement(Locators.YEAR_OPTION);
        year.click();
        Actions actionYear = new Actions(driver);
        actionMonth.moveToElement(month).perform();
        //how can I parametrize? Like store is in a list or array and to be able to pick different option anytime I run the scrit.
        driver.findElement(Locators.YEAR1970).click();

        driver.findElement(Locators.PHONE_TEXT_FIELD).sendKeys(Data.phone);

        //WebElement location = driver.findElement(Locators.LOCATION_TEXT_FIELD);
        //location.sendKeys(Data.location);
        //Select locatioOption = new Select(driver.findElement(Locators.LOCATION_TEXT_FIELD));
        //locatioOption.selectByIndex(2);
        driver.findElement(Locators.I_CONFIRM_CHECKBOX).click();
    }

    public void getDropdownlistByIndex(By locator, int index){
        Select select=new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }

    public void getDropdownByVisibleText(By locator, String text){
        Select select = new Select(driver.findElement(locator));
        select.deselectByVisibleText(text);
    }

    public void getDropdownByValue(By locator, String value){
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }












}
