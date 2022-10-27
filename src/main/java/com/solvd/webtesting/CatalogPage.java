package com.solvd.webtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;

public class CatalogPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@href,'https://catalog.onliner.by/humidifier?utm_source=catalog_tile&utm_medium=humidifier')]")
    private ExtendedWebElement humidifiersSection;

    @FindBy(xpath = "//*[contains(@class,'checkbox-item')]")
    private List<Checkbox> checkboxes;

    public CatalogPage(WebDriver driver) {
        super(driver);
        setPageURL("catalog");
    }

    public void openHumidifierSection() {
        humidifiersSection.click();
    }

    public void checkCheckbox(String name) {
        int i;
        for(i = 0;i < checkboxes.size(); i++) {
           if (checkboxes.get(i).getCheckboxName().getText().equals(name)) {
               return;
           }
        }
        Checkbox nch = new Checkbox(driver);
        checkboxes.get(i).click
//        checkboxes.forEach(checkbox -> {
//            if (checkbox.getCheckboxName().getText().equals(name)) {
//                Checkbox;
//            }
//        });
    }
}
