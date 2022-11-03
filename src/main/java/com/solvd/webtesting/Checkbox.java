package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Checkbox extends AbstractUIObject {

    @FindBy(xpath = ".//*contains(@class,'i-checkbox')]")
    private ExtendedWebElement checkbox;

    @FindBy(xpath = ".//*[contains(@class,'schema-filter__checkbox-text')]")
    private ExtendedWebElement checkboxName;

    public Checkbox(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getCheckboxName() {
        return checkboxName;
    }

    public String getCheckboxNameText() {
        return checkboxName.getText();
    }
}
