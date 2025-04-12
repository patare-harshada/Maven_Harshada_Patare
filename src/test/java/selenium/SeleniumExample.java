package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=4ajlOYVPxpE");
        driver.manage().window().maximize();
        driver.close();
    }
}
