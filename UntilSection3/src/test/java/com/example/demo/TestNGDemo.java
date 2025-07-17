package com.example.demo;

import org.testng.annotations.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.pages.CreateEmployeePage;
import com.example.demo.pages.EmployeeListPage;
import com.example.demo.pages.HomePage;
import com.example.demo.pages.LoginPage;
import java.util.Arrays;

@SpringBootTest
public class TestNGDemo extends AbstractTestNGSpringContextTests {

    	@Autowired
	private WebDriver driver;

	@Autowired
	private HomePage homePage;

	@Autowired
	private LoginPage loginPage;

	@Autowired
	private CreateEmployeePage createEmployeePage;

	@Autowired
	private EmployeeListPage employeeListPage;

	@Test
	void createEmployeeTest() {
		homePage.clickLogin();
		loginPage.performLogin("admin", "password");
		homePage.clickEmployeeList();
		employeeListPage.clickCreateNew();
		createEmployeePage.createNewEmployee("AutoUser2", "22222", "autotestuser2@gmail.com", "20000", "Middle");
	}
}
