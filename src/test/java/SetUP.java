import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SetUP {
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver Setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("PlatformName", "Android");
        caps.setCapability("PlatformVersion", "11");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("app","D:\\\\APK\\\\CALCULATOR.apk");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
    @AfterTest
    public void CloseApp() {
        driver.quit();
    }
}
