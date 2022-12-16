//package demo.spring.selenium.pages;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Login {
//    WebDriver driverEdge;
//    WebDriver driverChrome;
//    WebDriver driverFirefox;
//
//    @BeforeEach
//    public void prepareBrowser() {
//        //Chrome
//        WebDriverManager.chromedriver().setup();
//        driverChrome = new ChromeDriver();
//
//        //Edge
//        WebDriverManager.edgedriver().setup();
//        driverEdge = new EdgeDriver();
//
//        //Firefox
//        WebDriverManager.firefoxdriver().setup();
//        driverFirefox = new FirefoxDriver();
//
//    }
//
//    @AfterEach
//    public void tearDown() {
//        driverChrome.quit();
//    }
//
//    @Test
//    void test() {
//        driverChrome.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//
//        String getData = driverChrome.findElement(By.xpath("//*[@id='helperLinks']/center/div")).getText();
//        Assert.assertTrue(getData.contains("tra Honda Motor"));
//    }
//}