import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Day01_OrnekAmazon {
    @Test
    public void tes1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby stroller"+ Keys.ENTER);
        driver.findElement(By.xpath("(//img[@data-image-index='2'])[1]")).click();
       String price= driver.findElement(By.xpath("//span[@id='priceblock_saleprice']")).getText();
        System.out.println(price);
        Actions action = new Actions(driver);
        driver.quit();


    }
}
