package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultBlock extends AbstractUIObject {

    @FindBy(xpath = ".//*[@class='schema-product__title']//*[contains(@data-bind,'html: product.')]")
    private ExtendedWebElement fullName;

    public SearchResultBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getFullName() {
        return fullName;
    }

    public void setFullName(ExtendedWebElement fullName) {
        this.fullName = fullName;
    }

    public String getFullNameText() {
        return fullName.getText();
    }
}
