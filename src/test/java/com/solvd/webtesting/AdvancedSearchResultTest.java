package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdvancedSearchResultTest extends AbstractTest {

    @Test
    public void humidifierBalluResultTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.clickCatalogButton();
        CatalogPage catalogPage = new CatalogPage(getDriver());
        catalogPage.openHumidifierSection();
        catalogPage.checkCheckbox("Ballu");

        SoftAssert sa = new SoftAssert();
        catalogPage.getSearchResultBlocks()
                        .forEach(searchResultBlock -> sa.assertTrue(searchResultBlock.getFullNameText().toLowerCase().contains("Ballu")));
        sa.assertAll();

        System.out.println("hello");
    }
}
