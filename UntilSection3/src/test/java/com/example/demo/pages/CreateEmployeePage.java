package com.example.demo.pages;

import com.example.demo.extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class CreateEmployeePage extends BasePage {

    @FindBy(name = "Name")
    private WebElement txtName;

    @FindBy(id = "DurationWorked")
    private WebElement txtDurationWorked;

    @FindBy(name = "Email")
    private WebElement txtEmail;

    @FindBy(name = "Salary")
    private WebElement txtSalary;

    @FindBy(name = "Grade")
    private WebElement ddlGrade;

    @FindBy(css = ".btn")
    private WebElement btnCreate;


    public void createNewEmployee(String name, String durationWorked, String email, String salary, String grade) {
        UIElementExtensions.performEnterText(txtName, name);
        UIElementExtensions.performEnterText(txtDurationWorked, durationWorked);
        UIElementExtensions.performEnterText(txtSalary, salary);
        UIElementExtensions.performEnterText(txtEmail, email);
        UIElementExtensions.performDropDownSelectionByText(ddlGrade, grade);
        UIElementExtensions.performClick(btnCreate);
    }
}