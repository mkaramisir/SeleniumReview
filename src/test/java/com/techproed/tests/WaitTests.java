package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTests extends TestBase {


    @Test
    public void implicitlywaitTest(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement message =driver.findElement(By.id("message"));
        wait.until(ExpectedConditions.visibilityOf(message));
        String expectedMessage="It's gone!";
        String actualMessage=message.getText();
        Assert.assertEquals(actualMessage,expectedMessage);



    }
}
