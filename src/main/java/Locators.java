import org.openqa.selenium.By;

public class Locators {
    //Home page
    public static final By LINK_HOME = By.xpath("//a[contains(text(),'HOME')]");
    public static final By DISCOUNT_ALERT_ORANGE = By.xpath("//div[@class='discountalert']");
    public static final By BOOK_NOW = By.xpath("//a[contains(text(),'BOOK NOW')]");

    //Registration
    public static final By JOIN_FOR_FREE_REGISTRATION= By.cssSelector("#show-registration-block");
    public static final By EMAIL_TEXT_FIELD =By.cssSelector("#email");
    public static final By PASSWORD_TEXT_FIELD = By.cssSelector("#password");
    public static final By NEXT_BUTTON = By.xpath("//div[@class='col-xs-12']//button[@class='btn btn-primary btn-block btn-lg'][contains(text(),'Next')]");
    public static final By USERNAME_TEXT_FIELD = By.xpath("//input[@id='nickname']");
    public static final By BIRTH_DATE_DAY = By.cssSelector("#daySelect");
    public static final By DAY10 = By.xpath("//ul[@class='dropdown-menu show']//a[contains(text(),'10')]");
    public static final By MONTH_OPTION = By.cssSelector("div#monthSelect");
    public static final By YEAR_OPTION = By.cssSelector("div#yearSelect");
    public static final By MAY = By.xpath("//a[contains(text(),'May')]");
    public static final By YEAR1970 = By.xpath("//a[contains(text(),'1970')]");
    public static final By LOCATION_TEXT_FIELD = By.xpath("//input[@id='country_text_352854']");
    public static final By PHONE_TEXT_FIELD = By.xpath("//input[@name='data[phone]']");
    public static final By I_CONFIRM_CHECKBOX = By.cssSelector("input#confirmation");




    //How we work page
    public static final By HOW_WE_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By FIND_PEOPLE_FROM_HOW_WE_WORK_PAGE = By.cssSelector("button#main_search_button_user_line");
    public static final By AGE_TABLE_FROM_HOW_WE_WORK_PAGE = By.xpath("//div[@class='search-box advanced']");
    public static final By MIN_AGE_DROPDOWN_FROM_HOW_WE_WORK_PAGE = By.cssSelector("select#age_min");
    public static final By MAX_AGE_DROPDOWN_FROM_HOW_WE_WORK_PAGE = By.cssSelector("select#age_max");
    public static final By AGE_SEARCH_FROM_HOW_WE_WORK_PAGE = By.cssSelector("input#main_search_button_user_advanced");
    public static final By HEART_ROMANCE_ABOARD = By.xpath("//a[@href = 'https://romanceabroad.com/']");
    public static final By GIRLS_LIST = By.xpath("//div[@class='pre-main-inner-content']");
    public static final By SELECTED_GIRL = By.xpath("//img[@alt='Marina_mari_']");



    //Pretty women
    public static final By PRETTY_WOMEN_LINK = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By LIST_VIEW = By.xpath("//i[@class='fa fa-list']");
    public static final By PEOPLE_FOUND = By.xpath("//div[@class='lh30']");


    //Gifts
    public static final By GIFTS_LINK = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By BEST_SALLERS = By.xpath("//div[contains(@class,'contrasting-block row g-bestsellers-gallery')]");
    public static final By FLOWER_BASKET_OPTION = By.xpath("//div[contains(@class,'col-xs-12 col-sm-12 col-md-3 col-lg-3')]");
    public static final By FLOWER_BASKET_DESCRIPTION = By.xpath("//h1[@class='title']");
    public static final By OPTION_TO_PAY = By.xpath("//div[@class='add-cart mb10']");


    //Photo
    public static final By PHOTO_LINK = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By ALL = By.xpath("//a[contains(@class,'b-tabs__text')]");
    public static final By SORT_BY_DROPDOWN = By.xpath("//span[@id='gallery_media_sorter']/select");

    //Tout To Ukraine
    public static final By TOUR_TO_UKRAINE_LINK = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");


    //Blog
    public static final By BLOG_LINK = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");






}
