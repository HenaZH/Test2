package org.example.pageGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseWebDriver {

    private WebDriver driver;

    public BaseWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver openBrawser() {
        WebDriver driverp;
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "c:/Program Files/Java/chromedriver.exe");
        //WebDriverManager.chromedriver().setup();  // скачивает последнюю версию7777777
        driverp = new ChromeDriver();
        driverp.manage().window().maximize();
        driverp.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driverp.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driverp;
    }

    public static void openPage(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void openPageGoogle(WebDriver driver) {
        openPage(driver, "https://www.google.com/");
    }

    public static void closeBrawser(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }
}
