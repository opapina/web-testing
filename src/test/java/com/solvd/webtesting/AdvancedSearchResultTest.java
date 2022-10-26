package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;


public class AdvancedSearchResultTest extends AbstractTest {

    @Test
    public void AdvancedSearchResultTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        System.out.println("hello");
    }
}
