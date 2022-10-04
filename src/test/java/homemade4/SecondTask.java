package homemade4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTestWindow;

import java.time.Duration;

public class SecondTask extends BaseTestWindow {
    @Test
    public void checkPicture() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
        WebElement scroll  = driver.findElement(By.cssSelector("#home > div > div > div > form > input[type=search]"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        scroll.sendKeys(Keys.PAGE_DOWN);
        WebElement picture = driver.findElement(By.xpath("/html/body/section[2]/div/ul[2]/li[4]/span/a/div[1]"));
        Thread.sleep(1000);
        picture.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        driver.getWindowHandles();
        Thread.sleep(2000);
        logger.info("Появилось модальное окно");
        WebElement modalPictures=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div/div/div[2]/div[1]"));
        Assertions.assertEquals(true,modalPictures.isDisplayed());
        logger.info("Тест завершен");







    }






}
