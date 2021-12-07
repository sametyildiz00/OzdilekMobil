package org.pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.test.BaseTest;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ProductPage extends BaseTest {

    @Step("<selectorXpath> xpath'li elementlerden rastgele seç")
    public void randomSelect(String selectorXpath) {
        List<MobileElement> elementList = appiumDriver.findElements(By.xpath(selectorXpath));
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(4);
        elementList.get(randomIndex).click();
        logger.info("Xpath ile rastgele urun secildi");
    }

    @Step("Kategoriler sayfasina gelindigini kontrol et")
    public void categoriesPageControl() {
        Assert.assertFalse("Kategoriler sayfasında degilsiniz", appiumDriver.findElement(Selector.CATEGORIES_CONTROL).equals(Selector.CATEGORIES_CONTROL_TEXT));
        logger.info("Kategoriler sayfasinda olundugu kontrol edildi");
    }

    @Step("Rastgele bir pantolon sec")
    public void pantSelect() {
        List<MobileElement> elementList = appiumDriver.findElements(Selector.PANT_SELECTION);
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(4);
        elementList.get(randomIndex).click();
        logger.info("Rastgele bir pantolon secildi");
    }

    @Step("Urun sayfasina gelindigini kontrol et")
    public void productPageControl() {
        Assert.assertFalse("Urun sayfasında degilsiniz", appiumDriver.findElement(Selector.PRODUCT_PAGE_CONTROL).equals(Selector.PRODUCT_PAGE_CONTROL_TEXT));
        logger.info("Urun sayfasinda olundugu kontrol edildi");
    }

    @Step("Urunu favorilere ekle")
    public void addToFav() {
        appiumDriver.findElement(Selector.ADD_TO_FAV).click();
        logger.info("Urun favorilere eklendi");
    }

    @Step("Giris yap sayfasinda oldugunu kontrol et")
    public void loginPageControl() {
        Assert.assertFalse("Giris yap sayfasında degilsiniz", appiumDriver.findElement(Selector.LOGIN_PAGE_CONTROL).equals(Selector.LOGIN_PAGE_CONTROL_TEXT));
        logger.info("Giris yap sayfasinda oldugunu kontrol edildi");
    }

    @Step("Beden sec")
    public void selectSize() {
        appiumDriver.findElement(Selector.SELECT_SIZE).click();
        logger.info("Beden secimi yapildi");
    }

    @Step("Sepete ekle")
    public void addToBasket() {
        appiumDriver.findElement(Selector.ADD_TO_BASKET).click();
        logger.info("Sepete eklendi");
    }


    @Step("Swipe up the page")
    public void swipeUp() {
        int startX = 538;
        int startY = 1947;
        int endX = 538;
        int endY = 30;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.press(point(startX, startY)).moveTo(point(endX, endY)).release().perform();
        logger.info("Sayfa kaydiriliyor..");
    }

}
