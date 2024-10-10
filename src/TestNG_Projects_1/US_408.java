package TestNG_Projects_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class US_408 extends BaseDriver {
    @Test
    public void Test408_1 () {}

    @Test (dependsOnMethods = {"Test408_1"})
    public void Test408_2(){

        WebElement recordButton=driver.findElement(By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']"));
        recordButton.click();
        List<WebElement> sayfalar = driver.findElements(By.xpath("//div[@id='patient-search-results-table_paginate']/span/a"));
        List<WebElement> hastalar = driver.findElements(By.xpath("//tbody[@aria-live='polite']/tr/td[2]"));
        int sayac=0;
        for (WebElement e:sayfalar) {
            e.click();
            for (WebElement d:hastalar) {
                sayac++;

            }

        }
        System.out.println(sayac);

      /*  // Hasta tablosundaki satırları al
        List<WebElement> rows = driver.findElements(By.cssSelector(".patient-table tbody tr"));

        // "Showing X to Y of Z entries" kısmını bul
        WebElement entryInfo = driver.findElement(By.id("patientTableInfo"));

        // Toplam satır sayısını al
        String entryText = entryInfo.getText();
        String totalEntries = entryText.split("of ")[1].split(" entries")[0].trim();

        // Tablo satır sayısıyla "Showing X to Y of Z entries" 'deki toplam hasta sayısını karşılaştır
        Assert.assertEquals(rows.size(), Integer.parseInt(totalEntries), "Satır sayısı doğru değil.");

*/

    }
}
