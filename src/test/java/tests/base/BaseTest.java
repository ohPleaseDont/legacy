package tests.base;

import driver.BrowserManager;
import driver.DriverManager;
import driver.InitDriver;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import pages.Navigation;
import pages.confirmation_Page.ConfirmationPage;
import pages.error_Message_Page.ErrorMessagePage;
import pages.signin_Page.SigninPage;

@Slf4j
@Getter
public abstract class BaseTest {
    private WebDriver driver = InitDriver.initDriver("chrome");
    public SigninPage signinPage;
    public Navigation navigation;
    public ConfirmationPage confirmationPage;
    public ErrorMessagePage errorMessagePage;

    public DriverManager drManager;
    public BrowserManager brManager;


    public BaseTest() {
        managersInit();
        pagesInit();
    }

    private void managersInit() {
        this.drManager = new DriverManager(InitDriver.initDriver("chrome"));
        this.brManager = new BrowserManager(InitDriver.initDriver("chrome"));

        log.info("Driver manager created");
    }

    private void pagesInit() {
        signinPage = new SigninPage(driver);
        navigation = new Navigation(driver);
        confirmationPage = new ConfirmationPage(driver);
        errorMessagePage = new ErrorMessagePage(driver);

    }

    @AfterTest(alwaysRun = true)
    public void driverQuite() {
        brManager.quit();
        log.info("Driver closed");
    }
}
