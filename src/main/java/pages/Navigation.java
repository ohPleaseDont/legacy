package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class Navigation extends BasePage {

    public Navigation(WebDriver driver) {
        super(driver);
    }

    public Navigation goToLoginPage() {
        brManager.getPage("https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru"
                + "%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");
        log.info("Navigate to login page");

        return this;
    }

    public Navigation goToDemoPage() {
        brManager.getPage("https://idemo.bspb.ru/auth?response_type=code&client_id=1&" +
                "redirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch" +
                "_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");

        return this;
    }
}
