package org.example.pageGoogle;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StepTest {
    WebDriver driver;
    PageGoogleSearch pageGoogleSearch;

    public StepTest(WebDriver driver) {
        this.driver = driver;
        pageGoogleSearch = new PageGoogleSearch(driver);
    }

    public void verifityPageGoogle() {
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    public void TestInputTextSearch(String sr) {
        BaseWebDriver.openPageGoogle(driver);
        verifityPageGoogle();
        pageGoogleSearch.InputTextClearSendKeysENTER(sr);
        Assert.assertEquals(driver.getTitle(), sr + " - Поиск в Google");
    }

    public void TestInputTextSearchMama() {
        TestInputTextSearch("мама");
    }

    public void TestInputTextSearchPapa() {
        TestInputTextSearch("папа");
    }
}
