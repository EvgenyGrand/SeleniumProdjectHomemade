package homemade4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.BaseTestWindow;

public class SecondTask extends BaseTestWindow {
    @Test
    public void checkPicture(){
        driver.manage().window().fullscreen();
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
        WebElement scroll  = driver.findElement(By.cssSelector("#home > div > div > div > form > input[type=search]"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        scroll.sendKeys(Keys.PAGE_DOWN);
        WebElement picture = driver.findElement(By.xpath("//*[@ src='assets/images/p4.jpg']"));






    }






}
