import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day03_Dropdown {

   static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void dropdown1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
        Select option = new Select(dropdown);
        List<WebElement> list1=option.getOptions();

         Thread.sleep(1000);
        //secenegin gorunen yazisini kullanarak
        option.selectByVisibleText("Baby");

        Thread.sleep(1000);
        // secenegin valuesini kullanarak
        option.selectByValue("search-alias=audible");

        Thread.sleep(1000);
        //secenegin index numberini kullanarak
        option.selectByIndex(5);

        //Tum secenekleri almak icin
        List<WebElement> alloptions =option.getOptions();

        System.out.println(alloptions.size());

        for(WebElement e: alloptions){
            System.out.println(e.getText());
        }

        // secilen secenegi bize return eder

        System.out.println(option.getFirstSelectedOption());



    }

}
