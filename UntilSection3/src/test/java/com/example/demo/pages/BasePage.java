package com.example.demo.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {

    @Autowired
    private WebDriver driver;

    @PostConstruct
    public void initPage() {
        // Initialization code for the base page goes here
        PageFactory.initElements(driver, this);
    }
}
