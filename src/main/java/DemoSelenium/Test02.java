package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Test02 {

    @Test
    public void test()
    {
        System.setProperty("webDriver.crome.driver", "\"D:\\Testing\\chromedriver-win64" +
                "\\chromedriver-win64\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions act= new Actions(driver);
       WebElement elem1= driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
       act.moveToElement(elem1).build().perform();
       driver.findElement(By.xpath("//span[contains(text(),'Memberships & Subscriptions')]")).click();
       //ap_email
        driver.findElement(By.id("ap_email")).sendKeys("kishannnn");
        driver.findElement(By.id("ap_password")).sendKeys("jjjjjj");
        driver.findElement(By.className("a-button-input")).click();

        //act.



    }
}
