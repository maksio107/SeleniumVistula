import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    @FindBy(id = "email")
    WebElement loginInput ;

    @FindBy(id = "password")
    WebElement passwordInput ;

    @FindBy(id = "login")
    WebElement loginButton ;

    @FindBy(className = "login_form_error")
    WebElement loginError ;




    public void loginAs(String email, String password) {
        loginInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public boolean isErrorDisplayed () {
        return  loginError.isDisplayed();

    }



}
