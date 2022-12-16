package demo.spring.selenium.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.testng.Assert;

import java.lang.reflect.Constructor;

@Component
@Scope("cucumber-glue")
public class HomePage {
    @FindBy(xpath="//*[@id='helperLinks']/center/div")
    WebElement footer;

    @FindBy(xpath = "//*[@id='username']")
    WebElement fieldUsername;
    @FindBy(xpath = "//*[@id='password']")
    WebElement fieldPassword;
    @FindBy(xpath = "/html/body/div[1]/div[2]/form/div[4]/button")
    WebElement buttonLogin;

    @FindBy(xpath = "//*[@id=\'default_home\']/div[1]/div/div[2]/div[1]/div[2]/h3")
    WebElement labelHome;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void verifyFooterText(){
        Assertions.assertTrue(footer.getText().contains("PT Astra Honda Motor"));

    }

    public void insertUser(String username) {
        fieldUsername.sendKeys(username);
    }

    public void insertPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickLogin() {
        buttonLogin.click();
    }

    public void verifyLogin(String textHome) {
        String getData= labelHome.getText();
        Assertions.assertTrue(getData.equals(textHome));
    }
}
