package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "input[name='username']") private WebElement userName;
    @FindBy(css = "input[name='password']") private WebElement password;

    
}
