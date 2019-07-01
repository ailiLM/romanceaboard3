import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, wait);
    }
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    String currentUrlBlog;


    public void verifyBlogLinkIsDisplayed() {
        getNavigateToLinkPage(Locators.BLOG_LINK);
        currentUrlBlog = driver.getCurrentUrl();
    }
    }



