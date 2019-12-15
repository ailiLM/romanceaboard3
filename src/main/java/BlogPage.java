import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, wait);
    }
    String currentUrlBlog;


    public void verifyBlogLinkIsDisplayed() {
        getNavigateToLinkPage(Locators.BLOG_LINK);
        currentUrlBlog = driver.getCurrentUrl();
    }
    public void verifyBlogInfoFromBlogMainPage(){
        driver.findElement(By.xpath("//h1[contains(text(),'Blog')]")).isDisplayed();
    }
    }



