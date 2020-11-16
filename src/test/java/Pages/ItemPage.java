package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class ItemPage extends BasePage {

    // Item 10070090(Pneu Pirelli Aro 16 Cinturato P7 195/55R16 91V XL)

   public String obterPrecoAVistaItem(){
       WebDriverWait wait = new WebDriverWait(getDriver(), 10);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[3]/div[1]")));
        return obterTexto(By.xpath("//div[3]/div[3]/div[1]"));
    }

    public String obterPrecoParceladoItem(){
        return obterTexto(By.cssSelector(".prices > p"));
        //return obterTexto(By.cssSelector("//p[contains(.,'em até 6x de R$ 96,50 sem juros')]"));
    }

    public void clickBtnComprar(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addToCartButton")));
       cliqueBotao("addToCartButton");

    }




}
