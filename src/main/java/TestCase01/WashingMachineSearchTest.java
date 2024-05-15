package TestCase01;

//import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class WashingMachineSearchTest {


        WebDriver driver;

        @BeforeTest
        public void setup() {
//            System.setProperty("webdriver.chrome.driver", "\\\"D:\\\\Testing\\\\chromedriver-win64\" +\n" +
//                    "                \"\\\\chromedriver-win64\\\\chromedriver.exe\\\"");

            System.setProperty("webDriver.crome.driver", "\"D:\\Testing\\chromedriver-win64" +
                    "\\chromedriver-win64\\chromedriver.exe\"");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void searchWashingMachine() throws InterruptedException {

            driver.get("https://www.google.com");

            // When I search for "Best Washing Machine"
            driver.findElement(By.name("q")).sendKeys("Best Washing Machine");
            driver.findElement(By.name("q")).submit();


            Thread.sleep(3000);
            List<WebElement> flipkartlinks=driver.findElements(By.xpath("//a[contains(@href, 'flipkart')]"));
            List<WebElement> amazonLinks = driver.findElements(By.xpath("//a[contains(@href, 'amazon')]"));
            //System.out.println(amazonLinks.size());
            for(int i=0;i<amazonLinks.size();i++)
            {
                WebElement t1=amazonLinks.get(i);
                System.out.println(t1.getText());
            }
            Thread.sleep(3000);
          //  List<WebElement> flipkartlinks=driver.findElements(By.xpath("//a[contains(@href, 'flipkart')]"));
            System.out.println(flipkartlinks.size());
            for(int i=0;i<flipkartlinks.size();i++)
            {
                WebElement t1=flipkartlinks.get(i);
                System.out.println(t1.getText());
            }


        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }


