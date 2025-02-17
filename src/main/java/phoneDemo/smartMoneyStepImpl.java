package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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
        CommonUtils.androidDriver.get().navigate().back();
       // CommonUtils.androidDriver.get().navigate().refresh();
       // try{CommonUtils.androidDriver.clone(1);}catch (Exception e) {}
    }

    public static void open_Smart_Money_from_app_Screen() throws InterruptedException {
        Thread.sleep(10000);
       // CommonUtils.androidDriver.get().navigate().refresh();
        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Smart Money\"]")).click();
     //   CommonUtils.androidDriver.get().manage().timeouts().
        CommonUtils.androidDriver.get().navigate().back();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Smart Money\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]/android.view.ViewGroup")).click();
        Thread.sleep(2000);
        //CommonUtils.androidDriver.get().findElement(By.xpath(""))
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText")).sendKeys("9615611835");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"I have read and agreed with the Terms & Conditions and Privacy Policy\"]/android.widget.ImageView")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]/android.view.ViewGroup")).click();
    }
}
