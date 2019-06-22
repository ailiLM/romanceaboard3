import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class PrettyWomenTest extends BaseUI {
    String currentUrlPrettyWomen;
    String expectedUrlprettyWomen = "https://romanceabroad.com/users/search";
    String expectedNumber = "72";

    @Test
    public void testPrettyWomenLink() {
        driver.findElement(Locators.PRETTY_WOMEN_LINK).click();
        currentUrlPrettyWomen = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPrettyWomen, expectedUrlprettyWomen);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testPeopleFoundByListView() {
        driver.findElement(Locators.PRETTY_WOMEN_LINK).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.LIST_VIEW).click();

        String number =  driver.findElement(Locators.PEOPLE_FOUND).getText();
        System.out.println(number);
        Assert.assertEquals(number, expectedNumber);
    }
}
