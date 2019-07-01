import org.testng.annotations.Test;

public class PrettyWomenTest extends BaseUI {

    @Test
    public void testPeopleFoundByListView() {
        mainPage.verifyPrettyWomenLinkDisplays();
        searchPrettyWomen.selectViewsFromListViewDropdownList();
        searchPrettyWomen.verifyNumberOfPeopleFoundByListView();
    }

}
