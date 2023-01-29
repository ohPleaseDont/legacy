package pages.signin_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SigninPage extends BasePage {
    String pageURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&" +
            "rever.getdirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch" +
            "_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";

    protected static final By USERNAME_INPUT = By.xpath("//*[@id=\"login-form\"]/div[1]/input");
    protected static final By PASSWORD_INPUT = By.xpath("//*[@id=\"login-form\"]/div[2]/input");
    protected static final By SIGNING_IN_BUTTON = By.cssSelector("#login-button");
    protected static final By LOGIN_BUTTON = By.xpath("//*[@id=\"login-button\"]");
    protected static final By LOGIN_OTP_BUTTON = By.xpath("//*[@id=\"login-otp-button\"]");
    protected static final By OTP_CODE = By.xpath("//*[@id=\"otp-code\"]");
    protected static final By ALERT = By.xpath("//*[@id=\"alerts-container\"]/div[2]");

    public SigninPage(WebDriver driver) {
        super(driver);
    }

    public void insertLogin(String login) {
        input.input(USERNAME_INPUT, login);
    }

    public void insertPassword(String password) {
        input.input(PASSWORD_INPUT, password);
    }

    public void clickLoginButton() {
        button.btnClick(SIGNING_IN_BUTTON);
    }

    public String getTitle() {
        return elementsAttributes.getTitle();
    }

    public SigninPage inputCode(String code) {
        input.inputWithoutWaitingClickable(OTP_CODE, code);
        return this;
    }

    public SigninPage clickLoginOtp() {
        button.clickWithoutWaitingClickable(LOGIN_OTP_BUTTON);
        return this;
    }

    public boolean isAlertDisplayed() {
        if (elementsAttributes.isDisplayed(ALERT)) {
            return true;
        } else {
            return false;
        }
    }

    public SigninPage clearLogin() {
        input.clear(USERNAME_INPUT);
        return null;
    }

    public SigninPage clearPassword() {
        input.clear(PASSWORD_INPUT);
        return null;
    }
}
