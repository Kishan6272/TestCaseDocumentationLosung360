package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.python.antlr.ast.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class PhoneDemoStepImplimentation extends CommonUtils {

    //AndroidDriver driver=new AndroidDriver(new URL("http://192.168.43.28:4723"));
    public void setUpConfigrationForPhoneApp(String caps1 , String appPackage, String appActivity) throws MalformedURLException {
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



    public void completeTheFunctionalityOfPhoneDailer() throws MalformedURLException {

      // CommonUtils.androidDriver.get().findElement(By.id("android:id/aerr_close")).click();
        CommonUtils.androidDriver.get().findElement(By.id("com.android.dialer:id/fab")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath(
               "//android.widget.TextView[@resource-id=\"com.android.dialer:id/dialpad_key_number\" and @text=\"9\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath(
               "//android.widget.TextView[@resource-id=\"com.android.dialer:id/dialpad_key_number\" and @text=\"6\"]")).click();

       String asse="Add to a contact";
       String ui=CommonUtils.androidDriver.get().findElement(By.xpath(
               "//android.widget.TextView[@resource-id=\"com.android.dialer:id/search_action_text\" and @text=\"Add to a contact\"]")).getText();
        System.out.println(ui);
       // Assert.org.testng.Assert.assertEquals("actual", "expected", "String message");

   }

   public void addToContactSucessfull() throws InterruptedException {

       CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.android.dialer:id/bottom_nav_item_image\"])[3]")).click();
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.dialer:id/contact_name\" and @text=\"Create new contact\"]")).click();
       Thread.sleep(1000);
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@text=\"First name\"]")).sendKeys("Kishanaaqqqqqqwwqq");
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@text=\"Last name\"]")).sendKeys("Kumareqqqeee");
       //android.widget.CheckedTextView[@resource-id="android:id/text1" and @text="Work"]
       ////android.widget.Spinner[@content-desc="Phone"]1
       ////android.widget.EditText[@text="Phone"]
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Spinner[@content-desc=\"Phone\"]")).click();
       Thread.sleep(2000);
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Work\"]")).click();
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@text=\"Phone\"]")).click();
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@text=\"Phone\"]")).sendKeys("1234534224");
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.contacts:id/editor_menu_save_button\"]")).click();


   }

   public void dial_A_CustomerByName() throws InterruptedException {
       CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.android.dialer:id/bottom_nav_item_image\"])[3]")).click();
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.dialer:id/search_box_start_search\"]")).click();
       Thread.sleep(2000);
       //android.widget.TextView[@resource-id="com.android.dialer:id/search_box_start_search"] search xpath
       //android.support.v7.widget.RecyclerView[@resource-id="com.android.dialer:id/recycler_view"])[2]/android.widget.RelativeLayout
       ////android.widget.FrameLayout[@resource-id="com.android.dialer:id/incall_dialpad_container"]
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.android.dialer:id/search_view\"]")).sendKeys("Kishan Kumar");
       CommonUtils.androidDriver.get().findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.android.dialer:id/recycler_view\"]/android.widget.RelativeLayout")).click();
       Thread.sleep(4000);
      // CommonUtils.androidDriver.get().findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.android.dialer:id/recycler_view\"]/android.widget.RelativeLayout")).click();
   }

}
