package com.spartaglobal;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.toolsqaDemo.ToolsqaDemo;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\IYotova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();

        ToolsqaDemo toolsqaDemo = new ToolsqaDemo(chromeDriver);
        toolsqaDemo.goToDemoPage();
        toolsqaDemo.clickCookieButton();
//        toolsqaDemo.clickLinkTest();
//        System.out.println(toolsqaDemo.getCurrentURL());
//        toolsqaDemo.backButton();
//        toolsqaDemo.inputFirstName("Iliyana");
//        System.out.println(toolsqaDemo.getFirstNameFieldText());
//        toolsqaDemo.inputLastName("Yotova");
//        System.out.println(toolsqaDemo.getLastNameFieldText());
//        toolsqaDemo.getSexElements();
//        toolsqaDemo.scroll();
//        toolsqaDemo.clickExp();
//        toolsqaDemo.inputDate("11/12/2019");
//        System.out.println(toolsqaDemo.dateCheck());
//        toolsqaDemo.scroll();
//        toolsqaDemo.clickWhatTester();
//        toolsqaDemo.scroll();
//        toolsqaDemo.whatTool();
        toolsqaDemo.scroll();
        toolsqaDemo.selectContinent();
//        toolsqaDemo.scroll();
//        toolsqaDemo.multiSelectContinent();
//        toolsqaDemo.scroll();
//        toolsqaDemo.clickElse();
//        toolsqaDemo.submitButton();
     //   toolsqaDemo.closeDriver();
    }
}
