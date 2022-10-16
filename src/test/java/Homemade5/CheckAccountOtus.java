package Homemade5;

import homemade4.ThirdTask;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.BaseTestWindow;

import java.util.concurrent.TimeUnit;

public class CheckAccountOtus extends BaseTestWindow {


    private final String LOGIN = "Evgeny.Grand@mail.ru";
    private final String PASSWORD = "Lufthansa12";


    @Test
    public void checkAccount() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://otus.ru");
        //Выполнение входа в личный кабинет (в page object вынести в отдельный метод)
        WebElement registrationButton = driver.findElement(By.xpath("//*[@class = 'header2__auth js-open-modal']"));
        registrationButton.click();
        WebElement login = driver.findElement(By.cssSelector("input[type='text'][placeholder='Электронная почта']"));
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement buttonLK = driver.findElement(By.cssSelector("button[class='new-button new-button_full new-button_blue new-button_md']"));
        Thread.sleep(2000);
        login.clear();
        login.sendKeys(LOGIN);
        password.clear();
        password.sendKeys(PASSWORD);
        buttonLK.click();
        logger.info("Вход в ЛК выполнен");
        Thread.sleep(2000);

        //Переход в Раздел ЛК "О себе"
        Actions action = new Actions(driver);
        WebElement dropdownlist = driver.findElement(By.cssSelector("div[class = 'header2-menu__item-wrapper header2-menu__item-wrapper__username']"));
        WebElement myAccount = driver.findElement(By.cssSelector("b[class='header2-menu__dropdown-text_name']"));
        action.moveToElement(dropdownlist).moveToElement(myAccount).click().build().perform();
        logger.info("Переход в раздел 'О себе' выполнен");


        //Заполнение полей раздела "О себе"

