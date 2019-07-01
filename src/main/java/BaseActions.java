import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }


    public static String generateNewNumber(String name, int length) {
        return name + RandomStringUtils.random(length, "test123");
    }


    public void getDropdownlistByIndex(By locator, int index) {
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }

    public void getDropdownByVisibleText(By locator, String text) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }

    public void getDropdownByValue(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public void getClick(By locator) {
        driver.findElement(locator).click();
    }

    public void getClickByMouse(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void getNavigateToLinkPage(By locator) {
        driver.findElement(locator).click();
    }

    public void getElementIsDisplayed(By locator) {
        WebElement element = driver.findElement(locator);
        boolean elementDisplayed = element.isDisplayed();
        if (element.isDisplayed()) {
            System.out.println(elementDisplayed + " " + "element is displayed");
        } else {
            System.out.println(elementDisplayed + " " + "is not displayed");
        }
    }

    public void getTextString(By locator, String text) {
        driver.findElement(locator).getText();
        System.out.println(text);
    }

    public void getTextNumber(By locator, int number) {
        driver.findElement(locator).getText();
        System.out.println(number);
    }

    public void getBackStep() {
        driver.navigate().back();
    }


}
