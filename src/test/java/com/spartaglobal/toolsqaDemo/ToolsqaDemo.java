package com.spartaglobal.toolsqaDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ToolsqaDemo {

    private WebDriver driver;

    private String qaFormsURL = "https://www.toolsqa.com/automation-practice-form/";

    private By cookieButton = By.id("cookie_action_close_header");
    private By linkPartialText = By.linkText("Partial Link Test");
    private By linkTest = By.linkText("Link Test");
    private By firstName = By.name("firstname");
    private By lastName = By.id("lastname");
    private By sexElements = By.name("sex");
    private By expElements = By.name("exp");
    private By continentElements = By.name("continents");
    private By date = By.id("datepicker");
    private By professionTypeElements = By.name("profession");

    public ToolsqaDemo(WebDriver driver){
        this.driver = driver;
    }

    public void backButton(){
        driver.navigate().back();
    }

    public void goToDemoPage(){
        driver.manage().window().setSize(new Dimension(1366, 728));
        driver.navigate().to(qaFormsURL);
    }

    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }

    public void clickLinkTest(){
        driver.findElement(linkTest).click();
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public void inputFirstName(String firstNameText) {
        driver.findElement(firstName).sendKeys(firstNameText);
    }

    public String getFirstNameFieldText(){
        return driver.findElement(firstName).getAttribute("value");
    }

    public void inputLastName(String lastNameText){
        driver.findElement(lastName).sendKeys(lastNameText);
    }
    public String getLastNameFieldText(){
        return driver.findElement(lastName).getAttribute("value");
    }

    public void getSexElements(){
        List<WebElement> sexItems = driver.findElements(sexElements);

        for (WebElement sexItem : sexItems) {
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();
        }
    }
    public void clickExp(){
        List<WebElement> expLevel = driver.findElements(expElements);

        for (WebElement expL: expLevel) {
            driver.findElement(By.id(expL.getAttribute("id"))).click();
            driver.findElement(By.id(expL.getAttribute("id"))).isSelected();
        }

    }
    public void inputDate(String dateInput){
        driver.findElement(date).click();
        driver.findElement(date).sendKeys(dateInput);
    }

    public String dateCheck(){
        return driver.findElement(date).getAttribute("value");
    }

    public void clickWhatTester(){
//        driver.findElement(By.id("profession-1")).click();
        List<WebElement> typeTester = driver.findElements(professionTypeElements);

        for (WebElement type: typeTester) {
            driver.findElement(By.id(type.getAttribute("id"))).click();
            driver.findElement(By.id(type.getAttribute("id"))).isSelected();
        }
    }

    public void scroll(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }
//
//    public void whatTool(){
//        driver.findElement(By.id("tool-2")).click();
////        WebElement whatTool = driver.findElement(By.id("tool-2"));
////        Actions actions = new Actions(driver);
////        actions.moveToElement(whatTool).click().build().perform();
//    }
//
    public void selectContinent(){
        Select dropDown = new Select(driver.findElement(continentElements));
        for (WebElement cont: dropDown.getOptions()) {
            dropDown.selectByValue(cont.getAttribute("value"));
            System.out.println(dropDown.getFirstSelectedOption().getText());
        }
    }

    public void multiSelectContinent(){
        Select multiDropDown = new Select(driver.findElement(continentElements));
        for (WebElement multiCon: multiDropDown.getOptions()) {
            multiDropDown.selectByValue(multiCon.getAttribute("value"));
            multiDropDown.getAllSelectedOptions();
        }
//        multiDropDown.selectByVisibleText("Europe");
//        multiDropDown.selectByVisibleText("Australia");
    }
//
//    public void submitButton(){
//        driver.findElement(By.id("submit")).click();
//    }
//
//    public void clickElse(){
//        driver.findElement(By.id("NextedText")).click();
//    }
//
//    public void closeDriver(){
//        driver.close();
//    }

}
