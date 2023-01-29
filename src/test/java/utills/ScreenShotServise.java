package utills;

import driver.InitDriver;
import io.qameta.allure.Attachment;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotServise {
    static Logger log = Logger.getRootLogger();

    @Attachment
    public static byte[] saveScreenshot() {
        log.error("Make screenshot");
        return ((TakesScreenshot) InitDriver.initDriver("chrome")).getScreenshotAs(OutputType.BYTES);
    }

}
