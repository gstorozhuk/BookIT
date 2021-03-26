package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.pages.HomePage;
import com.cybertek.bookIT.pages.KilimanjaroLandingPage;
import com.cybertek.bookIT.pages.LandingPage;
import com.cybertek.bookIT.utilities.ConfigurationReader;
import com.cybertek.bookIT.utilities.DB_Utilities;
import com.cybertek.bookIT.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class Verify_TV_in_Room {
    HomePage homePage=new HomePage();
    LandingPage landingPage=new LandingPage();
    KilimanjaroLandingPage kilimanjaroLandingPage=new KilimanjaroLandingPage();

    @Test
    public void tv_available() {
        homePage.userField.sendKeys(ConfigurationReader.getProperty("loginStudent"));
        homePage.passwordField.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        homePage.loginButton.click();
        landingPage.kilimanjaro.click();

        Assert.assertTrue(kilimanjaroLandingPage.hasTV.isDisplayed());
    }
   public static void main(String[] args) throws SQLException {
       boolean KilimanjaroHasTV=true;
       DB_Utilities.createConnection();

       DB_Utilities.runQuery(   "SELECT withtv\n" +
                                                   "FROM room\n" +
                                                   "WHERE id = 115");
       String str =  DB_Utilities.getCellValue(1, 1);
       System.out.println(str);
   }








}
