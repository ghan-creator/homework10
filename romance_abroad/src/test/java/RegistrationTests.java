//added in 10 class RegistrationTests8

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration10() {
        mainPage.clickJoinButton();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        mainPage.insertFirstPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



              //O=> added in clas10://unmarket !now!
        //mainPage.insertSecondPartOfRegistrationInformation();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //O=> added in clas10:
        WebElement checkboxConformation = driver.findElement(By.cssSelector("input#confirmation"));
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
            checkboxConformation.click();
        } else {
            Assert.fail("Checkbox is already selected");
        }
    }
//need to add it to MainPage, under main.java
}


