package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
	}

	/* Login valid */

	@Given("je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}

	@When("je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		LoginPage.getEmail().clear();
		LoginPage.getEmail().sendKeys(email);

	}

	@When("je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(login);
	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();

	}

	@Then("je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {

	}

	/* Login invalid */

	@Then("je verifie le mzssage d'erreur")
	public void jeVerifieLeMzssageDErreur() {

	}

}
