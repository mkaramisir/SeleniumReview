import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day02_Xpath {

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


   @Test

    public void test1(){
      driver.get("http://a.testaddressbook.com/");
      driver.findElement(By.linkText("Sign in")).click();
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       List<WebElement> links = driver.findElements(By.xpath("//a"));
       System.out.println(links.size());

       driver.findElement(By.cssSelector("#session_email")).sendKeys("testtechproed@gmail.com");
       driver.findElement(By.cssSelector("#session_password")).sendKeys("Test1234!");
       driver.findElement(By.cssSelector(".btn.btn-primary")).click();

      List<WebElement> list1=driver.findElements(By.tagName("body"));
       for(WebElement e:list1){
           System.out.println(e.getText());

       }


   }

   @AfterClass
    public static void teardown(){
        driver.quit();

   }

}
