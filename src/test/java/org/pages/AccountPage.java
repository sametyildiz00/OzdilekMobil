package org.pages;

import com.thoughtworks.gauge.Step;
import org.test.BaseTest;

public class AccountPage extends BaseTest {

    @Step("E-mail'i yaz")
    public void mailEnter(){
        appiumDriver.findElement(Selector.EMAIL_ENTER).sendKeys(Selector.EMAIL);
        logger.info("E-posta degeri girildi");
    }

    @Step("Password yaz")
    public void passwordEnter(){
        appiumDriver.findElement(Selector.PASSWORD_ENTER).sendKeys(Selector.PASSWORD);
        logger.info("Password girildi");
    }

    @Step("Onceki sayfaya don")
    public void previousPage(){
        appiumDriver.findElement(Selector.PREVIOUS_PAGE).click();
        logger.info("Onceki sayfaya donuldu");
    }
}
