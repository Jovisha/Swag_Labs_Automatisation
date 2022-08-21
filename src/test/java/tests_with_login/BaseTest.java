package tests_with_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriverManager.firefoxdriver().setup();
        // Uncomment the line of code below, to run the tests through the Google Chrome browser
        //WebDriverManager.chromedriver().setup();

        driver = new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));
        // Uncomment the line of code below, to run the tests through the Google Chrome browser
        //driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(),
                        PropertyManager.getInstance().getPassword());
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}
