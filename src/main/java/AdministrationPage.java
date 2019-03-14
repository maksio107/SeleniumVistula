import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrationPage {
    @FindBy(xpath = "//h1[text() = \"Projekty\"]")
    WebElement projectName;

    public boolean isProjectDisplayed(){
        return projectName.isDisplayed();

    }
}
