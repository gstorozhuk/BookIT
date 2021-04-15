package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.pages.HomePage;
import com.cybertek.bookIT.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class LoginApacheSuper extends Excel {

    HomePage homePage = new HomePage();

    @Test
    public void loginPagePositiveTestCase() {

        homePage.homePageLanding();

        String xl = "src/test/resources/testData/DDT.xlsx";
        String Sheet = "Sheet1";
        int rowCount = Excel.getRowCount(xl, Sheet);

        for (int i = 1; i < rowCount; i++) {

            String UserName = Excel.getCellValue(xl, Sheet, i, 0);
            String Pwd = Excel.getCellValue(xl, Sheet, i, 1);
            homePage.loginUser(UserName, Pwd);

            homePage.logoutUser();


        }
    }
        @AfterAll
        public void tearDownScenario(Scenario scenario) {
            //if my scenario failed
            // go and take screen shot
            if (scenario.isFailed()) {
                byte[] screenShot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenShot, "image/png", scenario.getName());
            }
            //System.out.println("After annotation from Hooks is in action");
            Driver.closeDriver();
        }

    }


