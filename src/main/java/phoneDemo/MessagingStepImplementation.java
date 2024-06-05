package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MessagingStepImplementation {

    public void setUpConfigrationForOpenMessagingApp(String caps12, String appPackage, String appActivity) throws MalformedURLException {
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

    public void sentMessageToAnyRandomNumber()
    {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@content-desc=\"Start chat\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id=\"com.google.android.apps.messaging:id/recipient_text_view\"]")).sendKeys("12345");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.google.android.apps.messaging:id/contact_list_view\"]/android.widget.FrameLayout")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.google.android.apps.messaging:id/compose_message_text\"]")).sendKeys("abcd");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.apps.messaging:id/send_message_button_icon\"]")).click();
    }

    public void userIsAbleToToggleTheMessagingOutgoingButton() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/title\" and @text=\"Settings\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"com.google.android.apps.messaging:id/switchWidget\"]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Switch[@resource-id=\"com.google.android.apps.messaging:id/switchWidget\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
    }

    public void userIsAbleToSendHelpAndFeedback()
    {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/title\" and @text=\"Help & feedback\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.gms:id/gh_feedback_text\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.google.android.gms:id/gf_issue_description\"]")).sendKeys("google plz fix this");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@content-desc=\"Send\"]")).click();
    }
}
