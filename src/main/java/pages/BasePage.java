package pages;

import driver.BrowserManager;
import driver.DriverManager;
import helpers.Button;
import helpers.ElementsAttributes;
import helpers.Input;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public abstract class BasePage {
    protected DriverManager drManager;
    protected BrowserManager brManager;
    protected Button button;
    protected ElementsAttributes elementsAttributes;
    protected Input input;

    public BasePage(WebDriver driver) {
        log.info("{} created", this.getClass().getName());
        this.drManager = new DriverManager(driver);
        this.brManager = new BrowserManager(driver);
        this.input = drManager.getInput();
        this.button = drManager.getButton();
        this.elementsAttributes = drManager.getElAttr();
    }
}

