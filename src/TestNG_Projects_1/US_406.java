package TestNG_Projects_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_406 extends BaseDriver {


    @Test
    public void Test406_1(){}

    @Test (dependsOnMethods = {"Test406_1"})
    public void Test406_2(){

        WebElement recordButton=driver.findElement(By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']"));
        recordButton.click();

        WebElement patientSearch=driver.findElement(By.xpath("//input[@id='patient-search']"));
        patientSearch.sendKeys("Rukiye AVAN");

        WebElement aramaSonucu=driver.findElement(By.xpath("(//td[@class=''])[1]"));
        aramaSonucu.click();

        WebElement sonuc=driver.findElement(By.xpath("(//DIV[@class='task'])[1]/i"));
        Boolean sonuc1=sonuc.isDisplayed();
        logEkle.error(sonuc1);
        Assert.assertTrue(sonuc1==true, "görüntülenemedi");







    }
}
