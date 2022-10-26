package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    private ExtendedWebElement searchInput;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("/");
    }
}
