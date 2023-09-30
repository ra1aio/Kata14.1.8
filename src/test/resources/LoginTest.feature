# language: en
@all
Feature: Working with login

  # Ѕаг. ¬ход не происходит
  @positive
  Scenario: Authorization under an existing user
    Then The cookie-pop-up is no longer displayed
    When The user clicks on the account button
    And The user clicks the Sing In button
    When The user fills in the email field "srtdf@sda.re"
    And The user fills in the password field "Pa$$w0rd"
    And The user clicks the account login button
    Then The account's side bar opens with the text "Ivan's Account"

  @negative
  Scenario: Login without filling in email
    Then The cookie-pop-up is no longer displayed
    When The user clicks on the account button
    And The user clicks the Sing In button
    And The user fills in the password field "Pa$$w0rd"
    And The user clicks the account login button
    Then A message appears with a blank email error

  @negative
  Scenario: Login without filling in password
    Then The cookie-pop-up is no longer displayed
    When The user clicks on the account button
    And The user clicks the Sing In button
    When The user fills in the email field "srtdf@sda.re"
    And The user clicks the account login button
    Then A message appears with a blank password error

  @negative
  Scenario Outline: Login with an unregistered email
    Then The cookie-pop-up is no longer displayed
    When The user clicks on the account button
    And The user clicks the Sing In button
    When The user fills in the email field "<Email>"
    And The user fills in the password field "Pa$$w0rd"
    And The user clicks the account login button
    Then Checking the error text when entering an unregistered email
    Examples:
      | Email            |
      | rrttyy@gmail.com |
      | erer@gmail.com |
      | jrg6grw@gmail.com |