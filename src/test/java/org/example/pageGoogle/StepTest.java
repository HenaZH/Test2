package org.example.pageGoogle;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StepTest {
    WebDriver driver;
    PageGoogleSearch pageGoogleSearch;
    GoogleSearchPage googleSearchPage;

    public StepTest(WebDriver driver) {
        this.driver = driver;
        pageGoogleSearch = new PageGoogleSearch(driver);
        googleSearchPage = new GoogleSearchPage(driver);
    }

    public void verifityPageGoogle() {
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    public void openVerifityPageGoogle() {
        BaseWebDriver.openPageGoogle(driver);
        verifityPageGoogle();
    }

    public void TestInputTextSearch(String sr) {
        openVerifityPageGoogle();
        pageGoogleSearch.InputTextClearSendKeysENTER(sr);
        Assert.assertEquals(driver.getTitle(), sr + " - Поиск в Google");
    }

    public void TestInputTextSearchMama() {
        TestInputTextSearch("мама");
    }

    public void TestInputTextSearchPapa() {
        TestInputTextSearch("папа");
    }

    public void countHowManyWords(String sr) {
        int countW = googleSearchPage.countWords(sr);
        Assert.assertEquals(countW, 10);
    }

    public void countHowManyWordsMama() {
        countHowManyWords("мама");
    }

    public void countHowManyWordsPapa() {
        countHowManyWords("папа");
    }
}
