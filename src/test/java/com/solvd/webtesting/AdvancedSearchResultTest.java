package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AdvancedSearchResultTest extends AbstractTest {

    @Test
    public void verifyHumidifierBalluResultTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        CatalogPage catalogPage = homePage.clickCatalogButton();
        AdvancedSearchPage advancedSearchPage = catalogPage.openHumidifierSection();
        FilterSearchPage filterSearchPage = advancedSearchPage.checkCheckbox("Ballu");
        List<String> names = filterSearchPage.fullNames();

        SoftAssert sa = new SoftAssert();
        names.forEach(name -> sa.assertTrue(name.contains("Ballu")));
        sa.assertAll();

        System.out.println("hello");
    }

    public void verifyCursConverterTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        CursPage cursPage = homePage.clickCursButton();
        cursPage.getDropDownCurrencyIn();
    }
}
