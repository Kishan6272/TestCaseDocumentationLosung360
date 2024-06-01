package appiumPractise;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ApkInstall {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //
        //gather desired capabilities


//        {
//            "appium:automationName": "UiAutomator2",
//                "platformName": "Android",
//                "appium:deviceName": "pixel_7",
//                "appium:platformVersion": "11",
//                "appium:appPackage": "com.google.android.apps.messaging",           "com.google.android.apps.messaging.ui.ConversationListActivity"
//                "appium:appActivity": "com.google.android.apps.messaging.ui.ConversationListActivity"
//        }

       Map<String,String> map=new HashMap<>();

        DesiredCapabilities capabilities=new DesiredCapabilities();
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel_6a");
      //  map.put( "platformName", "Android");
        //capabilities.setCapability(Platform.WIN11);
        //  capabilities.setCapability("appiumversion","2.5.4");
       // capabilities.setCapability("browserName","chrome");
        map.put("platformVersion", "11");
        map.put("appPackage", "com.google.android.apps.messaging");
        map.put("appActivity",
                "com.google.android.apps.messaging.ui.ConversationListActivity");
        capabilities.setCapability("appium:options",map);
        capabilities.setCapability("platformName","Android");


      // URL url= URI.create("http://127.0.0.1:8200/wd/hub").toURL();

        //
        //android.widget.Button[@content-desc="Start chat"]

        AndroidDriver driver=new AndroidDriver(new URL("http://192.168.43.28:4723"),capabilities);

       CommonUtils.androidDriver.set(driver);
       //CommonUtils.androidDriver.get().f

//        //WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/"), capabilities);
//        AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hubecho %JAVA_H%"), capabilities);
//        //AppiumDriver driver = new AppiumDriver(url, capabilities);
//        //AndroidDriver driver1 = new AndroidDriver(url, capabilities);
        Thread.sleep(4000);

        //driver.quit();
    }
}
