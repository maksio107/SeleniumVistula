import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class TestGoogle {

    @Test
    public  void shouldOpenGooglePage () {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl/");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("Cars");
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mapy'])[2]/following::a[1]")).click();
        driver.findElement(By.linkText("The 10 best used cars to buy to get the most for your money")).click();
        driver.quit();

    }

}
