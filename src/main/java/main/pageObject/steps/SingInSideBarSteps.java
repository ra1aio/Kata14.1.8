package main.pageObject.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.SingInSideBar.*;

public class SingInSideBarSteps {

    @Step("Ввод email")
    @When("The user fills in the email field {string}")
    public void inputEmail(String email) {
        $(inputEmailField).setValue(email);
    }

    @Step("Ввод пароля")
    @And("The user fills in the password field {string}")
    public void inputPassword(String password) {
        $(inputPasswordField).setValue(password);
    }

    @Step("Нажать кнопку входа в аккаунт")
    @And("The user clicks the account login button")
    public void clickSingInButton() {
        $(loginButton).click();
    }

    @Step("Проверка текста ошибки при отсутствие логина")
    @Then("A message appears with a blank email error")
    public void checkingEmailErrorText() {
        $(errorTextForIncorrectLoginOrPassword).
                shouldHave(Condition.exactText("Please enter your email address."));
    }

    @Step("Проверка текста ошибки при отсутствие пароля")
    @Then("A message appears with a blank password error")
    public void checkingPasswordErrorText() {
        $(errorTextForIncorrectLoginOrPassword).
                shouldHave(Condition.exactText("Please enter your password."));
    }

    @Step("Проверка текста ошибки при вводе незарегистрированного email")
    @Then("Checking the error text when entering an unregistered email")
    public void checkingUnregisteredEmailErrorText() {
        $(errorTextForIncorrectLoginOrPassword).
                shouldHave(Condition.exactText("Your user name and password are incorrect."));
    }
}
