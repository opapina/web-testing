package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@class='b-main-navigation__link']//*[contains(text(),'Каталог')]")
    private ExtendedWebElement catalogButton;

    @FindBy(xpath = "//*[@class='g-top-i']//*[contains(@class,'amount')]")
    private ExtendedWebElement converterButton;

    @FindBy(xpath = "//*[@class='g-top-i']//*[contains(@class,'phenomena-icon')]")
    private ExtendedWebElement weatherIcon;

    @FindBy(xpath="//*[@class='g-top-i']//*[@class='_u js-weather']")
    private ExtendedWebElement weatherTempIcon;

    @FindBy(xpath = "//*[contains(@class,'auth-bar')]//*[contains(text(),'Вход')]")
    private ExtendedWebElement enterAccountButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public CatalogPage clickCatalogButton() {
        catalogButton.click();
        return new CatalogPage(getDriver());
    }

    public ConverterPage clickConverterButton() {
        converterButton.click();
        return new ConverterPage(getDriver());
    }

    public WeatherPage clickWeatherIcon() {
        weatherIcon.click();
        return new WeatherPage(getDriver());
    }

    public WeatherPage clickWeatherTempIcon() {
        weatherTempIcon.click();
        return new WeatherPage(getDriver());
    }

    public EnterFormPage clickEnterAccountButton() {
        enterAccountButton.click();
        return new EnterFormPage(getDriver());
    }

    public ExtendedWebElement getCatalogButton() {
        return catalogButton;
    }

    public ExtendedWebElement getConverterButton() {
        return converterButton;
    }

    public ExtendedWebElement getWeatherIcon() {
        return weatherIcon;
    }

    public ExtendedWebElement getWeatherTempIcon() {
        return weatherTempIcon;
    }

    public ExtendedWebElement getEnterAccountButton() {
        return enterAccountButton;
    }
}
