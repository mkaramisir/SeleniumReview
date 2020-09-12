package com.techproed.tests;

import com.techproed.utilities.TestBase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String current =driver.getWindowHandle();
        driver.findElement(By.xpath("(//a)[2]")).click();

        driver.switchTo().window(current);
        Thread.sleep(5000);
        Set<String> allHandles=driver.getWindowHandles();

        for(String e: allHandles){
            if(!e.equals(current)){
                driver.switchTo().window(e);
            }
        }

        String actualTitle=driver.getTitle();
        String expectedTitle="New Window";
        Assert.assertEquals(actualTitle,expectedTitle);





    }
}
