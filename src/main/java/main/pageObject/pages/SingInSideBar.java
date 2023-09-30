package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SingInSideBar {

    @Description("Поле ввода email")
    public static final By inputEmailField =
            By.xpath("//input[contains(@class, 'form-input-username')]");

    @Description("Поле ввода пароля")
    public static final By inputPasswordField =
            By.xpath("//input[contains(@class, 'form-input-password')]");
    @Description("Кнопка входа в аккаунт")

    public static final By loginButton =
            By.xpath("//button[contains(@class, 'qa-btn-login')]");

    @Description("Текст ошибки при неверном логине или пароле")
    public static final By errorTextForIncorrectLoginOrPassword =
            By.xpath("//div[contains(@class, 'qa-error-help-block')]");
}
