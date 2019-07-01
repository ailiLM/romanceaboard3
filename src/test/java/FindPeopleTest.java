import org.testng.annotations.Test;

public class FindPeopleTest extends BaseUI {

    @Test
    public void testFindPeople() {
        mainPage.verifyHowWeWorkLinkDisplays();
        findPeople.testFindPeople();
        findPeople.ageTableDisplays();
        findPeople.searchGirls();

    }

    @Test
    public void selectGirlFromList() {
        mainPage.verifyHowWeWorkLinkDisplays();
        findPeople.testFindPeople();
        findPeople.selectGirlFromList();


    }
}