package com.kaiser.stepDefinitions;


import com.kaiser.pages.LoginPage;
import com.kaiser.utilities.ConfigReader;
import com.kaiser.utilities.MyDriver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage=new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.login();


    }

    @Given("User enters valid {string} and {string}")
    public void user_enters_valid_username_and(String username, String password) {
        loginPage.login(username,password);


    }

    @When("User verifies that he is in the landing page")
    public void user_verifies_that_he_is_in_the_landing_page() {
        String actualTitle = MyDriver.get().getTitle();
        String expectedTitle="Custom Care & Coverage Just For You | Kaiser Permanente";
        try {
            Assert.assertEquals(expectedTitle,actualTitle);
        } catch (Exception e){
            System.out.println("Page title verification failed");
            e.printStackTrace();
        }


    }





//2.scenario

    @Given("User enters invalid {string} and {string}")
    public void user_enters_invalid_username_and(String invalidUsername, String invalidPassword) {
        loginPage.login(invalidUsername,invalidPassword);



    }



    @Then("verify that {string} is present")
    public void verify_that_is_present(String string) {


    }





    @Then("User verifies that {string} warning message is present")
    public void user_verifies_that_warning_message_is_present(String string) {


    }
    //scenario 3



    @Then("user logs in as a member with following credentials")
    public void user_logs_in_as_a_member_with_following_credentials(Map<String,String>dataTable) {
        System.out.println(dataTable);
        loginPage.login(dataTable.get("username"),dataTable.get("password"));

    }
//myHealth page subtitle
    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {

        Assert.assertEquals("Title is correct",string,loginPage.getPageSubTitle());
    }

}