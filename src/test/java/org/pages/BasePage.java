package org.pages;

import com.thoughtworks.gauge.Step;
import org.test.BaseTest;
import org.junit.Assert;

public class BasePage extends BaseTest {

    @Step("<wait> Saniye bekle")
    public void waitForsecond(int wait) throws InterruptedException {
        Thread.sleep(1000 * wait);
        logger.info("Bekleniyor...");
    }

    @Step ("Alisveris yap butotuna tikla")
    public void clickShopping(){
        appiumDriver.findElement(Selector.SHOPPING_BUTTON).click();
        logger.info("Alisveris yap butonuna tiklaniyor");
    }

    @Step("Kategoriler butonuna tikla")
    public void clickCategories(){
        appiumDriver.findElement(Selector.CATEGORIES_BUTTON).click();
        logger.info("Kategoriler butonuna tiklaniyor");
    }

    @Step("Kadin kategorisine tikla")
    public void clickWoman(){
        appiumDriver.findElement(Selector.WOMAN_BUTTON).click();
        logger.info("Kadin kategorisine tiklaniyor");
    }

    @Step("Pantolon kategorisine tikla")
    public void clickPants(){
        appiumDriver.findElement(Selector.PANTS_BUTTON).click();
        logger.info("Pantolon kategorisine tiklaniyor");
    }
    @Step("Uygulamanin acildigini kontrol et")
    public void appControl(){
        Assert.assertFalse("Uygulama acilamadi",appiumDriver.findElement(Selector.APP_CONTROL).equals(Selector.APP_CONTROL_TEXT));
        logger.info("Uygulamanin acildigi kontrol edildi");
    }

    @Step("Anasayfaya gelindigini kontrol et")
    public void mainPageControl(){
        Assert.assertFalse("Anasayfada degilsiniz",appiumDriver.findElement(Selector.MAIN_PAGE_CONTROL).equals(Selector.MAIN_PAGE_CONTROL_TEXT));
        logger.info("Anasayfada olundugu kontrol edildi");
    }

}
