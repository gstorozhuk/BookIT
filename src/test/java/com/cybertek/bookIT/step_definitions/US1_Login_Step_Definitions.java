package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.pages.HomePage;
import com.cybertek.bookIT.utilities.BrowserUtils;
import com.cybertek.bookIT.utilities.ConfigurationReader;
import com.cybertek.bookIT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_Login_Step_Definitions {

    HomePage homePage = new HomePage();


    @Given("user has landed on a login page")
    public void user_has_landed_on_a_login_page() {
        homePage.homePageLanding();

    }

    @When("given user enter valid {string} and valid {string}")
    public void given_user_enter_valid_and_valid(String username, String password) {

        username = ConfigurationReader.getProperty("loginStudent");
        password = ConfigurationReader.getProperty("loginPassword");


        BrowserUtils.verifyElementDisplayed(homePage.userField);
        homePage.userField.sendKeys(username);
        BrowserUtils.wait(3);
        homePage.passwordField.sendKeys(password);
        homePage.loginButton.click();


    }

    @Then("the user on a Home page")
    public void the_user_on_a_home_page() {

        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "bookit";
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }

}