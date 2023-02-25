package ui_tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver ){
        PageFactory.initElements(driver,this);
    }
    @FindBy (name ="search_query")
    public WebElement search;
    @FindBy (xpath = "//button[@value='Search']")
    public WebElement searchButton;

}
