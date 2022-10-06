package homemade4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTestHeadless;
import utils.BaseTestWindow;

import java.time.Duration;

public class SecondTask extends BaseTestHeadless {
    @Test
    public void checkPicture() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
        WebElement scroll  = driver.findElement(By.cssSelector("input[type='search'][placeholder='Search here...']"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        scroll.sendKeys(Keys.PAGE_DOWN);
        WebElement picture = driver.findElement(By.cssSelector("a[href=\"assets/images/p4.jpg\"] > div[class='content-overlay']"));
        Thread.sleep(1000);
        picture.click();
        logger.info("Появилось модальное окно");
        WebElement modalPicture= driver.findElement(By.cssSelector("body > div.pp_pic_holder.light_rounded > div.pp_content_container > div > div > div > div.pp_fade > div.pp_hoverContainer"));
        System.out.println(modalPicture.getAttribute("width"));









    }






}
