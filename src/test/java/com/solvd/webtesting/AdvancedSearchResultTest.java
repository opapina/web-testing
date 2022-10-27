package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;


public class AdvancedSearchResultTest extends AbstractTest {

    @Test
    public void humidifierBalluResultTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.clickCatalogButton();
        CatalogPage catalogPage = new CatalogPage(getDriver());
        catalogPage.openHumidifierSection();
        catalogPage.checkCheckbox("Ballu");
        System.out.println("hello");
    }
}
