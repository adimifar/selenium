package demo.spring.selenium.stepdefinitions;


import demo.spring.selenium.SpringContextConfiguration;
import demo.spring.selenium.config.ConfigProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class Hooks {
    @Autowired
    private WebDriver driver;

    @Autowired
    private ConfigProperties configProperties;
//    static WebDriver driver;

    @Before
    public void prepareBrowser() {
        //Chrome
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        //Firefox
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();


        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
    }

    @After
    public void tearDown(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());
        driver.quit();
    }


}
