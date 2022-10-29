package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class,'auth-input__wrapper')]//*[contains(@placeholder,'e-mail')]")
    private ExtendedWebElement loginField;

    @FindBy(xpath = "//*[@class='auth-form__line auth-form__line_condensed']//*[contains(@type,'password')]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//*[contains(@autocomplete,'repeatPassword')]")
    private ExtendedWebElement repeatPasswordField;

    @FindBy(xpath = "//*[@class='i-checkbox__faux']")
    private ExtendedWebElement checkboxPolicy;

    @FindBy(xpath = "//*[@type='submit']")
    private ExtendedWebElement registrationButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("PROD.registration"));
    }

    public void typeLogin(String email) {
        loginField.type(email);
    }

    public void typePassword(String password) {
        loginField.type(password);
    }

    public void checkedCheckbox() {
        checkboxPolicy.check();
    }

    public void clickRegistrationButton() {
        registrationButton.click();
    }

    public ExtendedWebElement getCheckboxPolicy() {
        return checkboxPolicy;
    }

    public ExtendedWebElement getRegistrationButton() {
        return registrationButton;
    }

    public void repeatPassword(String password) {
        loginField.type(password);
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
}
