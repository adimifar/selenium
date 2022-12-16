package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class DashboardPageSteps {
//    private DashboardPage dashboardPage= new DashboardPage(Hooks.driver);

    @Autowired
    private DashboardPage dashboardPage;
    @Then("I should see {string} text")
    public void iShouldSeeText(String text) {
        dashboardPage.verifyText(text);
    }
}
