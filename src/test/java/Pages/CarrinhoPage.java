package Pages;


import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class CarrinhoPage extends BasePage {

    public String verificarSubTotal(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//article/div/div[2]/div/div[2]")));
        return obterTexto(By.xpath("//article/div/div[2]/div/div[2]"));
    }

    public void escreverCep(){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".postalCode")));
        escreverTextoCSS(".postalCode","06445-500");
    }

    public void clickCalcularCEP(){
        cliqueBotao("zipBtn");
    }

    public void modoDeEntregaNormal(){
//       WebDriverWait wait  = new WebDriverWait(getDriver(),1000);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[3]/ul/li/div/label/span")));
       WebDriverWait wait  = new WebDriverWait(getDriver(),10);
      //  wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath("ad"),"asd");
    }
    public void modoDeEntregaNormalx(){
        //cliqueBotaoCSS(".regular-options__list > .delivery-options-item > .items-center");

        cliqueBotaoXpath("//li[3]/ul/li/div/label/span");
    }

    public void clickFinalizarCompra(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-continue-checkout")));
       cliqueBotao("btn-continue-checkout");
    }

}
