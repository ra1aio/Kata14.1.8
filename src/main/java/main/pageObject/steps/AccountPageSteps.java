package main.pageObject.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.AccountPage.textAccountName;

public class AccountPageSteps {

    @Step("Проверка имени аккаунта")
    @Then("The account page opens with the text {string}")
    public void verifyAccountName(String name) {
        $(textAccountName).shouldHave(Condition.exactText(name + "'s Account"));
    }
}
