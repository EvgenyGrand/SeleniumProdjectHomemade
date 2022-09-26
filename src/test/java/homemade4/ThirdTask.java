package homemade4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import utils.BaseTestWindow;

import java.util.Set;

public class ThirdTask extends BaseTestWindow {

    @Test
    public void getCookie(){
        driver.manage().window().maximize();
        driver.get("https://otus.ru");
        WebElement registrationButton = driver.findElement(By.xpath("//*[@class = 'header2__auth js-open-modal']"));
        registrationButton.click();
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/form/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/form/div[3]/input"));
        WebElement buttonLK = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div[2]/form/div[4]/button"));
        login.clear();
        login.sendKeys("Evgeny.Grand@mail.ru");
        password.clear();
        password.sendKeys("Lufthansa12");
        buttonLK.click();
        Set<Cookie>cookies= driver.manage().getCookies();
        System.out.println(cookies);
    }



}

