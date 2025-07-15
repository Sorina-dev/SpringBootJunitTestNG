package com.example.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;


@Component
public class HomePage extends BasePage  {

    //Locators for Login
    @FindBy(linkText = "Login")
    private WebElement lnkLogin;

    @FindBy(linkText = "Employee List")
    private WebElement lnkEmployeeList;

    public void clickLogin() {
        lnkLogin.click();
    }

    public void clickEmployeeList(){
        lnkEmployeeList.click();
    }
}
