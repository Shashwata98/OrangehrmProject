import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class FirstTest extends TestBase {
    /*
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    */

    @Test
    public void test01(){
        startLoginPage().loginToPIMPage();
        //PageFactory.initElements(driver, LoginPage.class).loginToPIMPage();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test02(){

    }
}
