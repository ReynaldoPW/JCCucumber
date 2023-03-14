package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;
    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement recruitmentPage;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement buttonAdd;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement inputMiddleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement inputLastName;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement selectVacancy;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement inputEmail;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@type='file']")
    WebElement inputDocument;
    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement keywordsJob;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    WebElement inputDate;
    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement inputNotes;
    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkboxConsentData;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successMessage;



    public void clickRecruitment(){
        recruitmentPage.click();
    }
    public void clickAddCandidate(){
        buttonAdd.click();
    }
    public void inputFirstName(String firstname){
        inputFirstName.sendKeys("Juara");
    }
    public void inputMiddleName(String middlename){
        inputMiddleName.sendKeys("Coding");
    }
    public void inputLastName(String lastname){
        inputLastName.sendKeys("Bootcamp");
    }
    public void inputJobVacancy(String vacancy){
        selectVacancy.sendKeys("Software");
    }
    public void inputEmail(String email){
        inputEmail.sendKeys("juaracoding@test.com");
    }
    public void inputPassword(String password){
        inputPassword.sendKeys("1234");
    }
    public void inputDocument(){
        String pathDoc = "C:\\Users\\Reypau\\Downloads\\New Microsoft Word Document.docx";
        inputDocument.sendKeys(pathDoc);
    }
    public void inputKeyword(){
        keywordsJob.sendKeys("Engineer");
    }
    public void inputDate(){
        inputDate.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        inputDate.sendKeys("2023-02-23");
        inputNotes.sendKeys("test");
    }
    public void checkboxConsentData(){
        checkboxConsentData.click();
    }
    public void btnSave(){
        btnSave.click();
    }
    public String getTxtSuccessMessage(){
        return successMessage.getText();
    }

}
