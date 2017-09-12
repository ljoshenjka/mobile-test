package framework

import cucumber.api.java.After
import cucumber.api.java.Before
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

import java.util.concurrent.TimeUnit

/**
 * Created by aleksejs.trescalins on 10/09/17.
 */

class Hooks {

    static AndroidDriver driver

    Properties env = Environment.getProperties()

    def platformName = env.getProperty("platformName")
    def platformVersion = env.getProperty("platformVersion")
    def deviceName = env.getProperty("deviceName")
    def appiumUrl = env.getProperty("appiumUrl")
    def timeout = Integer.parseInt(env.getProperty("defaultTimeout"))
    def appActivity = env.getProperty("appActivity")
    def appPackage = env.getProperty("appPackage")
    def app = System.getProperty("user.dir") + env.getProperty("app")

    // TODO: implement config handler for different platform drivers (iOS/Android/Win)

    @Before
    void setUp() {
        def cap = new DesiredCapabilities()
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName)
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion)
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName)
        cap.setCapability("appActivity", appActivity)
        cap.setCapability("appPackage", appPackage)
        cap.setCapability(MobileCapabilityType.APP, app)

        driver = new AndroidDriver(new URL(appiumUrl), cap)

        // setting the default implicit timeout
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS)
    }

    @After
    void tearDown() {
       driver.quit()
    }
}