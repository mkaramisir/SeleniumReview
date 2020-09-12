package com.techproed.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {

    @BeforeMethod
    public void setup(){
        System.out.println("Setup");

    }

    @Test(priority=1)
    public void amazontest(){
        System.out.println("amazon");
    }
    @Test(priority=2)
    public void facebook(){
        System.out.println("facebook");
    }
    @Test(priority=3)
    public void google(){
        System.out.println("google");
    }
    @Test(priority=4)
    public void apple(){
        System.out.println("apple");
    }

}
