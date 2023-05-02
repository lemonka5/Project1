package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static Properties prop;
    public static WebDriverWait wait;
    public static WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fls = new FileInputStream("src//test//resources//application.properties");
        FileInputStream demoqa = new FileInputStream("src//test//resources//applicationDemoqa.properties");
        prop.load(fls);
        prop.load(demoqa);
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {

            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--allow-insecure-localhost");
            options.addArguments("--no-sandbox");
            driver = new ChromeDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        return driver;

    }
}

