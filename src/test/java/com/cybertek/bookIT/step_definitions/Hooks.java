package com.cybertek.bookIT.step_definitions;

import com.cybertek.bookIT.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @After
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