package main.pageObject.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.LoginSideBar.loginAccountText;

public class LoginSideBarSteps {

    @Step("Сравнение имени пользователя")
    @Then("The account's side bar opens with the text {string}")
    public void verifyAccountName (String name) {
        $(loginAccountText).shouldHave(Condition.exactText(name + "'s Account"));
    }
}
