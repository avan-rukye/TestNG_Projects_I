package TestNG_Projects_1;

import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class US_404  {
    WebDriver driver=new ChromeDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    @Test
    public void Test404_1(){

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
    @Test (dependsOnMethods = {"Test404_1"})
    public void Test404_2(){

        WebElement patient=driver.findElement(By.xpath("(//I[@class='icon-user'])[2]"));
        patient.click();

        WebElement givenName=driver.findElement(By.name("givenName"));
        givenName.sendKeys("Rukiye");

        WebElement familyName=driver.findElement(By.name("familyName"));
        familyName.sendKeys("AVAN");

        WebElement next1=driver.findElement(By.id("next-button"));
        next1.click();

        WebElement webSelect=driver.findElement(By.cssSelector("[id='gender-field']"));
        Select javaSelect=new Select(webSelect);
        javaSelect.selectByValue("F");

        WebElement next2=driver.findElement(By.id("next-button"));
        next2.click();

        WebElement day=driver.findElement(By.cssSelector("[id='birthdateDay-field']"));
        day.sendKeys("27");

        WebElement month=driver.findElement(By.cssSelector("[id='birthdateMonth-field']"));
        Select javaSelectMonth=new Select(month);
        javaSelectMonth.selectByValue("3");

        WebElement year=driver.findElement(By.cssSelector("[id='birthdateYear-field']"));
        year.sendKeys("1998");
        next2.click();

        WebElement address=driver.findElement(By.cssSelector("[id='address1']"));
        address.sendKeys("Kahramanmaraş");
        next2.click();

        WebElement number=driver.findElement(By.cssSelector("[name='phoneNumber']"));
        number.sendKeys("555555555");
        next2.click();

        WebElement relationship=driver.findElement(By.xpath("//SELECT[@id='relationship_type']"));
        Select javaSelectrelationship=new Select(relationship);
        javaSelectrelationship.selectByValue("8d919b58-c2cc-11de-8d13-0010c6dffd0f-A");

        WebElement personName=driver.findElement(By.xpath("(//INPUT[@type='text'])[15]"));
        personName.sendKeys("ABCD");
        next2.click();

        WebElement confirm=driver.findElement(By.xpath("//INPUT[@id='submit']"));
        confirm.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='coreapps-showContactInfo']")));


        WebElement msjKullanici=driver.findElement(By.xpath("//h1[@class='mt-0 mb-2 name']"));
        Assert.assertTrue(msjKullanici.getText().contains("Rukiye"),"Kullanıcı Bulunamadı.");



    }
}
