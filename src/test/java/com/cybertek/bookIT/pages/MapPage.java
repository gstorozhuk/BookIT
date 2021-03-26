package com.cybertek.bookIT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage extends BasePage {
    @FindBy (xpath = "//img[@src='assets/images/six.svg']")
    public WebElement capacityImage;
    @FindBy(css = "span[class='room-name has-text-centered']")
    public WebElement kilimanjaro;
}
