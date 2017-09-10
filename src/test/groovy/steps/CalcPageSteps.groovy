package steps

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import framework.Hooks
import org.junit.Assert
import page_objects.CalcPage

class CalcPageSteps {
    def driver = Hooks.driver

    def CalcPage = new CalcPage(driver)

    @Given('^user open calculator$')
    void user_open_calculator() throws Throwable {
        Assert.assertTrue(CalcPage.isAppOpen())
    }

    @When('^user press (.*) button (.*) times$')
    void user_press_button(String button, int count) throws Throwable {
        for (int i = 0; i < count; i++) {
            CalcPage.clickButton(button)
        }
    }

    @Then('^the result should be (.*)$')
    void the_result_should_be_increased_by(double expectedResult) throws Throwable {
        Assert.assertEquals(expectedResult, CalcPage.checkResult(), 1e-15)
    }

}