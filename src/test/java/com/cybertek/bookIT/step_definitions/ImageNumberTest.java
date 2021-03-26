package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.pages.HomePage;
import com.cybertek.bookIT.pages.LandingPage;
import com.cybertek.bookIT.pages.MapPage;
import com.cybertek.bookIT.utilities.BrowserUtils;
import com.cybertek.bookIT.utilities.ConfigurationReader;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageNumberTest {
    HomePage hp = new HomePage();
    MapPage mp = new MapPage();
    LandingPage lp = new LandingPage();
    @Test
    public void checkImageNumber() throws IOException {
        hp.homePageLanding();
        String username = ConfigurationReader.getProperty("loginStudent");
        String password = ConfigurationReader.getProperty("loginPassword");


        BrowserUtils.verifyElementDisplayed(hp.userField);
        hp.userField.sendKeys(username);
        BrowserUtils.wait(3);
        hp.passwordField.sendKeys(password);
        hp.loginButton.click();


        String src = mp.capacityImage.getAttribute("src");
        BufferedImage bufferedImage = ImageIO.read(new URL(src));
        File numberFile = new File("saved.png");
        ImageIO.write(bufferedImage, "png", numberFile);


    }
}
