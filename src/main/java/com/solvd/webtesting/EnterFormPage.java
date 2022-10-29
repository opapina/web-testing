package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EnterFormPage extends AbstractPage {

    @FindBy(xpath = "//*[@href='https://profile.onliner.by/registration']")
    private ExtendedWebElement registrationButton;

    public EnterFormPage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public RegistrationPage clickRegistrationButton() {
        registrationButton.click();
        return new RegistrationPage(getDriver());
    }

    public ExtendedWebElement getRegistrationButton() {
        return registrationButton;
    }
}
