package com.cybertek.bookIT.pages;

import com.cybertek.bookIT.utilities.ConfigurationReader;
import com.cybertek.bookIT.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy (xpath = "(//input[@_ngcontent-c1])[1]")
    public WebElement userField;

    @FindBy (xpath = "(//input[@_ngcontent-c1])[2]")
    public WebElement passwordField;

    @FindBy (xpath = "//button")
    public WebElement loginButton;



    public void homePageLanding(){
      Driver.get().get(ConfigurationReader.getProperty("URL"));
        String expectedTab = "bookit";
        String actualTab = Driver.get().getTitle();
        Assert.assertEquals(expectedTab, actualTab);

    }


}
