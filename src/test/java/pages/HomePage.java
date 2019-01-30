package pages;

import support.DriverQA;

public class HomePage {

    public DriverQA driver;

    public HomePage(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void openPage(){
        String url = "https://dextra.com.br/pt/";
        driver.openURL(url);
    }

    public void clickSeachIcon() {
        driver.click("/html/body/header/div/span[3]", "xpath");
    }

    public void enterSearchText(String value) {
        driver.sendKeys(value, "s");
    }

    public void pressEnterkey(){
        driver.sendKeyboard("s", "ENTER");
    }

}
