package phoneDemo;

import appiumPractise.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WebViewBrowserDefaultEmulatorStepImpl {

    public  void setUpConfigrationForWebView(String caps12, String appPackage, String appActivity) throws MalformedURLException {
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

    public void openWebViewAndPerformSomeRandomeTesting() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"About WebView\"]")).click();
        //CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Clear cache\"]")).click();
        Thread.sleep(1000);
       // CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"About WebView\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Animation test\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"org.chromium.webview_shell:id/rotate\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"org.chromium.webview_shell:id/rotate\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"org.chromium.webview_shell:id/scale\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"org.chromium.webview_shell:id/scale\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"org.chromium.webview_shell:id/translate\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"org.chromium.webview_shell:id/translate\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.SeekBar[@resource-id=\"org.chromium.webview_shell:id/view_alpha\"]")).click();
    }


    public  void  openWebViewThenPrintSomeRandomeTesting() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"About WebView\"]")).click();
        //CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Clear cache\"]")).click();
        Thread.sleep(1000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Print\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@text=\"Paper size:\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Spinner[@resource-id=\"com.android.printspooler:id/destination_spinner\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.printspooler:id/title\" and @text=\"All printers…\"]")).click();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
       // CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.View[@resource-id=\"com.android.printspooler:id/page_content\"]")).click();

    }

    public void openWebViewBrowserDefaultEmulatorThenYoutubeThroughThat() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]")).clear();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]"))
                .sendKeys("google.com");

        //CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Clear cache\"]")).click();

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Load URL\"]")).click();
        Thread.sleep(3000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@text=\"Google apps\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.webkit.WebView[@text=\"Google\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
    }


    public void openWebViewBrowserDefaultEmulatorThenFlipkartLoginUsingMobile() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]")).clear();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]"))
                .sendKeys("flipkart.com");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Load URL\"]")).click();

        Thread.sleep(2000);


        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.View[@text=\"Login\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.View[@resource-id=\"container\"]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[3]")).sendKeys("7235845659");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@text=\"svg+xml;base64,PHN2ZyB3aWR0aD0iMTUiIGhlaWdodD0iMTUiIHZpZXdCb3g9IjAgMCAxNSAxNSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj48cGF0aCBkPSJNMS4wNjMgMWwxMi4zIDEyLjQyNW0uMDYzLTEyLjM2MkwxIDEzLjM2MyIgc3Ryb2tlPSIjZmZmIiBzdHJva2Utd2lkdGg9IjEuNSIgc3Ryb2tlLWxpbmVjYXA9InJvdW5kIiBzdHJva2UtbGluZWpvaW49InJvdW5kIiBmaWxsPSJub25lIi8+PC9zdmc+\"]")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
//        CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
    }

    public void openWebViewBrowserDefaultEmulatorThenMailThenNavigateSidebar() throws InterruptedException {
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]")).clear();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]"))
                .sendKeys("Mail.com");

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Load URL\"]")).click();
        Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.View[@content-desc=\"open Menu\"]")).click();
        Thread.sleep(2000);
      CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.MenuItem[@text=\"Domains\"]")).click();

    }


    public void openWebViewBrowserDefaultEmulatorThenPremiumAndTryToSignIn() throws InterruptedException {

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]")).clear();
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.EditText[@resource-id=\"org.chromium.webview_shell:id/url_field\"]"))
                .sendKeys("Mail.com");
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Load URL\"]")).click();

        Thread.sleep(2000);
        //android.view.MenuItem[@text="Premium"]

        CommonUtils.androidDriver.get().findElement(By.xpath("//android.view.MenuItem[@text=\"Premium\"]")).click();
        Thread.sleep(2000);
      CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@text=\"Get 3 months Premium\"]")).click();
      Thread.sleep(2000);
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.TextView[@text=\"Terms & Conditions\"]")).click();
       //CommonUtils.androidDriver.get().findElement(By.xpath("")).click();
    }

}
