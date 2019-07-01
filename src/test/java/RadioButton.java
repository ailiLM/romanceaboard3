import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class RadioButton extends BaseUI{
    /*@Test
    public void selectRadioButton(){
        WebElement searchField = driver.findElement(Locators.TEXT_FIELD_RADIO_BUTTON);
        searchField.sendKeys("radio_button");
        getClick(Locators.CLICK_SEARCH_BUTTON);

        WebElement radioButton3 = driver.findElement(Locators.RADIO_BUTTON3);
        WebElement radioButton4 = driver.findElement(Locators.RADIO_BUTTON4);
        WebElement radioButton5 = driver.findElement(Locators.RADIO_BUTTON5);
        WebElement radioButton2 = driver.findElement(Locators.RADIO_BUTTON2);
        if(!radioButton3.isSelected()){
            getClick(Locators.RADIO_BUTTON3);
        }
        else{
            System.out.println("Radio button did not displays on the page");
        }
        if (radioButton3.isSelected()){
            getClick(Locators.RADIO_BUTTON4);
        }
        if (!radioButton4.isSelected()){
            getClick(Locators.RADIO_BUTTON2);
            //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
            wait.until(ExpectedConditions.elementToBeClickable(Locators.RADIO_BUTTON2));
        }
        else{
            getClick(Locators.RADIO_BUTTON4);
        }
    }
*/

}
