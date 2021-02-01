package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class EnderecoPage extends BasePage {

    public void selecionarEndereco(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("8908023332887")));
        cliqueRadio("8908023332887");
    }

    public void btnProximoEndereco() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }
    public void adicionarEndereco(){
        cliqueBotaoCSS(".js-add-new-address");
    }

    public void escreverCasa(){
        escreverTexto("addressTitle","casa");
    }

    public void escreverCEP(){
        escreverTexto("postcode","29047058");
    }

    public void escreverNumeroDaCasa(){
        escreverTexto("line2","411");
    }

    public void clickNumeroDaCasa(){
        cliqueBotao("line2");
    }
}
