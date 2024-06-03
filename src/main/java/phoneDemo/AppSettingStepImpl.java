package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
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

        AndroidDriver driver=new AndroidDriver(new URL("http://192.168.1.2:4723"),desiredCapabilities);

        CommonUtils.androidDriver.set(driver);

    }
    @Then("do some randome testing")
    public void completeTheFunctionallityOFAppSetting() throws InterruptedException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities(map);
        map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel_6a");
        //map.put("platformName", "Android");
        map.put("platformVersion", "11");
        map.put("appPackage","com.android.settings");  // com.android.dialer
        map.put("appActivity","com.android.settings.Settings"); //".main.impl.MainActivity"

        desiredCapabilities.setCapability("appium:options",map);
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver= null;
        try {
            driver = new AndroidDriver(new URL("http://192.168.1.2:4723"),desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        CommonUtils.androidDriver.set(driver);

        driver.findElement(By.xpath(
                        "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.settings:id/recycler_view\"]/android.widget.LinearLayout[4]/android.widget.RelativeLayout"))
                .click();
        Thread.sleep(3000);
        String batteryText="100 %";
        //driver.findElement(By.id("android:id/aerr_close")).click();
        String actualBatteryText=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.settings:id/battery_percent\"]")).getText();
        System.out.println(actualBatteryText);

        driver.findElement(By.xpath(
                "//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
        driver.findElement(By.xpath(
                "//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();

        Assert.assertEquals(batteryText,actualBatteryText);

        driver.quit();

    }
    }

