package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SearchResultPage {

    @Description("Список результатов поиска")
    public static final By searchResultList =
            By.xpath("//div[contains(@class, 'product-tile qa-product-tile __eadf2')]");
}
