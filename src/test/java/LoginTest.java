import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
    WebDriver driver;
    WebDriverWait wait;
    By avatarHeader = By.className("avatar_header");
    String BaseURL = "http://demo.testarena.pl/";
    String ADMIN_LOGIN = "administrator@testarena.pl";
    String ADMIN_PASSWORD = "sumXQQ72$L";
    String ADMIN_WRONG_PASSWORD = "blabla";

    LoginPage loginPage;
    MainPage mainPage;
    AdministrationPage administrationPage;



    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        driver = new ChromeDriver(options);
        driver.get(BaseURL);
        wait = new WebDriverWait(driver, 10);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        administrationPage = PageFactory.initElements(driver, AdministrationPage.class);

        }



    @Test
    public void shouldLoginToTest() {
        loginPage.loginAs(ADMIN_LOGIN, ADMIN_PASSWORD);
        assert mainPage.isAvatarDisplayed();


    }


    @Test
    public void shouldLoginToTestArenaWithIncorrectPassword(){
        loginPage.loginAs(ADMIN_LOGIN, ADMIN_WRONG_PASSWORD);
        assert loginPage.isErrorDisplayed();
    }

    @Test
    public void shouldAmIInAdministrationTools () {
        loginPage.loginAs(ADMIN_LOGIN, ADMIN_PASSWORD);
        mainPage.toolsClick();
        assert administrationPage.isProjectDisplayed();

    }



    @After
    public void tearDown() {
        driver.quit();
    }

}
