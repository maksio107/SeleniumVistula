import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(className = "avatar_header")
    WebElement avatarHeader;

    @FindBy(className = "header_admin")
    WebElement administrationTools;


    public boolean isAvatarDisplayed () {
        return avatarHeader.isDisplayed();
    }

    public void toolsClick (){
        administrationTools.click();
    }



}
