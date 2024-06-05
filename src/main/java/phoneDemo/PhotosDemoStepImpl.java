package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.python.antlr.ast.Str;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class PhotosDemoStepImpl {

    public void setUpConfigrationForPhotosApp(String cap, String appPackage, String appActivity) throws MalformedURLException {
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

    public void openPhotosAndUpdate()
    {   //android.widget.Button[@resource-id="android:id/button1"]
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Options\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.vending:id/0_resource_name_obfuscated\" and @text=\"Settings\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[1]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View[2]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.android.vending:id/0_resource_name_obfuscated\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switch_widget\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
    }


   // public void
}
