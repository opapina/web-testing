package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class CursPage extends AbstractPage {

    private ExtendedWebElement dropDownCurrencyIn;

    private ExtendedWebElement getDropDownCurrencyOut;

    public CursPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getDropDownCurrencyIn() {
        return dropDownCurrencyIn;
    }

    public ExtendedWebElement getGetDropDownCurrencyOut() {
        return getDropDownCurrencyOut;
    }
}
