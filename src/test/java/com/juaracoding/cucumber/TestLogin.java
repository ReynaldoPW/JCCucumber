package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLogin {

    public static WebDriver driver;
    public static LoginPage loginpage = new LoginPage();

    public static ExtentTest extentTest;
    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   @Given("User open browser and url")
    public void user_open_browser_and_url(){
       driver.get(Constants.URL);
       extentTest.log(LogStatus.PASS,"User open browser and url");
   }

   @When("User enter valid username")
    public void user_enter_valid_username(){
       loginpage.enterValidUsername("Admin");
       extentTest.log(LogStatus.PASS,"User enter valid username");
   }

   @And("User enter valid password")
    public void user_enter_valid_password(){
       loginpage.enterValidPassword("admin123");
       extentTest.log(LogStatus.PASS,"User enter valid password");
   }
   @And("User click button login")
    public void user_click_button_login(){
       loginpage.buttonLogin();
       extentTest.log(LogStatus.PASS,"User click button login");
   }
   @Then("User go to page Dashboard")
    public void user_go_to_page_Dashboard(){
       loginpage.getTextDashboard();
       extentTest.log(LogStatus.PASS,"User go to page Dashboard");
   }

   @When("User click button logout")
   public void user_click_button_logout(){
        loginpage.dropDownMenu();
        loginpage.logoutBtn();
       extentTest.log(LogStatus.PASS,"User click button logout");
    }

    @And("User enter invalid username")
    public void user_enter_invalid_username(){
        loginpage.enterInvalidUsername("reypau");
        extentTest.log(LogStatus.PASS,"User enter invalid username");
    }
    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        loginpage.enterInvalidPassword("noobmaster69");
        extentTest.log(LogStatus.PASS,"User enter invalid password");
    }
    @Then("User get message invalid credentials")
    public void user_get_message_invalid_credentials(){
        loginpage.getTxtInvalidCredentials();
        extentTest.log(LogStatus.PASS,"User get message invalid credentials");
    }
    @When("User enter null username")
    public void user_enter_null_username(){
        loginpage.enterNullUsername("");
        extentTest.log(LogStatus.PASS,"User enter null username");
    }
    @And("User enter null password")
    public void user_enter_null_password(){
        loginpage.enterNullPassword("");
        extentTest.log(LogStatus.PASS,"User enter null password");
    }

}
