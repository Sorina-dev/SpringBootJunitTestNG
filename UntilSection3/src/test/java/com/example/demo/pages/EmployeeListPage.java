package com.example.demo.pages;

import com.example.demo.extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class EmployeeListPage extends BasePage {

    @FindBy(linkText = "Create New")
    private WebElement btnCreateNew;


    public void clickCreateNew(){
        UIElementExtensions.performClick(btnCreateNew);
    }

}
