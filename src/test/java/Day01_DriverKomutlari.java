import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_DriverKomutlari {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        String expectedTitle="Google";
        driver.navigate().back();
        driver.navigate().forward();
        Assert.assertEquals(expectedTitle,driver.getTitle());
        driver.navigate().to("http://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();
        driver.quit();
    }



}
