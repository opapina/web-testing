package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WeatherPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='b-top-logo']//*[@href='https://www.onliner.by']")
    private ExtendedWebElement logoLinkButton;

    public WeatherPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("PROD.weather"));
    }

    public ExtendedWebElement getLogoLinkButton() {
        return logoLinkButton;
    }

    public HomePage clickLogoLinkButton() {
        logoLinkButton.click();
        return new HomePage(getDriver());
    }
}
