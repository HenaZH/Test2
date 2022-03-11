package org.example.pageGoogle;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageGoogleSearch {

    WebDriver driver;
    public PageGoogleSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(name = "q")
    private WebElement inputSearch;

    public void InputTextClearSendKeysENTER(String text){
        inputSearch.clear();
        inputSearch.sendKeys(text);
        inputSearch.sendKeys(Keys.ENTER);
    }


}
