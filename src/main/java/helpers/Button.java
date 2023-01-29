package helpers;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends Elements {
    public Button(WebDriver driver, WebDriverWait waiter) {
        this.driver = driver;
        this.waiter = waiter;
    }

    @Step("Click on an element: [{locator}]")
    public void btnClick(By locator) {
        waitUntilVisible(locator);
        waitUntilClickable(locator).click();
    }

    @Step("Click element without waiting clickable")
    public void clickWithoutWaitingClickable(By locator) {
        waitUntilVisible(locator).click();
    }
}