package org.example.pageGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class GoogleSearchPage {
    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public int countWords(String search) {
        int countWord = 0;
        String text;
        search = search.toUpperCase();

        List<WebElement> elements = driver.findElements(By.className("LC20lb"));
        for (int i = 0; i < elements.size(); i++) {
            text = elements.get(i).getText().toUpperCase();
            if (text.contains(search)) countWord++;
        }
        return countWord;
    }
}
