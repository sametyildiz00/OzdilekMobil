package org.pages;

import org.openqa.selenium.By;

public class Selector {

    public static final By APP_CONTROL = By.id("com.ozdilek.ozdilekteyim:id/textView");
    public static final String APP_CONTROL_TEXT = "Mağazadan Alışveriş";
    public static final By SHOPPING_BUTTON = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    public static final By MAIN_PAGE_CONTROL = By.id("com.ozdilek.ozdilekteyim:id/largeLabel");
    public static final String MAIN_PAGE_CONTROL_TEXT = "Anasayfa";
    public static final By CATEGORIES_BUTTON = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static final By CATEGORIES_CONTROL = By.xpath("//android.widget.RelativeLayout[8]/android.widget.TextView");
    public static final String CATEGORIES_CONTROL_TEXT = "Kırtasiye & Oyuncak";
    public static final By WOMAN_BUTTON = By.xpath("//android.widget.RelativeLayout[2]/android.widget.TextView");
    public static final By PANTS_BUTTON = By.xpath("//android.widget.RelativeLayout[4]");
    public static final By PANT_SELECTION = By.className("android.view.ViewGroup");
    public static final By PRODUCT_PAGE_CONTROL = By.xpath("//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
    public static final String PRODUCT_PAGE_CONTROL_TEXT = "SEPETE EKLE";
    public static final By ADD_TO_FAV = By.id("com.ozdilek.ozdilekteyim:id/relLayFav");
    public static final By LOGIN_PAGE_CONTROL = By.id("com.ozdilek.ozdilekteyim:id/btnFacebook");
    public static final String LOGIN_PAGE_CONTROL_TEXT = "Facebook ile Bağlan";
    public static final By EMAIL_ENTER = By.id("com.ozdilek.ozdilekteyim:id/etEposta");
    public static final By PASSWORD_ENTER = By.id("com.ozdilek.ozdilekteyim:id/etPassword");
    public static final String  EMAIL = "deneme@mail.com";
    public static final String  PASSWORD = "denemepassword";
    public static final By PREVIOUS_PAGE = By.id("com.ozdilek.ozdilekteyim:id/ivBack");
    public static final By SELECT_SIZE = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
    public static final By ADD_TO_BASKET = By.id("com.ozdilek.ozdilekteyim:id/cardAddToCart");




}
