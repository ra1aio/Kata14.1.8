# language: en
@all
Feature: Working with search

  Scenario Outline: Search by article "<Article>"
    Then The cookie-pop-up is no longer displayed
    Given The user clicks on the search button
    When The user enters text in the search field "<Article>"
    And Clicks on the search button
    Then A page opens with <Quantity> elements

    Examples:
      | Article | Quantity |
      | 0436    | 21       |
      | 0355    | 20       |
      | 1499    | 28       |