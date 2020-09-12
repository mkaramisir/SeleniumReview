package com.techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {




     public static WebDriver driver;

     private Driver(){

     }
    public static WebDriver getDriver(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         return driver;

    }


}
