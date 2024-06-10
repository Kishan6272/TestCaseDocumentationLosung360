package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AppSettingStepImpl {



    public void setUpConfigrationForOpenApp(String caps1,String AppPackage, String AppActivity) throws MalformedURLException {
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

    public void completeTheFunctionallityOfDisplaySetting() throws InterruptedException {






        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[5]/android.widget.RelativeLayout"))
                .click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath(
                "//android.widget.Switch[@content-desc=\"Dark theme\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath(
                "//android.widget.Switch[@content-desc=\"Dark theme\"]")).click();


        CommonUtils.androidDriver.get().findElement(By.xpath(
                "//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath(
                "//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
      //

    }

    public void enableDisableDoNotDisturbButton() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Volume, vibration, Do Not Disturb\"]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.settings:id/zen_mode_settings_turn_on_button\"]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.settings:id/zen_mode_settings_turn_off_button\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();

    }

    public void accountSettingsTurnOffAndOnData() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[11]/android.widget.RelativeLayout")).click();
        //Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
      //  CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();

    }
    public void clickOnSdCardAndViewSideNaveBar() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Storage\"]")).click();
        //Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[5]/android.widget.RelativeLayout")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Audio\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Documents\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Show roots\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"sdk_gphone_x86\"]")).click();
        //  CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();

    }
    public void onTheDataSaverButton() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout")).click();
        //Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[6]/android.widget.RelativeLayout")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[6]/android.widget.RelativeLayout")).click();
        //androidx.recyclerview.widget.RecyclerView[@resource-id="com.android.settings:id/recycler_view"]/android.widget.LinearLayout[6]/android.widget.RelativeLayout
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switch_widget\"]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"com.android.settings:id/switch_widget\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();


    }

    public void ableToToggleButtonManageAppsAutomatically() throws InterruptedException {
        //Thread.sleep(3000);
        scrollUpAndDown();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[4]/android.widget.RelativeLayout")).click();
//        //Thread.sleep(1000);
//        CommonUtils.androidDriver.get().findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
//        Thread.sleep(1000);
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();


    }

    public void scrollUpAndDown() throws InterruptedException {
       // CommonUtils.androidDriver.get().findElement(By.xpath(""));
        Dimension size= CommonUtils.androidDriver.get().manage().window().getSize();

        int startX=size.getWidth()/2;
        int startY=size.getHeight()/2;

        int endX=startX;
        int endY=(int)(size.getHeight()*1.0);

        System.out.println(endY);


        PointerInput finger1= new PointerInput(PointerInput.Kind.TOUCH,"finger1");

        Sequence sequence=new Sequence(finger1,1)
                .addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),startX,startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1,Duration.ofSeconds(2)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(200),PointerInput.Origin.viewport(),endX,endY))
                .addAction(new Pause(finger1,Duration.ofSeconds(2)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        CommonUtils.androidDriver.get().perform(Collections.singletonList(sequence));

        Thread.sleep(2000);

    }

    public void scrollDownAndUp()
    {
    }


    }

