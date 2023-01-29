package pages.error_Message_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ErrorMessagePage extends BasePage {

    protected static final By ERROR_LOGIN_MESSAGE = By.xpath("//*[@id=\"alerts-container\"]/div[2]");

    public ErrorMessagePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return elementsAttributes.isDisplayed(ERROR_LOGIN_MESSAGE);
    }
}