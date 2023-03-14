package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement txtDashboard;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginTitle;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement txtInvalidCredential;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement dropdownMenu;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutBtn;


    public String getTextDashboard(){
        return txtDashboard.getText();
    }
    public String getTxtInvalidCredentials(){
        return txtInvalidCredential.getText();
    }

    public void dropDownMenu(){
        dropdownMenu.click();
    }

    public void logoutBtn(){
        logoutBtn.click();
    }

    public void enterValidUsername(String username){
        this.username.sendKeys("Admin");
    }
    public void enterValidPassword(String password){
        this.password.sendKeys("admin123");
    }

    public void enterInvalidUsername(String username){
        this.username.sendKeys("reypau");
    }
    public void enterInvalidPassword(String password){
        this.password.sendKeys("noobmaster69");
    }

    public void enterNullUsername(String username){
        this.username.sendKeys("");
    }
    public void enterNullPassword(String password){
        this.username.sendKeys("");
    }

    public void buttonLogin(){
        btnLogin.click();
    }

}
