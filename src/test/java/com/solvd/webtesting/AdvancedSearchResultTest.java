package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AdvancedSearchResultTest extends AbstractTest {

    @Test(testName = "verify that all search result contains 'Ballu' brand if checkbox selected")
    public void verifyHumidifierBalluResultTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        CatalogPage catalogPage = homePage.clickCatalogButton();
        AdvancedSearchPage advancedSearchPage = catalogPage.openHumidifierSection();
        FilterSearchPage filterSearchPage = advancedSearchPage.checkCheckbox("Ballu");
        List<String> names = filterSearchPage.fullNames();

        SoftAssert sa = new SoftAssert();
        names.forEach(name -> sa.assertTrue(name.contains("Ballu"),"The result doesn't have 'Ballu' in the name"));
        sa.assertAll();
    }


}
