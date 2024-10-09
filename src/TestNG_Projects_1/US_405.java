package TestNG_Projects_1;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_405 extends BaseDriver{

    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    @Test
    public void Test405_1 () {}


    @Test (dependsOnMethods = {"Test405_1"})
    public void Test405_2 (){

        Actions aksiyon=new Actions(driver);

        aksiyon.moveToElement(driver.findElement(By.xpath("//i[@class='icon-caret-down appui-icon-caret-down link']"))).build().perform();
        Tools.Bekle(2);
        aksiyon.click();

        WebElement myAccount=driver.findElement(By.xpath("//a[@id=''][text()='\n" +
                "                                    My Account\n" +
                "                                ']"));
        myAccount.click();


        WebElement sonuc=driver.findElement(By.xpath("(//DIV[@class='task'])[1]/i"));
        Boolean sonuc1=sonuc.isDisplayed();
       logEkle.error(sonuc1);
       Assert.assertTrue(sonuc1==true, "görüntülenemedi");









}

}
