package Utlity;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriver {
    public static Logger logEkle = LogManager.getLogger();

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri(){
        driver=new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Login();
    }

    @AfterClass
    public void KapanisIslemleri(){
        Tools.Bekle(3);
        driver.quit();
    }

    public static void Login() {
        driver.get("https://openmrs.org/");
        Tools.Bekle(2);
        WebElement demo1= driver.findElement(By.xpath("//a[@class='zak-button']"));
        demo1.click();
        Tools.Bekle(2);

        WebElement demo2= driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[2]"));
        demo2.click();

        WebElement demo3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='elementor-button-text'])[4]")));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", demo3);

        WebElement email=driver.findElement(By.id("username"));
        email.sendKeys("admin");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Admin123");

        WebElement ward=driver.findElement(By.id("Inpatient Ward"));
        ward.click();

        WebElement login=driver.findElement(By.cssSelector("input[id=\"loginButton\"]"));
        login.click();

    }
}