        //Имя
        WebElement fname = driver.findElement(By.id("id_fname"));
        fname.clear();
        fname.sendKeys("Евгений");
        //Фамилия
        WebElement lname = driver.findElement(By.id("id_lname"));
        lname.clear();
        lname.sendKeys("Чистяков");
        //Имя Латиницей
        WebElement nameLatin = driver.findElement(By.id("id_fname_latin"));
        nameLatin.clear();
        nameLatin.sendKeys("Evgenii");
        //Фамилия Латиницей
        WebElement lNAmeLatin = driver.findElement(By.id("id_lname_latin"));
        lNAmeLatin.clear();
        lNAmeLatin.sendKeys("Chistyakov");
        //Псевдоним
        WebElement id_blog_name = driver.findElement(By.id("id_blog_name"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", id_blog_name);
        id_blog_name.clear();
        id_blog_name.sendKeys("Eвгений");
        //День рождения
        WebElement dayOfBirth = driver.findElement(By.cssSelector("input[title='День рождения']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", dayOfBirth);
        dayOfBirth.clear();
        dayOfBirth.sendKeys("20.06.1989");
        //Страна
        WebElement country = driver.findElement(By.cssSelector("body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(1) > div > div.container__col.container__col_9.container__col_ssm-12 > div:nth-child(1) > div.container__col.container__col_9.container__col_md-8.container__col_middle > div > label > div"));
        country.click();
        WebElement changeCountry = driver.findElement(By.cssSelector("button[title='Россия']"));
        changeCountry.click();
        Thread.sleep(2000);
        //Город
        WebElement city = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[2]/div/label/div"));
        city.click();
        WebElement changeCity = driver.findElement(By.cssSelector("body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(1) > div > div.container__col.container__col_9.container__col_ssm-12 > div:nth-child(2) > div.container__col.container__col_9.container__col_md-8.container__col_middle > div > div > div > button:nth-child(3)"));
        changeCity.click();
        Thread.sleep(2000);
        //Уровень Английского
        WebElement englishLevel = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/label/div"));
        englishLevel.click();
        WebElement changeLevel = driver.findElement(By.cssSelector("button[title='Ниже среднего (Pre-Intermediate)']"));
        changeLevel.click();
        //Добавление контакта 1
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,1500);");
        WebElement deleteContact = driver.findElement(By.cssSelector("body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(2) > div.js-formset > div > div:nth-child(1) > div.container__col.container__col_3.container__col_md-12 > div > div.container__col.container__col_0.container__col_md-3.container__col_ssm-4 > div:nth-child(2) > button"));
        WebElement contact1 = driver.findElement(By.cssSelector("button[class='lk-cv-block__action lk-cv-block__action_md-no-spacing js-formset-add js-lk-cv-custom-select-add']"));
        contact1.click();
        Thread.sleep(2000);
        WebElement changeContact1 = driver.findElement(By.cssSelector("body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(2) > div.js-formset > div > div:nth-child(3) > div.container__col.container__col_9.container__col_ssm-12 > div > div > div > label > div > span"));
        changeContact1.click();
        Thread.sleep(2000);
        WebElement whatssapcontact = driver.findElement(By.cssSelector("body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(2) > div.js-formset > div > div:nth-child(3) > div.container__col.container__col_9.container__col_ssm-12 > div > div > div > div > div > button:nth-child(8)"));
        whatssapcontact.click();
        Thread.sleep(2000);
        WebElement inputcontact = driver.findElement(By.cssSelector("input[name='contact-1-value']"));
        inputcontact.sendKeys("+79218466331");

        // Пол
        WebElement gender = driver.findElement(By.cssSelector("select[id='id_gender']"));
        gender.click();
        WebElement changeGender = driver.findElement(By.cssSelector("option[value = 'm']"));
        Thread.sleep(2000);
        changeGender.submit();

        //закрытие браузера
        driver.quit();

        //Запуск чистого браузера
        WebDriverManager.chromedriver().setup();
        WebDriver admin = new ChromeDriver();
        admin.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info("Драйвер поднят");

        admin.manage().window().maximize();
        admin.get("https://otus.ru");
        Thread.sleep(2000);

        WebElement registrationButtonAdmin = admin.findElement(By.xpath("//*[@class = 'header2__auth js-open-modal']"));
        registrationButtonAdmin.click();
        WebElement loginAdmin = admin.findElement(By.cssSelector("input[type='text'][placeholder='Электронная почта']"));
        WebElement passwordAdmin = admin.findElement(By.cssSelector("input[type='password']"));
        WebElement buttonLKAdmin = admin.findElement(By.cssSelector("button[class='new-button new-button_full new-button_blue new-button_md']"));
        Thread.sleep(2000);
        loginAdmin.clear();
        loginAdmin.sendKeys(LOGIN);
        passwordAdmin.clear();
        passwordAdmin.sendKeys(PASSWORD);
        buttonLKAdmin.click();
        logger.info("Вход в ЛК выполнен");
        Thread.sleep(2000);

        //Переход в Раздел ЛК "О себе"
        Actions clearBrowser = new Actions(admin);
        WebElement dropdownlistAdmin = admin.findElement(By.cssSelector("div[class = 'header2-menu__item-wrapper header2-menu__item-wrapper__username']"));
        WebElement myAccountAdmin = admin.findElement(By.cssSelector("b[class='header2-menu__dropdown-text_name']"));
        clearBrowser.moveToElement(dropdownlistAdmin).moveToElement(myAccountAdmin).click().build().perform();
        logger.info("Переход в раздел 'О себе' выполнен");

        //Поиск элементов для проверок
        WebElement fnameAdmin = admin.findElement(By.id("id_fname"));
        WebElement lnameAdmin = admin.findElement(By.id("id_lname"));
        WebElement nameLatinAdmin = admin.findElement(By.id("id_lname_latin"));
        WebElement lNAmeLatinAdmin = admin.findElement(By.id("id_lname_latin"));
        WebElement id_blog_nameAdmin = admin.findElement(By.id("id_blog_name"));
        WebElement countryAdmin = admin.findElement(By.cssSelector("body > div.body-wrapper > div > div.js-lk-cv > div.container.container-padding-bottom > div.container__row > div.container__col.container__col_9.container__col_md-8.container__col_sm-12.container__col_border-left.lk-rightbar.print-block.print-wide > div > form > div:nth-child(2) > div.container__col.container__col_12 > div:nth-child(1) > div > div.container__col.container__col_9.container__col_ssm-12 > div:nth-child(1) > div.container__col.container__col_9.container__col_md-8.container__col_middle > div > label > div"));
        WebElement cityAdmin = admin.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[2]/div/label/div"));
        WebElement changeLevelAdmin = admin.findElement(By.cssSelector("button[title='Ниже среднего (Pre-Intermediate)']"));
        WebElement inputcontactAdmin = admin.findElement(By.cssSelector("input[name='contact-1-value']"));

        //Проверки
        Assertions.assertEquals("Евгений", fnameAdmin.getText());
        Assertions.assertEquals("Чистяков",lnameAdmin.getText());
        Assertions.assertEquals("Evgenii",nameLatinAdmin.getText());
        Assertions.assertEquals("Chistyakov",lNAmeLatinAdmin.getText());
        Assertions.assertEquals("Evgenii",id_blog_nameAdmin.getText());
        Assertions.assertEquals("Россия", countryAdmin.getText());
        Assertions.assertEquals("Санкт-Петербург",cityAdmin.getText());
        Assertions.assertEquals("Ниже среднего",changeLevelAdmin.getText());
        Assertions.assertEquals("+79218466331",inputcontactAdmin.getText());







    }
}

