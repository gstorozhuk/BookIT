package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.pages.HomePage;
import com.cybertek.bookIT.pages.KilimanjaroLandingPage;
import com.cybertek.bookIT.pages.LandingPage;
import com.cybertek.bookIT.utilities.ConfigurationReader;
import com.cybertek.bookIT.utilities.DB_Utilities;
import org.junit.Assert;
import org.junit.Test;

public class Verify_TV_in_Room {
    HomePage homePage=new HomePage();
    LandingPage landingPage=new LandingPage();
    KilimanjaroLandingPage kilimanjaroLandingPage=new KilimanjaroLandingPage();

   /* @Test
    public void tv_available(){
        homePage.homePageLanding();
        homePage.userField.sendKeys(ConfigurationReader.getProperty("loginStudent"));
        homePage.passwordField.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        homePage.loginButton.click();

        landingPage.kilimanjaro.click();

        Assert.assertTrue(kilimanjaroLandingPage.hasTV.isDisplayed());

    */
   public static void main(String[] args) {
       boolean KilimanjaroHasTV=true;
       System.out.println(KilimanjaroHasTV);

       DB_Utilities.createConnection();
       System.out.println(KilimanjaroHasTV);

      // DB_Utilities.runQuery("SELECT withtv FROM room WHERE name='kilimanjaro'").toString();
     //  String bookCountDB_Str=DB_Utilities.getFirstCellData();

   }








}
