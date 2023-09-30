package main.cucumber;

import cucumber.api.java.Before;
import main.BrowserManager;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static main.pageObject.pages.HomePage.acceptCookiesButton;
import static main.pageObject.pages.HomePage.cookiesPopUp;

public class Hooks {

    BrowserManager browserManager = new BrowserManager();

    @Before(value = "@all", order = 1)
    public void prepareData() {
        browserManager.initDesktopDriver();
        open("https://ae.com");
    }

    @Before (value = "@all", order = 2)
    public void acceptCookies() {
        if ($(cookiesPopUp).isDisplayed()) {
            $(acceptCookiesButton).shouldBe(visible, Duration.ofSeconds(60)).click();
        }
    }
}
