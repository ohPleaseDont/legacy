package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementsAttributes extends Elements {
    public boolean isDisplayed(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public boolean isDisplayed(WebElement element) {
        try {
            return getWebElem(ExpectedConditions.visibilityOf(element)) != null;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }
}