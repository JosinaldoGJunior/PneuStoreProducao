package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class PagamentoPage extends BasePage {

    public void pagCreditoParcelas(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("installmentSelect")));
        selecionarCombo("installmentSelect","1");
    }

    public void pagCreditoNumeroCartao(){
        escreverTexto("encryptedCardNumber","4111 1111 1111 1111");

    }

    public void pagCreditoVenc(){
        escreverTexto("encryptedExpiryDate","0330");

    }

    public void pagCreditoCVC(){
        escreverTexto("encryptedSecurityCode","737");

    }

    public void PagBoleto(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".flex-grow:nth-child(4)")));
        cliqueBotaoCSS(".flex-grow:nth-child(4)");
    }

    public void FinalizaSuaCompra(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }

    public String ObterNumeroPedido(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".order-number")));
        return obterTexto(By.cssSelector(".order-number"));
    }


}
