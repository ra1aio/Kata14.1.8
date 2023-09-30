package main.pageObject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.AccountSideBar.createAccountButton;
import static main.pageObject.pages.AccountSideBar.goToLoginPageButton;

public class AccountSideBarSteps {

    @Step("Нажать кнопку входа в аккаунт")
    @And ("The user clicks the Sing In button")
    public void clickSingInButton() {
        $(goToLoginPageButton).click();
    }

    @Step("Нажать кнопку создания аккаунта")
    @And("Clicks on the create account button")
    public void clickCreateAccountButton() {
        $(createAccountButton).click();
    }

}
