package pages.confirmation_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ConfirmationPage extends BasePage {

    protected static final By CONFIRMATION_WINDOW = By.xpath("//*[@id=\"otp-code-text\"]");

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        boolean displayed = elementsAttributes.isDisplayed(CONFIRMATION_WINDOW);
        return displayed;

    }
}