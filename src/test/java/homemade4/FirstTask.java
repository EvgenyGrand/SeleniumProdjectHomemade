package homemade4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

public class FirstTask extends BaseTest {

    @Test
    public void searchOtus(){
        driver.get("https://duckduckgo.com/");
        WebElement inputwindow = driver.findElement(By.id("search_form_input_homepage"));
        WebElement searchbutton = driver.findElement(By.id("search_button_homepage"));

        inputwindow.sendKeys("ОТУС");
        searchbutton.click();
        WebElement searchresult = driver.findElement(By.linkText("Онлайн‑курсы для профессионалов, дистанционное обучение современным ..."));
        Assertions.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным ...",searchresult.getText());

    }
}
