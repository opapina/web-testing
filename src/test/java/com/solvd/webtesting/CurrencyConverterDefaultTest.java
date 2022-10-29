package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CurrencyConverterDefaultTest extends AbstractTest {

    @Test(testName = "verify that default values of currency converter are USD and BYN")
    public void verifyCursConverterDefaultUsdByTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        ConverterPage converterPage = homePage.clickConverterButton();
        String defaultIn = converterPage.getDropDownCurrencyIn().getSelectedValue();
        String defaultOut = converterPage.getGetDropDownCurrencyOut().getSelectedValue();

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(defaultIn, "USD", "default in is not USD");
        sa.assertEquals(defaultOut, "BYN", "default out is not BYN");

        sa.assertAll();
    }
}
