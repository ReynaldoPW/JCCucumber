package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestRecruitment {
    public static WebDriver driver;

    public static RecruitmentPage recruitmentPage = new RecruitmentPage();

    public static ExtentTest extentTest;
    public TestRecruitment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User already login with valid credential")
    public void user_already_login_with_valid_credential(){
        TestLogin login = new TestLogin();
        login.user_open_browser_and_url();
        login.user_enter_valid_username();
        login.user_enter_valid_password();
        login.user_click_button_login();
        login.user_go_to_page_Dashboard();
        extentTest.log(LogStatus.PASS,"User already login with valid credential");
    }

    @When("User click recruitment button")
    public void user_click_recruitment_button(){
        recruitmentPage.clickRecruitment();
        extentTest.log(LogStatus.PASS,"User click recruitment button");
    }
    @And("User click button add")
    public void user_click_button_add(){
        recruitmentPage.clickAddCandidate();
        extentTest.log(LogStatus.PASS,"User click button add");
    }
    @And("User enter valid first name")
    public void user_enter_valid_first_name(){
        recruitmentPage.inputFirstName("Juara");
        extentTest.log(LogStatus.PASS,"User enter valid first name");
    }
    @And("User enter valid middle name")
    public void user_enter_valid_middle_name(){
        recruitmentPage.inputMiddleName("Coding");
        extentTest.log(LogStatus.PASS,"User enter valid middle name");
    }
    @And("User enter valid last name")
    public void user_enter_valid_last_name(){
        recruitmentPage.inputLastName("Bootcamp");
        extentTest.log(LogStatus.PASS,"User enter valid last name");
    }
    @And("User enter vacancy")
    public void user_enter_vacancy(){
        recruitmentPage.inputJobVacancy("Engineer");
        extentTest.log(LogStatus.PASS,"User enter vacancy");
    }
    @And("User enter valid email address")
    public void user_enter_valid_email_address(){
        recruitmentPage.inputEmail("juaracoding@test.com");
        extentTest.log(LogStatus.PASS,"User enter valid email address");
    }
    @And("User enter valid email password")
    public void user_enter_valid_email_password(){
        recruitmentPage.inputPassword("1234");
        extentTest.log(LogStatus.PASS,"User enter valid email password");
    }
    @And("User enter document")
    public void user_enter_document(){
        recruitmentPage.inputDocument();
        extentTest.log(LogStatus.PASS,"User enter document");
    }
    @And("User enter job keyword")
    public void user_enter_job_keyword(){
        recruitmentPage.inputKeyword();
        extentTest.log(LogStatus.PASS,"User enter job keyword");
    }
    @And("User enter dates")
    public void user_enter_dates(){
        recruitmentPage.inputDate();
        extentTest.log(LogStatus.PASS,"User enter dates");
    }
    @And("User click the consent data checkbox")
    public void user_click_the_consent_data_checkbox(){
        recruitmentPage.checkboxConsentData();
        extentTest.log(LogStatus.PASS,"User click the consent data checkbox");
    }
    @And("User click the save button")
    public void user_click_the_save_button(){
        recruitmentPage.btnSave();
        extentTest.log(LogStatus.PASS,"User click the save button");
    }
    @Then("User can see the successful update message")
    public void User_can_see_the_successful_update_message(){
        recruitmentPage.getTxtSuccessMessage();
        extentTest.log(LogStatus.PASS,"User can see the successful update message");
    }



}
