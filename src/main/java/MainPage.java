import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BaseActions {

    String currentUrlHome;
    String expectedURLHome = "https://romanceabroad.com/#";
    String currentUrlGifts;
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";
    String currentUrlHowWeWork;
    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";
    String currentUrlPhoto;
    String expetctedUrlPhoto = "https://romanceabroad.com/media/index";
    String currentUrlPrettyWomen;
    String expectedUrlprettyWomen = "https://romanceabroad.com/users/search";


    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinForFreeButton() {

        getClick(Locators.JOIN_FOR_FREE_REGISTRATION);
    }

    public void firstPartOfRegistration() {
        driver.findElement(Locators.EMAIL_TEXT_FIELD).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_TEXT_FIELD).sendKeys(Data.password);
        driver.findElement(Locators.NEXT_BUTTON).click();
    }

    public void secondPartOfRegistration() {
        driver.findElement(Locators.USERNAME_TEXT_FIELD).sendKeys(generateNewNumber(Data.username, 10));
         /*WebElement day = driver.findElement(Locators.DAY_OPTION);
        day.click();
        getClickByMouse(day);
        getClick(Locators.DAY10);*/
        driver.findElement(Locators.DAY).click();
        driver.findElement(Locators.SELECT_DAY).click();
        /*WebElement month = driver.findElement(Locators.MONTH_OPTION);
        month.click();
        getClickByMouse(month);
        getClick(Locators.MAY);*/
        driver.findElement(Locators.MONTH_OPTION).click();
        driver.findElement(Locators.SELECT_MONTH).click();

        /*WebElement year = driver.findElement(Locators.YEAR_OPTION);
        year.click();
        getClickByMouse(year);
        getClick(Locators.YEAR1970);*/
        driver.findElement(Locators.YEAR_OPTION).click();
        driver.findElement(Locators.SELECT_YEAR).click();

        driver.findElement(Locators.PHONE_TEXT_FIELD).sendKeys(Data.phone);

        WebElement checkBoxConfirmation = driver.findElement(Locators.I_CONFIRM_CHECKBOX);
        boolean checkboxStatus = checkBoxConfirmation.isSelected();
        System.out.println(checkboxStatus + "is selected!!!");
        getClick(Locators.I_CONFIRM_CHECKBOX);
    }

    public void verifyLinkHomeDisplays() {
        getNavigateToLinkPage(Locators.LINK_HOME);
        currentUrlHome = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlHome, expectedURLHome);
        System.out.println(expectedURLHome);
    }


    public void verifyDiscountAlert() {
        getElementIsDisplayed(Locators.DISCOUNT_ALERT_ORANGE);
    }

    public void verifyBookNow() {
        getElementIsDisplayed(Locators.BOOK_NOW);
        getClick(Locators.BOOK_NOW);
        getBackStep();
    }

    public void verifyIFrameSizeFromMainPage() {
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size + " " + "iFrame number");
    }

    public void verifyIFrameYoutube() {
        WebElement element = driver.findElement(Locators.IFRAME_YOUTUBE);
        driver.switchTo().frame(element);
        getClick(Locators.OPEN_YOUTUBE_VIDEO);
        driver.switchTo().defaultContent();
    }

    public void verifyHeartRomanceAboardHeader() {
        WebElement header = driver.findElement(Locators.HEART_ROMANCE_ABOARD);
        if (header.isDisplayed()) {
            System.out.println(header);
        }
    }

    public void verifyGiftLinkDisplays() {
        getNavigateToLinkPage(Locators.GIFTS_LINK);
        currentUrlGifts = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlGifts, expectedUrlGifts);
    }
    /*public void navigateToMainPage(){
        driver.navigate().to(mainUrl);
        System.out.println("Script passed, romanceaboard homepage displays!!!");
    }*/

    public void verifyHowWeWorkLinkDisplays() {
        getNavigateToLinkPage(Locators.HOW_WE_WORK);
        currentUrlHowWeWork = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlHowWeWork, expectedUrlHowWeWork);
    }

    public void navigateToHowWeWork() {
        getNavigateToLinkPage(Locators.HOW_WE_WORK);
    }

    public void verifyPhotoLinkDisplays() {
        driver.findElement(Locators.PHOTO_LINK).click();
        currentUrlPhoto = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhoto, expetctedUrlPhoto);
    }

    public void verifyPrettyWomenLinkDisplays() {
        getNavigateToLinkPage(Locators.PRETTY_WOMEN_LINK);
        currentUrlPrettyWomen = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPrettyWomen, expectedUrlprettyWomen);
    }

}








