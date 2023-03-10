package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.RecruitmentPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestRecruitment {
    public static WebDriver driver;

    public static RecruitmentPage recruitmentPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        recruitmentPage = new RecruitmentPage();
    }
    @Given("User already login with valid credential")
    public void user_already_login_with_valid_credential(){
        TestLogin login = new TestLogin();
        login.user_open_browser_and_url();
        login.user_enter_valid_username();
        login.user_enter_valid_password();
        login.user_click_button_login();
        login.user_go_to_page_Dashboard();
        System.out.println("User already login with valid credential");
    }

    @When("User click recruitment button")
    public void user_click_recruitment_button(){
        recruitmentPage.clickRecruitment();
        System.out.println("User click recruitment button");
    }
    @And("User click button add")
    public void user_click_button_add(){
        recruitmentPage.clickAddCandidate();
        System.out.println("User click button add");
    }
    @And("User enter valid first name")
    public void user_enter_valid_first_name(){
        recruitmentPage.inputFirstName("Juara");
        System.out.println("User enter valid first name");
    }
    @And("User enter valid middle name")
    public void user_enter_valid_middle_name(){
        recruitmentPage.inputMiddleName("Coding");
        System.out.println("User enter valid middle name");
    }
    @And("User enter valid last name")
    public void user_enter_valid_last_name(){
        recruitmentPage.inputLastName("Bootcamp");
        System.out.println("User enter valid last name");
    }
    @And("User enter vacancy")
    public void user_enter_vacancy(){
        recruitmentPage.inputJobVacancy("Engineer");
        System.out.println("User enter vacancy");
    }
    @And("User enter valid email address")
    public void user_enter_valid_email_address(){
        recruitmentPage.inputEmail("juaracoding@test.com");
        System.out.println("User enter valid email address");
    }
    @And("User enter valid email password")
    public void user_enter_valid_email_password(){
        recruitmentPage.inputPassword("1234");
        System.out.println("User enter valid email password");
    }
    @And("User enter document")
    public void user_enter_document(){
        recruitmentPage.inputDocument();
        System.out.println("User enter document");
    }
    @And("User enter job keyword")
    public void user_enter_job_keyword(){
        recruitmentPage.inputKeyword();
        System.out.println("User enter job keyword");
    }
    @And("User enter dates")
    public void user_enter_dates(){
        recruitmentPage.inputDate();
        System.out.println("User enter dates");
    }
    @And("User click the consent data checkbox")
    public void user_click_the_consent_data_checkbox(){
        recruitmentPage.checkboxConsentData();
        System.out.println("User click the consent data checkbox");
    }
    @And("User click the save button")
    public void user_click_the_save_button(){
        recruitmentPage.btnSave();
        System.out.println("User click the save button");
    }
    @Then("User can see the successful update message")
    public void User_can_see_the_successful_update_message(){
        recruitmentPage.getTxtSuccessMessage();
        System.out.println("User can see the successful update message");
    }
    @AfterAll
    public static void quitBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

}
