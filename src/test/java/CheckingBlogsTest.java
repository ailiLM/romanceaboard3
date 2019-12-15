import org.testng.annotations.Test;


public class CheckingBlogsTest extends BaseUI {


    @Test
    public void verifyBlogsAreDisplayed() {
        blogsOnBlogPage.verifyBlogLinkIsDisplayed();
        blogsOnBlogPage.verifyBlogs();
    }
}
