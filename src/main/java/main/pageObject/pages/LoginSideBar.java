package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class LoginSideBar {

    @Description("Текст с именем пользователя")
    public static final By loginAccountText = By.xpath("//h2[@class='modal-title']");
}
