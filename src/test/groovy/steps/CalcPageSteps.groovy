package steps

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

    @When('^user press ADD button$')
    void user_press_button() throws Throwable {
        CalcPage.clickButton("ADD")
    }

    @Then('^the result should be increased by (\\d+)$')
    void the_result_should_be_increased_by(int i) throws Throwable {
    }
}