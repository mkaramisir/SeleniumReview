package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadUploadTest extends TestBase {

    @Test
    public void dosyavarmi(){
        //su anda bulundugumuz kalasorun adini veriyor
        System.out.println(System.getProperty("user.dir"));
        //klasorun ana kullacinin dosya yolunun adini veriyot
        System.out.println(System.getProperty("user.home"));

        boolean isFolderExist= Files.exists(Paths.get("/Users/muminkaramisir/Desktop/InterviewQuestions"));
        Assert.assertTrue(isFolderExist);





    }

    @Test

    public void dosyaUpload(){
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("/Users/muminkaramisir/Desktop/projects.pptx");
        driver.findElement(By.id("file-submit")).click();
        String actualMessage=driver.findElement(By.xpath("//h3")).getText();
        String expectedMessage="File Uploaded!";
        Assert.assertEquals(actualMessage,expectedMessage);


    }

    @Test
    public void folderDowland(){
        driver.get("https://the-internet.herokuapp.com/download");

    }
}
