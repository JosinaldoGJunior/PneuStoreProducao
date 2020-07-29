package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VitrinePage {
    private WebDriver driver;
    public VitrinePage(WebDriver driver) {
        this.driver = driver;
    }
    private  By elBtnCompra = By.id("btn-add-10010494");

    public CarinhoPage btnCompra(){
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(elBtnCompra));
        driver.findElement(elBtnCompra).click();
        return new CarinhoPage(driver);
    }
}
