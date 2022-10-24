package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.*;

public class Login_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryApp"));

    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.emailInputBox.sendKeys("librarian1@library");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
loginPage.passwordInputBox.sendKeys("qU9mrvur");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
loginPage.signInBtn.click();
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.emailInputBox.sendKeys("student4@library");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.passwordInputBox.sendKeys("pG3V6qaL");
    }

}
