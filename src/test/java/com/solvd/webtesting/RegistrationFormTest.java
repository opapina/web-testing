package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;

public class RegistrationFormTest extends AbstractTest {

    @Test(testName = "verify registration with valid data")
    public void verifyRegistrationPossibilityValidDataTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        EnterFormPage enterFormPage = homePage.clickEnterAccountButton();
        RegistrationPage registrationPage = enterFormPage.clickRegistrationButton();

        registrationPage.typeLogin("q@r.com");
        registrationPage.getPasswordField();
        registrationPage.typePassword("12345678");
        registrationPage.getRepeatPasswordField();
        registrationPage.repeatPassword("12345678");
        registrationPage.checkedCheckbox();
        registrationPage.clickRegistrationButton();

        System.out.println("");
    }
}
