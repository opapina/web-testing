package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@href,'https://catalog.onliner.by/humidifier?utm_source=catalog_tile&utm_medium=humidifier')]")
    private ExtendedWebElement humidifiersSection;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageURL("catalog");
    }

    public AdvancedSearchPage openHumidifierSection() {
        humidifiersSection.click();
        return new AdvancedSearchPage(getDriver());
    }
}

