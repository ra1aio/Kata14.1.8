# language: en
@all
Feature: Working with Create Account

  # Баг. Кнопка "Создать аккаунт не нажимается"
  @positive
  Scenario: Working with account creation
    Then The cookie-pop-up is no longer displayed
    When The user clicks on the account button
    And Clicks on the create account button
    When The user fills in the email field
    And Fills in the name field "Albert"
    And Fills in the last name field "Einstein"
    And Fills in the password field "Pa$$w0rd"
    And Fills in the password confirmation field "Pa$$w0rd"
    And Fills in the Zip Code field "00772"
    And Selects the month of birth
    And Selects the day of birth
    And Accepts the terms and conditions
    And Clicks on the create new account button
    Then The account page opens with the text "Albert's Account"