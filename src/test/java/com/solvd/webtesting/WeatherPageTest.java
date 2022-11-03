package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WeatherPageTest extends AbstractTest {

    @Test(testName = "verify that all weather icons will be lead to correct URL")
    public void verifyMovingToCorrectUrlTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        WeatherPage weatherPageFirst = homePage.clickWeatherIcon();
        String urlFirst = weatherPageFirst.getPageURL();
        weatherPageFirst.clickLogoLinkButton();
        WeatherPage weatherPageSecond = homePage.clickWeatherTempIcon();
        String urlSecond = weatherPageSecond.getPageURL();
        weatherPageSecond.clickLogoLinkButton();

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(urlFirst, "https://pogoda.onliner.by/", "The weatherIcon lead to incorrect URL");
        sa.assertEquals(urlSecond, "https://pogoda.onliner.by/", "The weatherTempIcon lead to incorrect URL");
        sa.assertAll();
    }
}
