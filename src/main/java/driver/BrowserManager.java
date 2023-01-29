package driver;

import org.openqa.selenium.WebDriver;

public class BrowserManager {

    private static final String URL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&" +
            "rever.getdirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch" +
            "_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";
    private WebDriver driver;
    private DriverManager drManager;

    public BrowserManager(WebDriver driver) {
        this.driver = driver;
        this.drManager = new DriverManager(driver);
    }

    public void reloadPage() {
        driver.navigate().refresh();
    }

    public void getPage(String url) {
        drManager.getDriver().get(url);
    }

    public void quit() {
        drManager.getDriver().quit();
    }
}