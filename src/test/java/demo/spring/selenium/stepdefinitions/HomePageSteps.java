package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.DashboardPage;
import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageSteps {
//    private HomePage homePage = new HomePage(Hooks.driver);

    @Autowired
    private HomePage homePage;

    @Given("I open portal PASTI")
    public void iOpenLoginPage(){
        homePage.verifyFooterText();
    }

    @When("I fill in username {string}")
    public void iFillInUsername(String username) {
        homePage.insertUser(username);
    }

    @Then("I fill in password {string}")
    public void iFillInPassword(String password) {
        homePage.insertPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        homePage.clickLogin();
    }

    @Then("I fill in {string} as password")
    public void iFillInAsPassword(String password) {
        homePage.insertPassword(password);
    }
}
