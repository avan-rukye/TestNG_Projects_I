package TestNG_Projects_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US_409 extends BaseDriver {
    US_404 us404=new US_404();
    @Test
    public void Test409_1 (){
        us404.Test404_2();
        WebElement idAl1=driver.findElement(By.xpath("//div[@class='float-sm-right']/span"));
        String kayit1=idAl1.getText();
        us404.Test404_2();
        WebElement idAl2=driver.findElement(By.xpath("//div[@class='float-sm-right']/span"));
        String kayit2=idAl2.getText();


        WebElement dataMan=driver.findElement(By.xpath("//A[@id='coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension']"));
        dataMan.click();

        WebElement mergedataMan=driver.findElement(By.xpath("//A[@id='coreapps-mergePatientsHomepageLink-app']"));
        mergedataMan.click();

        WebElement id1=driver.findElement(By.xpath("//INPUT[@id='patient1-text']"));
        id1.sendKeys(kayit1);

        WebElement id2=driver.findElement(By.xpath("//INPUT[@id='patient2-text']"));
        id2.sendKeys(kayit2);

        WebElement button=driver.findElement(By.xpath("//INPUT[@id='confirm-button']"));
        button.click();

        WebElement birlestirmeSecim=driver.findElement(By.xpath("//div[@class=\"row name\"][1]"));
        birlestirmeSecim.click();
        button.click();

        WebElement dogrulama=driver.findElement(By.xpath("//DIV[@class='float-sm-right']"));
        System.out.println(dogrulama.getText());





    }


}
