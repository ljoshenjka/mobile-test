# Appium+groovy+cucumber framework for mobile test automation #

This framework purpose is the implementation and execution of acceptance tests for android mobile application. It consists of predefined dependencies and API's that will help to describe the expected behaviour of mobile app.

### Core dependencies ###

* Appium - test automation framework for use with native, hybrid and mobile web apps
* Cucumber - provides the natural Gherkin language used to describe application features, a basic API for binding that natural language to step definitions written in Groovy
* PageObject - design pattern which helps you to encapsulate the expected structure and mechanics of your application's UI.
* JUnit - for asserting expectations of scenario outcomes

## Getting Started ##

Run "gradle clean" or "./gradlew clean" terminal command from project core directory to install dependencies.

### Architecture ###

Framework is divided in such subsections:

* properties
* src/test/groovy/framework
* src/test/groovy/locators
* src/test/groovy/page_objects
* src/test/groovy/steps
* src/test/resources/features

**properties** - default configuration is loaded from "default.properties". It consists of various setups for Appium dirver instance like platform version, device name, Appium server url etc.

**framework** - core of the testing framework like abstract pageobject, hooks etc.

**locators** - locator storage, used inside of page objects to interact with page elements

**page_objects** - page object storage, classes with all the encapsulated logic of interaction with them

**steps** - step definitions written in Groovy which is mapped with real test cases written in Gherkin

**features** - feature files written in Gherkin language

### Writing Test Cases ###

Acceptance TC are written in Gherkin language inside feature file which are stored in "features" directory and then mapped to a step implementation in Groovy inside step classes.

### Running Test Cases ###

##### Precondition ####
Install Appium with all the mandatory dependencies like Android SDK etc. You can find how to do it on Appium official webpage - http://appium.io/

##### Execution ####
1. Before executing tests you need to create an android emulator which will be used as a testing device or connect a real physical device to you machine. With existing config it should be an Android emulator with OS version 8.0
2. Run the Android emulator you just created  - "emulator -avd <emulator_name>"
3. Run Appium server - "appium"
4. Check for the correct data in your config file - default.properties. Appium server url should be you appium node instance host.
5. To execute a test case run "gradle clean test" or "./gradlew clean test" commands. Specify tags to run in TestRunner file or through terminal with -Dcucumber.options="--tags @smoke" - "./gradlew clean test -Dcucumber.options="--tags @smoke""
6. Results are stored in html format in "build/reports/tests/test/index.html" directory and cucumber report is in "build/cucumber/html/index.html"
