package com.techproed.tests;

import com.techproed.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sun.security.util.AuthResources_ja;

import java.util.concurrent.TimeUnit;


 /*
    There two different alerts. Html alert and JSalert.If it is html alert we may use web element.

     */


public class Alert {


    @Test
    public void TestAlert(){
        WebDriverManager.chromedriver().setup();
        WebDriver getDriver = new ChromeDriver();

        getDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        getDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebDriverWait wait = new WebDriverWait(getDriver,300);

        WebElement jsalert = getDriver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        wait.until(ExpectedConditions.elementToBeClickable(jsalert));
        jsalert.click();
        String text01 =getDriver.switchTo().alert().getText();
        System.out.println(text01);
        getDriver.switchTo().alert().accept();

    }

}
