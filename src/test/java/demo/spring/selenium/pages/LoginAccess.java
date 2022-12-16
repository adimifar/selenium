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
//
//public class LoginAccess {
//    WebDriver driver;
//
//    @BeforeEach
//    public void prepareBrowser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    void test() {
//        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//
////        String getData = driver.findElement(By.xpath("//*[@id='helperLinks']/center/div")).getText();
//        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("m.dummy.k0");
//        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Honda2020!");
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
//
//        String getData = driver.findElement(By.xpath("//*[@id=\'default_home\']/div[1]/div/div[2]/div[1]/div[2]/h3")).getText();
//        Assert.assertTrue(getData.equals("Announcement"));
//
//    }
//}