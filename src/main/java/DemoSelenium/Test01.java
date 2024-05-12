package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {

    @Test
    public void test01()
    {
        System.setProperty("webDriver.crome.driver", "\"D:\\Testing\\chromedriver-win64" +
                "\\chromedriver-win64\\chromedriver.exe\"");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        String currentWindowHandle=driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);
        //driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        driver.findElement(By.partialLinkText("Bolt")).click();
    }

}
