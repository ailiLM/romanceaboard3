import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    //declare objects from main class to be able to use it on test class
    MainPage mainPage;
    SearchPrettyWomen searchPrettyWomen;
    GiftsPage giftsPage;
    TourToUkraine tourToUkraine;
    FindPeople findPeople;
    PhotoPage photoPage;
    BlogPage blogPage;
    BlogsOnBlogPage blogsOnBlogPage;
    SoftAssert softAssert = new SoftAssert();


    /*used for RadioButton class
    String CURRENTurl = "https://www.computerhope.com/";*/


    @BeforeMethod
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        giftsPage = new GiftsPage(driver, wait);
        searchPrettyWomen = new SearchPrettyWomen(driver, wait);
        tourToUkraine = new TourToUkraine(driver, wait);
        findPeople = new FindPeople(driver, wait);
        photoPage = new PhotoPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        blogsOnBlogPage = new BlogsOnBlogPage(driver, wait);

        driver.get(Data.mainUrl);

        /*used for RadioButton class
        driver.get(CURRENTurl);*/
    }


    @AfterMethod
    public void afterActions() {

        //driver.quit();
    }


}



    