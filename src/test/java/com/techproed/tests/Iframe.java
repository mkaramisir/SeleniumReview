package com.techproed.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {

    /*
    driver.switchto.defaultContent() ==> return main page
     */

    @Test
    public void iframeTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(0).switchTo().frame(1);
        String text=driver.findElement(By.id("content")).getText();

        System.out.println(text);





    }

}
