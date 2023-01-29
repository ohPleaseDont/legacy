package driver;

import helpers.Button;
import helpers.ElementsAttributes;
import helpers.Input;
import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Manages WebDriver
 */

public class DriverManager {

    private static final int DEFAULT_IMPL_WAIT_SEC = 15;
    private static final int DEF_DELAY = 600;

    @Getter
    private WebDriver driver;
    private InitDriver initDriver;

    @Getter
    private WebDriverWait driverWait;

    @Getter
    private Button button;

    @Getter
    private ElementsAttributes elAttr;

    @Getter
    private Input input;


    @Getter
    private JavascriptExecutor js;

    public DriverManager(WebDriver driver) {
        this.driver = driver;
        this.driverWait = new WebDriverWait(driver, DEFAULT_IMPL_WAIT_SEC);
        this.js = (JavascriptExecutor) driver;
        this.button = new Button(driver, driverWait);
        this.elAttr = new ElementsAttributes();
        this.input = new Input();
        ;
        this.initDriver = new InitDriver();
    }
}