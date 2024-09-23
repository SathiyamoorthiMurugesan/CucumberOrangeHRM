package com.Orange.StepDefinitions;

import com.Orange.base.Generic;
import com.Orange.pages.HRM_LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllPageStepDefinitions {

	Generic generic = new Generic();

	@Given("User launches OrangeHRM page")
	public void user_launches_orange_hrm_page() throws Exception {
		generic.launchApplication1();

		HRM_LoginPage loginPage = new HRM_LoginPage(generic.getDriver());
		loginPage.loginOrangeHRMPage("Admin", "admin123");

	}

	@Then("validates home page by getting the user name")
	public void validates_home_page_by_getting_the_user_name() {
	}

	@Then("user lands on the Time page")
	public void user_lands_on_the_time_page() {
	}

	@When("clicks on the Time page")
	public void clicks_on_the_time_page() {
	}

	@Given("User launches OrangeHRM page and enters username and password")
	public void user_launches_orange_hrm_page_and_enters_username_and_password() throws Exception {
		generic.launchApplication1();

		HRM_LoginPage loginPage = new HRM_LoginPage(generic.getDriver());
		loginPage.loginOrangeHRMPage("Admin", "admin123");
	}
	
	@Given("User launches OrangeHRM page and enters {string} and {string}")
	public void user_launches_orange_hrm_page_and_enters_username_and_password_password(String userName, String pass) throws Exception {
		generic.launchApplication1();

		HRM_LoginPage loginPage = new HRM_LoginPage(generic.getDriver());
		loginPage.loginOrangeHRMPage(userName, pass);
	}

}
