package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.pages.HomePage;
import com.cybertek.bookIT.pages.LandingPage;
import com.cybertek.bookIT.pages.MapPage;
import com.cybertek.bookIT.utilities.BrowserUtils;
import com.cybertek.bookIT.utilities.ConfigurationReader;
import com.cybertek.bookIT.utilities.DB_Utilities;
import com.cybertek.bookIT.utilities.Driver;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ImageNumberTest {
    HomePage hp = new HomePage();
    MapPage mp = new MapPage();
    LandingPage lp = new LandingPage();
    @Test
    public void checkImageNumber() throws IOException, InterruptedException {
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        hp.homePageLanding();
        String username = ConfigurationReader.getProperty("loginStudent");
        String password = ConfigurationReader.getProperty("loginPassword");

        hp.userField.sendKeys(username);
        hp.passwordField.sendKeys(password);
        hp.loginButton.click();
        mp.kilimanjaro.click();

        String actualResult = mp.capacityImage.getAttribute("src");
        String expectedResult = "six";
        actualResult = actualResult.substring(60,63);
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult,actualResult);

        DB_Utilities.createConnection();
        DB_Utilities.runQuery("SELECT capacity FROM room WHERE name = 'kilimanjaro'");
        String capacityValueDB = DB_Utilities.getCellValue(1, 1);
        switch (capacityValueDB) {
            case "6" :
                capacityValueDB = "six";
        }
        Assert.assertEquals(expectedResult,capacityValueDB);
    }
}
