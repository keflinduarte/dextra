package pages;

import support.DriverQA;

public class BusinessCases {

    public DriverQA driver;

    public BusinessCases(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickConhecaCases() {
        driver.click("/html/body/div[3]/div/div/p/a", "xpath");
    }

    public void clickCarregarMais() {
        driver.click("/html/body/section/div/a", "xpath");
    }

    public void clickShowMilhaoCase() {
        driver.click("/html/body/section/div/div[2]/div[18]/div/a/span", "xpath");
    }

    public String checkShowMilhaoCase() {
        return driver.getText("/html/body/section/div/div[1]/p[2]", "xpath");
    }
}
