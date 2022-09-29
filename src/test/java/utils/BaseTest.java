package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected final String ConfigDriver = null;
    protected WebDriver driver;
    protected org.apache.logging.log4j.Logger logger = LogManager.getLogger(Advice.OffsetMapping.Target.ForArray.ReadWrite.class);



        @BeforeEach
    protected void StartUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Драйвер поднят");

    }





//    @AfterEach
//    protected void End() {
//        if (driver != null)
//            driver.quit();
//    }
}


