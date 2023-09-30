package main.pageObject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;
import main.utils.EmailGenerator;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.CreateAccountPage.*;

public class CreateAccountSteps {

    @Step("Ввод email")
    @When("The user fills in the email field")
    public void inputEmail() {
        $(inputEmailField).setValue(EmailGenerator.getEmail("gmail.com"));
    }

    @Step("Ввод имени")
    @And("Fills in the name field {string}")
    public void inputFirstName(String firstName) {
        $(inputFirstNameField).setValue(firstName);
    }

    @Step("Ввод фамилии")
    @And("Fills in the last name field {string}")
    public void inputLastName(String lastName) {
        $(inputLastNameField).setValue(lastName);
    }

    @Step("Ввод пароля")
    @And("Fills in the password field {string}")
    public void inputPassword(String password) {
        $(inputPasswordField).setValue(password);
    }

    @Step("Ввод подтверждения пароля")
    @And("Fills in the password confirmation field {string}")
    public void inputConfirmPassword(String confirmPassword) {
        $(inputConfirmPasswordField).setValue(confirmPassword);
    }

    @Step("Ввод почтового индекса")
    @And("Fills in the Zip Code field {string}")
    public void inputZipCode(String zipCode) {
        $(inputZipCodeField).setValue(zipCode);
    }

    @Step("Ввод месяца рождения")
    @And("Selects the month of birth")
    public void inputMonthOfBirth() {
        $(monthOfBirthSelection).click();
    }

    @Step("Ввод дня рождения")
    @And("Selects the day of birth")
    public void inputDayOfBirth() {
        $(dayOfBirthSelection).click();
    }

    @Step("Чек-бокс соглашение с условиями")
    @And("Accepts the terms and conditions")
    public void acceptTermsCheckBox() {
        $(conditionsAcceptanceCheckbox).click();
    }

    @Step("Кнопка создания учетной записи")
    @And("Clicks on the create new account button")
    public void createAccountButton() {
        $(createAccountButton).click();
    }
}
