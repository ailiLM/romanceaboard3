import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BlogsOnBlogPage extends BaseActions {
    public BlogsOnBlogPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, wait);
    }
    String currentUrlBlog;

    public void verifyBlogLinkIsDisplayed() {
        getNavigateToLinkPage(Locators.BLOG_LINK);
        currentUrlBlog = driver.getCurrentUrl();
    }
    public void verifyBlogs(){
        List <WebElement> blogs = driver.findElements(By.xpath("//div[@class='info-content-block wysiwyg']//li"));
        System.out.println(blogs.size());
        for (int i=0; i<=blogs.size();i++)
        {
            //System.out.println("info");
            blogs.get(i).click();
            //driver.get(Data.mainUrl);
            blogs = driver.findElements(By.xpath("//div[@class='info-content-block wysiwyg']//li"));
        }

    }
    }



