package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class PopupPage {
    public PopupPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(tagName = "h1")
    public WebElement headerH1;

}
