package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class baseStep {
    public static void setup() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName("Android");
            options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
            options.setDeviceName("fikydevice");
            options.setApp(System.getProperty("user.dir") + "/apps/mda-1.0.13-15.apk");

            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (Exception e) {
            Assert.fail("failed setup project : "+e.getMessage());
        }

    }
}
