package ru.guzev.mihan;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yandex {

    @Test
    public void main1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru/");
        //driver.findElement(By.xpath("//*[@data-id = 'video']")).click();
        driver.findElement(By.name("text")).sendKeys("1234");
        driver.findElement(By.name("text")).sendKeys(Keys.ENTER);
        driver.quit();
    }

}