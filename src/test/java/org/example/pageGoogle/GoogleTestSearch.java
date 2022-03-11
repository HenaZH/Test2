package org.example.pageGoogle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTestSearch {
    public WebDriver driver;
    StepTest stepTestt;

    @BeforeClass(alwaysRun = true)
    public void Begin() {
        driver = BaseWebDriver.openBrawser();
        stepTestt = new StepTest(driver);
    }

    @Test(priority = 1)
    public void testUntitledTestCase1() {
        stepTestt.TestInputTextSearchMama();
    }

    @Test(priority = 0)
    public void testUntitledTestCase2() {
        stepTestt.TestInputTextSearchPapa();
    }

    @AfterClass(alwaysRun = true)
    public void End() throws InterruptedException {
        BaseWebDriver.closeBrawser(driver);
    }

}
