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


    }
}
