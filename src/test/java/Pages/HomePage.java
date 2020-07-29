package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By elCampoPesquisa = By.id("js-site-search-input");
    private By elBtnLupa = By. cssSelector(".col-md-7 .glyphicon");


    public void pesquisaPneu(){
        driver.findElement(elCampoPesquisa).click();
        driver.findElement(elCampoPesquisa).sendKeys("10010494");
    }

    public VitrinePage clickLupa(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elBtnLupa));
        driver.findElement(elBtnLupa).click();
        return new VitrinePage(driver);
    }


}
