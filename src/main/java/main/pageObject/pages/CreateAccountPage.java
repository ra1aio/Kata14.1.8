package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class CreateAccountPage {

    @Description("Поле ввода email")
    public static final By inputEmailField =
            By.xpath("//input[@placeholder='Email']");

    @Description("Поле ввода имени")
    public static final By inputFirstNameField =
            By.xpath("//input[@placeholder='First Name']");

    @Description("Поле ввода фамилии")
    public static final By inputLastNameField =
            By.xpath("//input[@placeholder='Last Name']");

    @Description("Поле ввода пароля")
    public static final By inputPasswordField =
            By.xpath("//input[@placeholder='Password']");

    @Description("Поле подтверждения пароля")
    public static final By inputConfirmPasswordField =
            By.xpath("//input[@placeholder='Confirm Password']");

    @Description("Поле ввода почтового индекса")
    public static final By inputZipCodeField =
            By.xpath("//input[@placeholder='Zip Code']");

    @Description("Список выбора месяца рождения")
    public static final By monthOfBirthSelection =
            By.xpath("//select[@name='month']/option[text()='April']");

    @Description("Список выбора дня рождения")
    public static final By dayOfBirthSelection =
            By.xpath("//select[@name='day']/option[text()='1']");

    @Description("Чекбокс принятия условий")
    public static final By conditionsAcceptanceCheckbox =
            By.xpath("//label[@class='aeo-checkbox-label clickable']");

    @Description("Кнопка создания аккаунта")
    public static final By createAccountButton =
            By.xpath("//button[contains(@class, 'qa-btn-register')]");
}
