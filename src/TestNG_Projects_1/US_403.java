package TestNG_Projects_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US_403 extends BaseDriver {

    @Test
    public void Test403(){
        WebElement logout=driver.findElement(By.xpath("//A[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']"));
        logout.click();


    }
}
