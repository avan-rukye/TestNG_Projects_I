package TestNG_Projects_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_410 extends BaseDriver {

    @Test
    public void Test410(){

        WebElement appoinmentScheduling=driver.findElement(By.id("appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension"));
        appoinmentScheduling.click();

        WebElement manageAppoinments=driver.findElement(By.id("appointmentschedulingui-manageAppointments-app"));
        manageAppoinments.click();

        WebElement patientSearch=driver.findElement(By.id("patient-search"));
        patientSearch.sendKeys("Rukiye AVAN");

        WebElement secim=driver.findElement(By.xpath("//tbody[@aria-live='polite']/tr/td[2]"));
        secim.click();

        WebElement errorMessage=driver.findElement(By.id("time-zone-warning"));
        Assert.assertTrue(errorMessage.getText().contains("not set to the right time zone"),"Hata mesajı görüntülenmedi");
    }
}
