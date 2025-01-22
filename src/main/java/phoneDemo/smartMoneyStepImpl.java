package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class smartMoneyStepImpl {


    public void setUpConfigrationForSmartMoney(String cap,String App) throws MalformedURLException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
       // map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel 6a");
       // map.put("platformName", "Android");
        map.put("platformVersion", "11");
        map.put("app",App);  // com.android.dialer
       // map.put("appActivity",appActivity); //".main.impl.MainActivity"

        desiredCapabilities.setCapability("appium:options",map);
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),desiredCapabilities);

        CommonUtils.androidDriver.set(driver);
    }


    public void app_screen_is_launched_select_environment() throws InterruptedException {   Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@text=\"dft-stg\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
    }
}
