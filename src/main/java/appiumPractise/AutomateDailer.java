package appiumPractise;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AutomateDailer {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


//        {
//            "appium:automationName": "UiAutomator2",
//                "platformName": "Android",
//                "appium:deviceName": "pixel_7",
//                "appium:platformVersion": "11",
//                "appium:appPackage": "com.google.android.apps.messaging",           "com.google.android.apps.messaging.ui.ConversationListActivity"
//                "appium:appActivity": "com.google.android.apps.messaging.ui.ConversationListActivity"
//        }
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities cap=new DesiredCapabilities();
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel_6a");
        //map.put("platformName", "Android");
        map.put("platformVersion", "11");
        map.put("appPackage","com.android.dialer");  // com.android.dialer
        map.put("appActivity","com.android.dialer.main.impl.MainActivity"); //".main.impl.MainActivity"

        cap.setCapability("appium:options",map);
        cap.setCapability("platformName","Android");

        AndroidDriver driver=new AndroidDriver(new URL("http://192.168.43.28:4723"),cap);

        CommonUtils.androidDriver.set(driver);
        Thread.sleep(3000);

        //09810012345
        //dialpad xpath //android.widget.ImageButton[@content-desc="key pad"]
        driver.findElement(By.id("android:id/aerr_close")).click();
        driver.findElement(By.id("com.android.dialer:id/fab")).click();
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.android.dialer:id/dialpad_key_number\" and @text=\"9\"]")).click();
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.android.dialer:id/dialpad_key_number\" and @text=\"6\"]")).click();

        String asse="Add to a contact";
        String ui=driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.android.dialer:id/search_action_text\" and @text=\"Add to a contact\"]")).getText();
        Assert.assertEquals(ui,asse);

        driver.quit();
    }
}
