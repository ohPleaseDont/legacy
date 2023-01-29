package helpers;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Input extends Elements {

    @Step("Insert [{text}] to input field [{locator}]]")
    public void input(By locator, String text) {
        waitUntilClickable(locator).clear();
        waitUntilClickable(locator).sendKeys(text);
    }

    @Step("Clear field")
    public void clear(By locator) {
        waitUntilClickable(locator).clear();
    }

    @Step("Clear field")
    public void customClear(By locator) {
        waitUntilVisible(locator).sendKeys(Keys.CONTROL, "a");
        waitUntilVisible(locator).sendKeys(Keys.DELETE);
    }

    @Step("Insert [{text}] to input field [{locator}]]")
    public void inputWithoutWaitingClickable(By locator, String text) {
        waitUntilVisible(locator).sendKeys(text);
    }
}