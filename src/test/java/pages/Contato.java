package pages;

import support.DriverQA;

public class Contato {

    public DriverQA driver;

    public Contato(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void clickBlogBtn() {
        driver.click("//*[@id=\"menu-item-5862\"]/a", "xpath");
    }

    public void clickTesteArticle() {
        driver.click("//*[@id=\"content-blog\"]/div/a[10]/h1", "xpath");
    }

    public String checkEntreEmContato() {
        return driver.getText("//*[@id=\"faleconosco\"]/div[1]/h2/strong", "xpath");
    }

    public void clickSubmitBtn() {
        driver.click("//*[@id=\"wpcf7-f7480-p8700-o1\"]/form/div[2]/div/input", "xpath");
    }

    public void insertName(String value) {
        driver.sendKeys(value, "nome", "name");
    }

    public void insertEmail(String value) {
        driver.sendKeys(value, "email", "name");
    }

    public void insertPhone(String value) {
        driver.sendKeys(value, "telefone", "name");
    }

    public void insertMessage(String value) {
        driver.sendKeys(value, "mensagem", "name");
    }

    public String checkRobotMessage() {
        return driver.getText("//*[@id=\"wpcf7-f7480-p8700-o1\"]/form/label[5]/div/span", "xpath");
    }

    public void clickRobotCheck() {
        driver.click("//*[@id=\"recaptcha-anchor\"]", "xpath");
    }

}
