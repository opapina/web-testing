package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class,'auth-input__wrapper')]//*[contains(@placeholder,'e-mail')]")
    private ExtendedWebElement loginField;

    @FindBy(xpath = "//*[contains(@class,'auth-input__wrapper')]//*[contains(@placeholder,'Придумайте пароль')]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[contains(@class,'auth-input__wrapper')]//*[contains(@placeholder,'Повторите пароль')]")
    private ExtendedWebElement repeatPasswordField;

    @FindBy(xpath = "//*[@class='i-checkbox__faux']")
    private ExtendedWebElement checkboxPolicy;

    @FindBy(xpath = "//*[@type='submit']")
    private ExtendedWebElement registrationButton;

    @FindBy(xpath = " //*[contains(@href,'http://mail')]")
    private ExtendedWebElement moveToEmailButton;

    @FindBy(xpath = "//*[contains(text(),'Некорректный')]")
    private ExtendedWebElement validateEmailMessage;

    @FindBy(xpath = "//*[contains(text(),'Пароль должен быть')]")
    private ExtendedWebElement validatePasswordMessage;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("PROD.registration"));
    }

    public void typeLogin(String email) {
        loginField.type(email);
    }

    public void typePassword(String password) {
        passwordField.type(password);
    }

    public void repeatPassword(String password) {
        repeatPasswordField.type(password);
    }

    public void checkedCheckbox() {
        checkboxPolicy.check();
    }

    public RegistrationPage clickRegistrationButton() {
        registrationButton.click();
        return new RegistrationPage(getDriver());
    }

    public ExtendedWebElement getCheckboxPolicy() {
        return checkboxPolicy;
    }

    public ExtendedWebElement getRegistrationButton() {
        return registrationButton;
    }

    public ExtendedWebElement getLoginField() {
        return loginField;
    }

    public ExtendedWebElement getPasswordField() {
        return passwordField;
    }

    public ExtendedWebElement getRepeatPasswordField() {
        return repeatPasswordField;
    }

    public ExtendedWebElement getMoveToEmailButton() {
        return moveToEmailButton;
    }

    public ExtendedWebElement getValidateEmailMessage() {
        return validateEmailMessage;
    }

    public ExtendedWebElement getValidatePasswordMessage() {
        return validatePasswordMessage;
    }
}
