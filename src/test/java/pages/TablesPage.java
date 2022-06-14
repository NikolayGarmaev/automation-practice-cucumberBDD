package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class TablesPage {
    public TablesPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }


}
