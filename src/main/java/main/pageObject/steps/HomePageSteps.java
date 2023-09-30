package main.pageObject.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static main.pageObject.pages.HomePage.*;

public class HomePageSteps {

    /*@Step("Открытие главной страницы")
    @Given("The user opens the main page")
    public void openHomePage() {
        open("https://ae.com");
    }*/

    /*@Step("Нажать на кнопку принятия cookies")
    @Given("The user accepts cookies")
    public void acceptCookies() {
        $(acceptCookiesButton).shouldBe(visible, Duration.ofSeconds(60)).click();
    }*/

    @Then("The cookie-pop-up is no longer displayed")
    public void cookiePopUpInvisible() {
            $(cookiesPopUp).shouldBe(disappear);
    }

    @Step("Нажать на кнопку поиска")
    @When("The user clicks on the search button")
    public void clickSearchButton() {
        $(searchButton).click();
    }

    @Step("Нажать на кнопку аккаунта")
    @When ("The user clicks on the account button")
    public void clickAccountButton() {
        $(accountButton).click();
    }
}

