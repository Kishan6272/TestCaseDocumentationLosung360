package appiumPractise;

import io.appium.java_client.android.AndroidDriver;

public class CommonUtils {
    public static ThreadLocal<AndroidDriver> androidDriver = new ThreadLocal();

}
