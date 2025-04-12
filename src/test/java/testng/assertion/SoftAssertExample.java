package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifyscaceDemoApplication() throws InterruptedException {
        SoftAssert sa=new SoftAssert();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        WebElement swageLab= driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement productElement= driver.findElement(By.xpath("//span[text()='Products']"));

        sa.assertFalse(swageLab.isDisplayed(),"Swag Lab Element should display");
        sa.assertEquals(productElement.getText(),"product","Product Element should display");
        sa.assertAll();
        driver.close();
    }
}
