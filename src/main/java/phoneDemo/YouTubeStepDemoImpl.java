package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class YouTubeStepDemoImpl {

    public void setUpConfigrationForOpenYouTube(String cap1,String AppPackage,String AppActivity) throws MalformedURLException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities(map);
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel_6a");
        //map.put("platformName", "Android");
        map.put("platformVersion", "11");
        map.put("appPackage",AppPackage);  // com.android.dialer
        map.put("appActivity",AppActivity); //".main.impl.MainActivity"

        desiredCapabilities.setCapability("appium:options",map);
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),desiredCapabilities);

        CommonUtils.androidDriver.set(driver);

    }

    public void openYouTubeThenSettingToggleDataSaver() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"You\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.youtube:id/recycler_view\"]/android.widget.LinearLayout[3]/android.widget.RelativeLayout")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"android:id/widget_frame\"])[1]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"android:id/widget_frame\"])[1]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
    }

//    public void openYouTubeThenSettingToggleAutoplay()
//    {
//          CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"You\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.youtube:id/recycler_view\"]/android.widget.LinearLayout[4]/android.widget.RelativeLayout")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
//       // CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//         CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//
//    }
//
//    public void openYouTubeThenSettingThenVideoQualityPreferanceToHigher()
//    {
//
//     CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"You\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Video quality preferences\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.RadioButton[@resource-id=\"android:id/checkbox\"])[2]")).click();
//      //  CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//       // CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//    }
//
//    public void openYouTubeThenSetting()
//    {
//        CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//
//    }
//public void openYouTubeThenSettingThenVideoQualityPreferanceToHigher()
//{
//
//    CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"You\"]")).click();
//    CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
//    CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Video quality preferences\"]")).click();
//    CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.RadioButton[@resource-id=\"android:id/checkbox\"])[2]")).click();
//    //  CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//    // CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//    CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//    CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//}
//
//    public void openYouTubeThenSettingThenVideoQualityPreferanceToHigher()
//    {
//
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"You\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Video quality preferences\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.RadioButton[@resource-id=\"android:id/checkbox\"])[2]")).click();
//        //  CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        // CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//    }
//    public void openYouTubeThenSettingThenVideoQualityPreferanceToHigher()
//    {
//
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/text\" and @text=\"You\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Video quality preferences\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.RadioButton[@resource-id=\"android:id/checkbox\"])[2]")).click();
//        //  CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        // CommonUtils.androidDriver.get().findElement(By.xpath()).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
//    }
}
