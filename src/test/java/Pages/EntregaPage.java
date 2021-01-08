package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Core.DriverFactory.getDriver;

public class EntregaPage extends BasePage {

    public void clickTipoDeEntregueNormal(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".regular-options__list > .delivery-options-item > .items-center")));
        cliqueBotaoCSS(".regular-options__list > .delivery-options-item > .items-center");
        // cliqueBotaoXpath("//div[@id='js-delivery-widget']/div/ul/li[2]/ul/li/div[1]");
        //cliqueBotaoXpath("//li[3]/ul/li/div/label/span");
    }

    public void clickTipoDeEntregaRetira(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".assembly-center__list > .delivery-options-item > .items-center")));
        cliqueBotaoCSS(".assembly-center__list > .delivery-options-item > .items-center");
        WebDriverWait wait1 = new WebDriverWait(getDriver(), 20);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='1']")));
        cliqueBotaoXpath("//button[@id='1']");
        cliqueBotao("confirmarBtn");
    }

    public void btnProximoEntrega() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }
}
