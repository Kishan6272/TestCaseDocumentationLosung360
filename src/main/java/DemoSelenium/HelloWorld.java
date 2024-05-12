package DemoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) {

        System.setProperty("webDriver.crome.driver","\"D:\\Testing\\chromedriver-win64" +
                "\\chromedriver-win64\\chromedriver.exe\"");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        //driver.navigate().to();
        String title=driver.getTitle();
        System.out.println(title);

        // captur the url of web page
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


    }
}
