import org.testng.annotations.Test;

public class HowWeWorkTest extends BaseUI {

    @Test
    public void testFindPeople() {
        mainPage.verifyHowWeWorkLinkDisplays();

    }
}