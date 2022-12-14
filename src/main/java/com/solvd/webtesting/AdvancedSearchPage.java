package com.solvd.webtesting;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AdvancedSearchPage extends AbstractPage {

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@class,'checkbox-item')]")
    private final List<Checkbox> checkboxes = this.getCheckboxes();

    public FilterSearchPage checkCheckbox(String name) {
        List<String> checkboxNames = new ArrayList<>();
        checkboxes.forEach(checkbox -> checkboxNames.add(checkbox.getCheckboxNameText()));
        int numberOfCheckedCheckbox = 0;
        for (int i = 0; i < checkboxNames.size(); i++) {
            if (checkboxNames.get(i).equals(name)) {
                numberOfCheckedCheckbox = i;
            }
        }
        Checkbox checkedCheckbox = checkboxes.get(numberOfCheckedCheckbox);
        checkedCheckbox.getCheckboxName().check();
        return new FilterSearchPage(getDriver());
    }

    private List<Checkbox> getCheckboxes() {
        return checkboxes;
    }
}
