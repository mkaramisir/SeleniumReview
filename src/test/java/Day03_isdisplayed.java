import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_isdisplayed {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Ignore
  @Test
    public void isdisplayed(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
       WebElement header= driver.findElement(By.xpath("//*[.='Dynamic Controls']"));
      boolean isappear= header.isDisplayed();
        System.out.println("Is appear   ="+ isappear);


    }

    @Test
    public void isselected() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("check box is selected ="+checkbox.isSelected());

        checkbox.click();
        Thread.sleep(1000);
        System.out.println("check box is selected 2 ="+checkbox.isSelected());


    }
}
