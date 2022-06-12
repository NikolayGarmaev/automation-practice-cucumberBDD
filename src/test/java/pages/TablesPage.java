package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class TablesPage {
    private static TablesPage page;
    public TablesPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }



    public static TablesPage getPage(){
        if (page == null){
            page = new TablesPage();
        }
        return page;
    }
}
