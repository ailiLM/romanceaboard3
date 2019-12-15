import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RegistrationPageTest extends BaseUI {

    @DataProvider(name="Registration")
    public static Object[][] testRegistration() throws Exception{
        ArrayList<Object[]> out =new ArrayList<>();
        Files.readAllLines(Paths.get("RegistratioData.csv")).stream().forEach(s ->  {
            String [] data = s.split(",");
            out.add(new Object[]{data[0], data[1]});
        });
       return out.toArray(new Object[out.size()][]);
    }

    @Test(dataProvider = "Registration")
    public void testJoinForFreeNowRegistration(String email, String password) {
        mainPage.clickJoinForFreeButton();
        mainPage.firstPartOfRegistration(email, password);
        mainPage.secondPartOfRegistration(mainPage.generateNewNumber(Data.username, 10),
                Data.day,Data.month,Data.year,Data.phone, Data.city, Data.location);
        //Assert.assertTrue((!driver.findElement(Locators.I_CONFIRM_CHECKBOX).isSelected()), "checkbox is not selected");
        //mainPage.getClick(Locators.I_CONFIRM_CHECKBOX);
        /*WebElement checkBoxConfirmation = driver.findElement(Locators.I_CONFIRM_CHECKBOX);
        if (!driver.findElement(Locators.I_CONFIRM_CHECKBOX).isSelected()) {
            checkBoxConfirmation.click();
        }
        else{
            Assert.fail("Checkbox is already selected");
        }*/
    }
}
