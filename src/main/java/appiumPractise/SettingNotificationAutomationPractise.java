package appiumPractise;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SettingNotificationAutomationPractise {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities cap=new DesiredCapabilities();
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel_6a");
        //map.put("platformName", "Android");
        map.put("platformVersion", "11");
        map.put("appPackage","com.android.settings");  // com.android.dialer
        map.put("appActivity","com.android.settings.Settings"); //".main.impl.MainActivity"

        cap.setCapability("appium:options",map);
        cap.setCapability("platformName","Android");

        AndroidDriver driver=new AndroidDriver(new URL("http://192.168.43.28:4723"),cap);

        CommonUtils.androidDriver.set(driver);
        Thread.sleep(3000);

        driver.findElement(By.xpath(
                "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[3]/android.widget.RelativeLayout")).click();
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Notifications\"]")).click();
        driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Android Setup\"]")).click();
        driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Android Setup\"]")).click();
        driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Digital Wellbeing\"]")).click();
        driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Digital Wellbeing\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
    }
}
