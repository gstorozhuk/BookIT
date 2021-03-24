package com.cybertek.bookIT.pages;

import com.cybertek.bookIT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {

    public PageGenerator(){
        PageFactory.initElements(Driver.get(),this);

    }
}

