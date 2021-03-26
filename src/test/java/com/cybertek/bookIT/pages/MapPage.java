package com.cybertek.bookIT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage extends BasePage {
    @FindBy (css = ".room-info-icon")
    public WebElement capacityImage;
    @FindBy(xpath = "//*[@id=\"room-121\"]/span")
    public WebElement kilimanjaro;
}
