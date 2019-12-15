import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    String currentUrlHome;
    String currentUrlGifts;
    String currentUrlHowWeWork;
    String currentUrlPhoto;
    String currentUrlPrettyWomen;


    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinForFreeButton() {

        getClick(Locators.JOIN_FOR_FREE_REGISTRATION);
    }

    public void firstPartOfRegistration(String email, String password) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_TEXT_FIELD).sendKeys(email);
        driver.findElement(Locators.PASSWORD_TEXT_FIELD).sendKeys(password);
        driver.findElement(Locators.NEXT_BUTTON).click();
    }

    public void secondPartOfRegistration(String username, String phone, String day, String month,
                                         String year, String city, String location) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.USERNAME_TEXT_FIELD).sendKeys(username);
        /*driver.findElement(Locators.LIST_DAY).click();
        clickValueOflist(Locators.LIST_VALUE_DAY, day);
        driver.findElement(Locators.LIST_MONTH).click();
        clickValueOflist(Locators.LIST_VALUE_MONTH, month);
        driver.findElement(Locators.LIST_YEAR).click();
        clickValueOflist(Locators.LIST_VALUE_YEAR, year);
*/
        driver.findElement(Locators.PHONE_TEXT_FIELD).sendKeys(phone);

        driver.findElement(Locators.AUTOFILLING_FORM).sendKeys(city);
        clickValueOflist(Locators.LIST_VALUE_LOCATION,location);


        /*boolean checkboxStatus = checkBoxConfirmation.isSelected();
        System.out.println(checkboxStatus + "is selected!!!");*/
        //or using Assert class

    }


    public void clickValueOflist(By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        for (int i = 0; i < elements.size(); i++) {
            WebElement elementOfList = elements.get(i);
            String value = elementOfList.getText();
            if (value.contains(text)) {
                elementOfList.click();
            }
            elements = driver.findElements(locator);
        }

    }


    public void verifyLinkHomeDisplays() {
        getNavigateToLinkPage(Locators.LINK_HOME);
        currentUrlHome = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlHome, Data.expectedURLHome);
        System.out.println(Data.expectedURLHome);
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
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
    }
    /*public void navigateToMainPage(){
        driver.navigate().to(mainUrl);
        System.out.println("Script passed, romanceaboard homepage displays!!!");
    }*/

    public void verifyHowWeWorkLinkDisplays() {
        getNavigateToLinkPage(Locators.HOW_WE_WORK);
        currentUrlHowWeWork = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);
    }

    public void navigateToHowWeWork() {
        getNavigateToLinkPage(Locators.HOW_WE_WORK);
    }

    public void verifyPhotoLinkDisplays() {
        driver.findElement(Locators.PHOTO_LINK).click();
        currentUrlPhoto = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhoto, Data.expetctedUrlPhoto);
    }

    public void verifyPrettyWomenLinkDisplays() {
        getNavigateToLinkPage(Locators.PRETTY_WOMEN_LINK);
        currentUrlPrettyWomen = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPrettyWomen, Data.expectedUrlprettyWomen);
    }

    public void clickTabBlog() {
        driver.findElement(Locators.HOW_WE_WORK).click();
    }

    public List<WebElement> collectAllLinksOfArticles() {
        List<WebElement> linksOfArticles = driver.findElements(Locators.LINKS_OF_ARTICLES);
        return linksOfArticles;
    }

    public String collectAllTitles() {
        String titles = driver.findElement(Locators.H1_TITLE).getText();
        return titles;
    }

}












