package TestNG_Projects_1;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_401  {
    /*
    Kullanıcı, ana sayfaya gider
Kullanıcı, [DEMO] butonuna tıklar
Kullanıcı, [Explore OpenMRS 2] butonuna tıklar
Kullanıcı, [Enter the OpenMRS 2 Demo] butonuna tıklar
Kullanıcı, oturum açma sayfasına yönlendirilir.
Kullanıcı, Customer Data'daki geçersiz bir kullanıcı adını ve bir
şifreyi girer.
"Giriş" düğmesine tıklar.
Kullanıcı, [You must choose a location!] uyarısını alır.
Kullanıcı, Customer Data'daki location bölümlerini görebilmeli
ve tıklayabilmelidir.
Kullanıcı, [Inpatient Ward] butonuna tıklar.
Kullanıcı, tekrar Customer Data'daki geçersiz bir kullanıcı adını
ve bir şifreyi girer.
"Giriş" düğmesine tıklar.
Kullanıcı, [Invalid username/password. Please try again.]
uyarısını alır.
(Kullanıcı, geçerli data ile başarıyla oturum açar. - isteğe bağlı)
     */
@Test
    public void Test1(){
    WebDriver driver=new ChromeDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
     driver.get("https://openmrs.org/");
    Tools.Bekle(2);
    WebElement demo1= driver.findElement(By.xpath("//a[@class='zak-button']"));
    demo1.click();
    Tools.Bekle(2);

    WebElement demo2= driver.findElement(By.xpath("//SPAN[@class='elementor-button-text'][text()=\"Keşfet OpenMRS 2\"]"));
    demo2.click();

    WebElement demo3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='elementor-button-text'])[4]")));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", demo3);

    WebElement emailclick=wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
    emailclick.sendKeys("team10");

    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("12345");

    WebElement login=driver.findElement(By.cssSelector("input[id=\"loginButton\"]"));
    login.click();
    Tools.Bekle(2);

    WebElement ward=driver.findElement(By.id("Inpatient Ward"));
    ward.click();

    login.click();

    WebElement email1=driver.findElement(By.id("username"));
    email1.clear();
    email1.sendKeys("admin");

    WebElement password1=driver.findElement(By.id("password"));
    password1.clear();
    password1.sendKeys("Admin123");

    WebElement ward1=driver.findElement(By.id("Inpatient Ward"));
    ward1.click();

    WebElement login2=driver.findElement(By.cssSelector("input[id=\"loginButton\"]"));
    login2.click();





}
}
