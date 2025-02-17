package TreefeStepDefAndImpl;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TreefeStepImpl {



    public void setupConfigrationForTreefeApp(String caps1 , String appPackage, String appActivity) throws MalformedURLException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel 8 Pro API 34");
        //map.put("platformName", "Android");
        map.put("platformVersion", "14");
        map.put("appPackage",appPackage);  // com.android.dialer
        map.put("appActivity",appActivity); //".main.impl.MainActivity"

        desiredCapabilities.setCapability("appium:options",map);
      desiredCapabilities.setCapability("platformName","Android");
//        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),desiredCapabilities);

        CommonUtils.androidDriver.set(driver);
    }

    public void  open_treefe_app_and_click_icon()
    {

    }

    public void quit_the_app_driver()
    {

    }
}
