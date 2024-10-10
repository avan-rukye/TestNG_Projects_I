package TestNG_Projects_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US_407 extends BaseDriver {

    @Test
public void Test407_1 () {}

    @Test (dependsOnMethods = {"Test407_1"})
    public void Test407_2(){
        WebElement recordButton=driver.findElement(By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']"));
        recordButton.click();

        WebElement patientSearch=driver.findElement(By.xpath("//input[@id='patient-search']"));
        patientSearch.sendKeys("Rukiye1 AVAN");

        WebElement secim=driver.findElement(By.xpath("//tbody[@aria-live='polite']/tr/td[2]"));
        secim.click();

        WebElement delete=driver.findElement(By.xpath("(//li[@class=\"float-left\"])[17]"));
        delete.click();

        WebElement reason=driver.findElement(By.xpath("//input[@id='delete-reason']"));
        reason.sendKeys("Hasta Talebi");

        WebElement confirm= driver.findElement(By.xpath("(//button[@class='confirm right'])[5]"));
        confirm.click();



    }

}
