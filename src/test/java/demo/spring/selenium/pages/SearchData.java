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
//import java.util.concurrent.TimeUnit;
//
//public class SearchData {
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
//    void test() throws InterruptedException {
//        driver.get("https://portaldev.ahm.co.id/jx02/ahmipdsh000-pst/login.htm");
//        //kalau internet lemot, set implicit
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
////        String getData = driver.findElement(By.xpath("//*[@id='helperLinks']/center/div")).getText();
//        //login
//        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("m.dummy.i0");
//        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Honda2020!");
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
//
////        String getData = driver.findElement(By.xpath("//*[@id=\'default_home\']/div[1]/div/div[2]/div[1]/div[2]/h3")).getText();
////        Assert.assertTrue(getData.equals("Announcement"));
//
//        //open aplikasi SCP002
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/input")).sendKeys("SCP002");
//        driver.findElement(By.xpath("//*[@id=\'ahmdsh1_menu_ul\']/li[14]/ul/li[1]/ul/li[1]/a/div")).click();
//
//        driver.findElement(By.xpath("//*[@id=\'AHMFASCP002_P01_FilterTransferDateStart\']")).sendKeys("14-Dec-2020");
//
//        driver.findElement(By.xpath("//*[@id=\'AHMFASCP002_P01_PageMain\']/div/div[1]/div[3]/div/button[1]")).click();
////        driver.findElement(By.xpath("//*[@id=\'AHMFASCP002_P01_PageMain\']/div/div[1]/div[3]/div/button[1]")).click();
//
//        //kalau ada error mau debug, pakai thread sleep
//        Thread.sleep(5000);
//
//        //kalau mau validasi data yg tampil, bisa pakai Assert
////        String getData = driver.findElement(By.xpath("//*[@id=\"ahmfascp002_TableMonitoring\"]/tbody/tr[1]/td[1]")).getText();
////        Assert.assertTrue(getData.contains("OCT-22"));
//
//        //buat ngecek elemnt tersebut apakah terdisplay atau tidak
//        driver.findElement(By.xpath("//*[@id=\"ahmfascp002_TableMonitoring\"]/tbody/tr[1]/td[1]")).isDisplayed();
//
//        Thread.sleep(15000);
//
//    }
//}