package helpers;

import driver.InitDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class Elements {
    private static final int DEFAULT_IMPL_WAIT_SEC = 15;
    private static final int DEF_DELAY = 600;

    protected WebDriver driver = InitDriver.initDriver("chrome");
    protected WebDriverWait waiter = new WebDriverWait(driver, DEFAULT_IMPL_WAIT_SEC);

    public WebElement getWebElem(ExpectedCondition<WebElement> webElemCond) {
        return waiter().until(webElemCond);
    }

    public WebDriverWait waiter() {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_IMPL_WAIT_SEC);
        wait.pollingEvery(Duration.ofMillis(DEF_DELAY));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.ignoring(InterruptedException.class);
        wait.ignoring(UnknownError.class);
        return wait;
    }

    public WebElement waitUntilClickable(By locator) {
        return getWebElem((ExpectedConditions.elementToBeClickable(locator)));
    }

    public WebElement waitUntilVisible(By locator) {
        return getWebElem(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}