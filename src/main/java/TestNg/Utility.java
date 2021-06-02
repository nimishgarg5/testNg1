package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
    public String utilityM()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9660553898");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Nimish123");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        String tittle = driver.getTitle();

        return tittle;
    }
    public void click(String locater, WebDriver driver){
        driver.findElement(By.xpath(locater)).click();
    }
    public void enterText(String locater, WebDriver driver, String text){

    }

}
