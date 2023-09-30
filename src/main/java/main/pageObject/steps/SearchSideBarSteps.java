package main.pageObject.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.SearchSideBar.searchButton;
import static main.pageObject.pages.SearchSideBar.searchField;

public class SearchSideBarSteps {

    @When("The user enters text in the search field {string}")
    public void inputStringSearch(String articleNumber) {
        $(searchField).setValue(articleNumber);

    }

    @And("Clicks on the search button")
    public void clickSearchButton() {
        $(searchButton).click();
    }
}
