package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationFormTest extends AbstractTest {

    @DataProvider(name = "validData")
    public Object[][] validData() {
        return new Object[][]{
                {"r@k.com", "1$3j56S8"},
                {"q@kh.ru", "1$3j56S8@21$3j56S8@21$3j56S8@21$3j56S8@21$3j56S8@21$3j56S8@2!@#$"}
        };
    }

    @DataProvider(name = "invalidEmail")
    public Object[][] invalidEmail() {
        return new Object[][]{
                {"testtesxt"},
                {"12345678"},
                {"g@j."},
                {"ghj.com"}
        };
    }

    @DataProvider(name = "invalidLengthPassword")
    public Object[][] invalidLengthPassword() {
        return new Object[][]{
                {"1234567"},
                {"1$3j56S8@21$3j56S8@21$3j56S8@21$3j56S8@21$3j56S8@21$3j56S8@2!@#$2"}
        };
    }

    @Test(testName = "verify registration with valid data", dataProvider = "validData")
    public void verifyRegistrationPossibilityValidDataTest(String email, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        EnterFormPage enterFormPage = homePage.clickEnterAccountButton();
        RegistrationPage registrationPage = enterFormPage.clickRegistrationButton();

        registrationPage.typeLogin(email);
        registrationPage.typePassword(password);
        registrationPage.repeatPassword(password);
        registrationPage.checkedCheckbox();
        RegistrationPage registrationPageUpdated = registrationPage.clickRegistrationButton();

        Assert.assertTrue(registrationPage.getMoveToEmailButton().isPresent(), "Registration is not possible, check the data in fields");
        Assert.assertTrue(registrationPage.getMoveToEmailButton().isClickable(), "Registration is not possible, check the data in fields");
    }

    @Test(testName = "verify validation message typing invalid email", dataProvider = "invalidEmail")
    public void verifyValidationMessageInvalidEmailTest(String email) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        EnterFormPage enterFormPage = homePage.clickEnterAccountButton();
        RegistrationPage registrationPage = enterFormPage.clickRegistrationButton();

        registrationPage.typeLogin(email);
        registrationPage.typePassword("password");
        registrationPage.repeatPassword("password");

        Assert.assertTrue(registrationPage.getValidateEmailMessage().isPresent(), "Validation message is not displayed");
    }

    @Test(testName = "verify validation message if length of password is invalid", dataProvider = "invalidLengthPassword")
    public void verifyValidationMessageInvalidLengthPassword(String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        EnterFormPage enterFormPage = homePage.clickEnterAccountButton();
        RegistrationPage registrationPage = enterFormPage.clickRegistrationButton();

        registrationPage.typeLogin("r@mail.ru");
        registrationPage.typePassword(password);
        registrationPage.repeatPassword(password);
        registrationPage.checkedCheckbox();
        registrationPage.clickRegistrationButton();

        Assert.assertTrue(registrationPage.getValidatePasswordMessage().isPresent(), "Validation message is not displayed");
    }
}
