package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class HomePage {

    @Description("Кнопка принятия cookies")
    public static final By acceptCookiesButton = By.id("onetrust-accept-btn-handler");

    @Description("Окно с принятием Cookie")
    public static final By cookiesPopUp = By.xpath("//div[@id='onetrust-banner-sdk']");

    @Description("Кнопка открытия формы поиска")
    public static final By searchButton =
            By.xpath("//button[contains(@class, 'btn-link qa-btn-search-cta')]");

    @Description("Кнопка открытия формы аккаунта")
    public static final By accountButton =
            By.xpath("//a[contains(@class, 'qa-show-sidetray-account')]");
}
