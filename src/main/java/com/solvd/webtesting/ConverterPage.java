package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ConverterPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class,'converter-i')]//*[@id='currency-in']")
    private ExtendedWebElement dropDownCurrencyIn;

    @FindBy(xpath = "//*[contains(@class,'converter__out')]//*[@id='currency-out']")
    private ExtendedWebElement getDropDownCurrencyOut;

    public ConverterPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("PROD.converter"));
    }

    public ExtendedWebElement getDropDownCurrencyIn() {
        return dropDownCurrencyIn;
    }

    public ExtendedWebElement getGetDropDownCurrencyOut() {
        return getDropDownCurrencyOut;
    }
}
