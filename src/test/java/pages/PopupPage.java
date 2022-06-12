package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class PopupPage {
    private static PopupPage page;
    public PopupPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }


    @FindBy(tagName = "h1")
    public WebElement headerH1;

    public static PopupPage getPage(){
        if (page == null){
            page = new PopupPage();
        }
        return page;
    }
}
