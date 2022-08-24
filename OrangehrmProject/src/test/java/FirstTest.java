import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test01(){
        Browser browser = new Browser();

    }
}
