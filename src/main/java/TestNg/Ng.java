package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.sql.SQLOutput;

public class Ng {

    @Test
    void nimish(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Utility ob = new Utility();
        ob.click("//*[@id=\"nav-link-accountList-nav-line-1\"]",driver);
/*
        String tittle=ob.utilityM();
        String expected = "Amazon Sign In";
        Assert.assertTrue(tittle.equals(expected));
        System.out.println("verified");
*/

    }
}
