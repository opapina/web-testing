package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class,'b-main-navigation__link')]")
    private ExtendedWebElement catalogButton;

    @FindBy(xpath = "//*[@class='g-top-i']//*[contains(@class,'amount')]")
    private ExtendedWebElement cursButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public ExtendedWebElement getCatalogButton() {
        return catalogButton;
    }
    public CatalogPage clickCatalogButton() {
        catalogButton.click();
        return new CatalogPage(getDriver());
    }

    public CursPage clickCursButton() {
        cursButton.click();
        return new CursPage(getDriver());
    }
}
