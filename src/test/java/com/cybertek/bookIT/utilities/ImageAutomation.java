package com.cybertek.bookIT.utilities;

import static org.junit.Assert.assertTrue;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class ImageAutomation {
//    public static void main(String[] args) throws TesseractException {

//        ITesseract tesseract = new Tesseract();
//        String text = tesseract.doOCR(new File(filePath));
//        System.out.println(text);

    public static void main(String[] args) throws TesseractException {
        String path = "/Users/kristinastorozhuk/Desktop/Captcha 2.png";
       ITesseract image = new Tesseract();

       image.doOCR(new File(path));



    }






    }
