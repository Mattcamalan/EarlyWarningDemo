package ui_tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);
     }

     @FindBy (xpath = "//div[@class='wt-height-full']/div/a[contains(@class, 'listing-link')]")
    public WebElement searchResults;

}
