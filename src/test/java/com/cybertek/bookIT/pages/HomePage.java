package com.cybertek.bookIT.pages;

import com.cybertek.bookIT.utilities.BrowserUtils;
import com.cybertek.bookIT.utilities.ConfigurationReader;
import com.cybertek.bookIT.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    BrowserUtils utils = new BrowserUtils();

    @FindBy(xpath = "(//input[@_ngcontent-c1])[1]")
    public WebElement userField;

    @FindBy(xpath = "(//input[@_ngcontent-c1])[2]")
    public WebElement passwordField;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='button navbar-burger is-dark']")
    public WebElement myMenu;

    @FindBy(xpath = "//a[@class='navbar-item button is-danger']")
    public WebElement signOutButton;


    public void homePageLanding() {
        Driver.get().get(ConfigurationReader.getProperty("URL"));
        String expectedTab = "bookit";
        String actualTab = Driver.get().getTitle();
        Assert.assertEquals(expectedTab, actualTab);

    }

    public void loginUser(String Username, String Password) {

        userField.sendKeys(Username);
        passwordField.sendKeys(Password);
        BrowserUtils.wait(3);
        loginButton.click();
        BrowserUtils.wait(10);


    }

    public void logoutUser() {
        BrowserUtils.wait(3);
        utils.clickWithJS(myMenu);
        BrowserUtils.wait(3);
        utils.clickWithJS(signOutButton);

        loginButton.click(); // to continue the loop
//adding file to commit
        //try #2
    }
}