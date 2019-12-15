import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTest extends BaseUI {
    String nameOfArticles;
    String title;

    @Test
    public void testBlogMainPage() {
        blogPage.verifyBlogLinkIsDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Blog')]")).isDisplayed(), "Blog text displays");


        //driver.navigate().to(Data.mainUrl);
    }

    @Test
    public void testArticlesAndTitles() {
        mainPage.clickTabBlog();
        List<WebElement> linksOfArticles = mainPage.collectAllLinksOfArticles();
        for (int i = 0; i < linksOfArticles.size(); i++) {

            WebElement link = linksOfArticles.get(i);
            nameOfArticles = link.getText();

            if(nameOfArticles.contains("How it works")){
                continue;
            }            if(nameOfArticles.contains("Kharkov dating agency")){
                continue;

            }if(nameOfArticles.contains("Kiev dating agency")){
                continue;
            }
            if(nameOfArticles.contains("Odessa dating agency")){
                continue;

            }

            if(nameOfArticles.contains("Mail order girls")){
                continue;
            }            if(nameOfArticles.contains("Beautiful urkainian girls")){
                continue;
            }            if(nameOfArticles.contains("Mail order girls")){
                continue;
            }
            if(nameOfArticles.contains("Real Ukrainian brides")){
                continue;
            }if(nameOfArticles.contains("Eastern European women")){
                continue;
            }if(nameOfArticles.contains("Marriage agency in Ukraine")){
                continue;
            }if(nameOfArticles.contains("Kiev dating site")){
                continue;
            }
            if(nameOfArticles.contains("Find Ukrainian girlfriend")){
                continue;
            }            if(nameOfArticles.contains("Slavic women for marriage")){
                continue;
            }
            if(nameOfArticles.contains("How to marry Ukrainian lady")){
                continue;
            }            if(nameOfArticles.contains("Free Ukrainian dating site")){
                continue;
            }
/*            if (i==3){
                continue;
            }*/
            link.click();
            title = mainPage.collectAllTitles();
            Assert.assertEquals(nameOfArticles,title);
           linksOfArticles = mainPage.collectAllLinksOfArticles();
        }

    }

}

