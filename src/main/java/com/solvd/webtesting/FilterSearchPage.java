package com.solvd.webtesting;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class FilterSearchPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class,'schema-product__group')]")
    private List<SearchResultBlock> searchResultBlocks;

    @FindBy(xpath = "//*[@class='popover-style__content']")
    private PopoverBlock popoverBlock;

    public FilterSearchPage(WebDriver driver) {
        super(driver);
    }

    public List<SearchResultBlock> getSearchResultBlocks() {
        return searchResultBlocks;
    }

    public List<String> getFullNames() {
        if (popoverBlock.isUIObjectPresent()) {
            getPopoverBlock().clickYesButton();
        }
        return searchResultBlocks.stream()
                .map(SearchResultBlock::getFullNameText)
                .collect(Collectors.toList());
    }

    public void setSearchResultBlocks(List<SearchResultBlock> searchResultBlocks) {
        this.searchResultBlocks = searchResultBlocks;
    }

    public PopoverBlock getPopoverBlock() {
        return popoverBlock;
    }
}
