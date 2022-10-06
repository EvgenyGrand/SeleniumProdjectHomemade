package homemade4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utils.BaseTestWindow;

import java.util.ArrayList;
import java.util.Set;

public class ThirdTask extends BaseTestWindow {

    @Test
    public void getCookie() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://otus.ru");
        WebElement registrationButton = driver.findElement(By.xpath("//*[@class = 'header2__auth js-open-modal']"));
        registrationButton.click();
        WebElement login = driver.findElement(By.cssSelector("input[type='text'][placeholder='Электронная почта']"));
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement buttonLK = driver.findElement(By.cssSelector("button[class='new-button new-button_full new-button_blue new-button_md']"));
        Thread.sleep(2000);
        login.clear();
        login.sendKeys("Evgeny.Grand@mail.ru");
        password.clear();
        password.sendKeys("Lufthansa12");
        buttonLK.click();
        System.out.println(driver.manage().getCookies());


    }



}

