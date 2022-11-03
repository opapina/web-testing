package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PopoverBlock extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(text(),'Да, верно')]")
    private ExtendedWebElement yesButton;

    @FindBy(xpath = ".//*[contains(text(),'Нет, другой')]")
    private ExtendedWebElement noButton;

    public PopoverBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getYesButton() {
        return yesButton;
    }

    public ExtendedWebElement getNoButton() {
        return noButton;
    }

    public void clickYesButton() {
        yesButton.click();
    }
}
