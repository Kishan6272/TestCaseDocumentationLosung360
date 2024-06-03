package appiumPractise;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AppiumSettingTestCases {
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

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),cap);

        CommonUtils.androidDriver.set(driver);
        Thread.sleep(3000);


    }
}
