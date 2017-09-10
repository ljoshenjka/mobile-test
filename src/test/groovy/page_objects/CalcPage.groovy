package page_objects

import framework.BasePage
import io.appium.java_client.MobileElement
import locators.CalcPage_DOM
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy

class CalcPage extends BasePage {

    CalcPage(driver) throws Exception {
        super(driver, CalcPage_DOM.class);
    }

    static clickButton(String button) {
        switch (button) {
            case "ADD" : CalcPage_DOM.addButton.click()
                break
            case "SUBTRACT" : CalcPage_DOM.subButton.click()
                break
            case "SQUARE ROOT" : CalcPage_DOM.sqrtButton.click()
                break
            case "DIVIDE by 2" : CalcPage_DOM.divButton.click()
                break
            case "MULTIPLY by 2" : CalcPage_DOM.multButton.click()
                break
            case "POWER by 2" : CalcPage_DOM.powerButton.click()
                break
                default: System.out.println("No such button")
        }
    }

    static isAppOpen() {
        CalcPage_DOM.calcTitle.text.equalsIgnoreCase("Wonky calculator app")
    }

    static checkResult() {
        String result = CalcPage_DOM.result.text.substring(8)
        try {
            result.toDouble()
        } catch (NumberFormatException e) {
            e.getMessage()
        }
    }
}
