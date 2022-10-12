package homemade4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTestHeadless;
import utils.BaseTestWindow;

import java.time.Duration;

public class SecondTask extends BaseTestWindow {
    @Test
    public void checkPicture() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
        WebElement scroll  = driver.findElement(By.cssSelector("input[type='search'][placeholder='Search here...']"));
        WebElement picture = driver.findElement(By.cssSelector("a[href=\"assets/images/p4.jpg\"] > div[class='content-overlay']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", picture);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(picture));
        picture.click();
        logger.info("Появилось модальное окно");
       WebElement modalPicture= driver.findElement(By.cssSelector("div[class=\"pp_pic_holder light_rounded\"]"));
       Assertions.assertEquals(true,modalPicture.isDisplayed());









    }






}
