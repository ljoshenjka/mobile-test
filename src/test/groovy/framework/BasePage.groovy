package framework

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

/**
 * Created by aleksejs.trescalins on 10/09/17.
 */

abstract class BasePage {
    protected AndroidDriver driver

    def DRIVER_WAIT_TIME = 15
    WebDriverWait wait = new WebDriverWait(driver, DRIVER_WAIT_TIME)

    BasePage(driver, Class aClass) {
        this.driver = driver
        PageFactory.initElements(driver, aClass);
    }

//    TODO: some reusable stuff for page objects

    void waitUntilElementPresents(by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by))
    }

    void waitUntilVisibilityOfElement(by){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by))
    }

    boolean isPresent(by) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(by))
            true
        } catch (NoSuchElementException e) {
            false
        }
    }

}
