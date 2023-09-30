package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SearchSideBar {

    @Description("Поле ввода поискового запроса")
    public static final By searchField =
            By.xpath("//input[contains(@class, 'form-input-search')]");

    @Description("Кнопка отправки поискового запроса")
    public static final By searchButton =
            By.xpath("//button[@aria-label='Search']");
}
