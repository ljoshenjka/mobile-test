package locators

import io.appium.java_client.MobileElement
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class CalcPage_DOM {
    @FindBy(id = "com.test.calc:id/add")
    static WebElement addButton

    @FindBy(id = "com.test.calc:id/subtract")
    static WebElement subButton

    @FindBy(id = "com.test.calc:id/sqrt")
    static WebElement sqrtButton

    @FindBy(id = "com.test.calc:id/divide")
    static WebElement divButton

    @FindBy(id = "com.test.calc:id/multiply")
    static WebElement multButton

    @FindBy(id = "com.test.calc:id/power")
    static WebElement powerButton

    @FindBy(id = "com.test.calc:id/title")
    static WebElement calcTitle

    @FindBy(id = "com.test.calc:id/result")
    static WebElement result
}
