package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ClockDemoStepImpl {

    public void setUpConfigrationForClockApp(String cap,String appPackage,String appActivity) throws MalformedURLException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel_6a");
        //map.put("platformName", "Android");
        map.put("platformVersion", "11");
        map.put("appPackage",appPackage);  // com.android.dialer
        map.put("appActivity",appActivity); //".main.impl.MainActivity"

        desiredCapabilities.setCapability("appium:options",map);
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),desiredCapabilities);

        CommonUtils.androidDriver.set(driver);
    }

    public void startStopWatchAndReset(){

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@text=\"Stopwatch\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Start\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@content-desc=\"Reset\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@content-desc=\"Share\"]")).click();
       // CommonUtils.androidDriver.get().findElement(By.xpath("")).click();

    }


    public void startClockAndSetAlarm(){

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@text=\"Alarm\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@content-desc=\"8:30 AM\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.Switch[@resource-id=\"com.google.android.deskclock:id/onoff\"])[1]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.Switch[@resource-id=\"com.google.android.deskclock:id/onoff\"])[1]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.Switch[@resource-id=\"com.google.android.deskclock:id/onoff\"])[2]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.Switch[@resource-id=\"com.google.android.deskclock:id/onoff\"])[2]")).click();
       // CommonUtils.androidDriver.get().findElement(By.xpath("")).click();

    }
//
//    public void startStopWatchAndReset(){
//
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//
//    }
//
//    public void startStopWatchAndReset(){
//
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//
//    }
}
