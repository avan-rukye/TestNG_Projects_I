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
        patientSearch.sendKeys("Rukiye AVAN");

        WebElement aramaSonucu=driver.findElement(By.xpath("(//td[@class=''])[1]"));
        aramaSonucu.click();

        WebElement delete=driver.findElement(By.xpath("//div[@class='col-11 col-lg-10'][text()='\n" +
                "                                                    Delete Patient\n" +
                "                                                ']"));
        delete.click();

        WebElement reason=driver.findElement(By.xpath("//input[@id='delete-reason']"));
        reason.sendKeys("Hasta Talebi");

        // WebElement confirm= driver.findElement(By.xpath("(//button[@class='confirm right'])[5]"));
       // confirm.click();



    }

}
