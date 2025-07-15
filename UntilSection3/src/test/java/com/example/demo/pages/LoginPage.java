package com.example.demo.pages;

import com.example.demo.extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    @FindBy(name = "UserName")
    private WebElement txtUserName;

    @FindBy(name = "Password")
    private WebElement txtPassword;

    @FindBy(css = ".btn")
    private WebElement btnLogin;

    public void performLogin(String userName, String password) {
        UIElementExtensions.performEnterText(txtUserName, userName);
        UIElementExtensions.performEnterText(txtPassword, password);
        UIElementExtensions.performClick(btnLogin);
    }
}
