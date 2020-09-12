package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionClassExample extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement dclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

        Actions action = new Actions(driver);

        action.doubleClick(dclick).perform();

        Thread.sleep(10000);
        String alertmessage =driver.switchTo().alert().getText();
        System.out.println(alertmessage);
        driver.switchTo().alert().accept();
    }

    @Test
    public void goallthewaydown(){
        driver.get("https://www.amazon.com/");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).perform();
    }



}
