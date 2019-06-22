import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BlogTest extends BaseUI {
    String currentUrlBlog;
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";

    @Test
    public void testBlog() {
        driver.findElement(Locators.BLOG_LINK).click();
        currentUrlBlog = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}