package homemade4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTestHeadless;
import utils.BaseTestWindow;

import java.util.Collections;
import java.util.List;

public class FirstTask extends BaseTestHeadless {

    @Test
    public void searchOtus(){
        driver.get("https://duckduckgo.com/");
        WebElement inputwindow = driver.findElement(By.id("search_form_input_homepage"));
        WebElement searchbutton = driver.findElement(By.id("search_button_homepage"));

        inputwindow.sendKeys("ОТУС");
        searchbutton.click();
        List<WebElement> searchResult= Collections.singletonList(driver.findElement(By.xpath("//*[@class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk']")));
        Assertions.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным ...",searchResult.get(0).getText());


    }
}
