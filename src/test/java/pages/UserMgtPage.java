package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class UserMgtPage {
    public UserMgtPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }
    @FindBy(id = "Select-role")
    public WebElement selectRole;
}