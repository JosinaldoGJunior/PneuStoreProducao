package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class ItemPage extends BasePage {

      public String obterPrecoAVistaItem(){
       WebDriverWait wait = new WebDriverWait(getDriver(), 10);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[3]/div[1]")));
        return obterTexto(By.xpath("//div[3]/div[3]/div[1]"));
    }

    public String obterPrecoParceladoItem(){
        return obterTexto(By.cssSelector(".prices > p"));
      }

    public void clickBtnComprar(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addToCartButton")));
       cliqueBotao("addToCartButton");

    }
}
