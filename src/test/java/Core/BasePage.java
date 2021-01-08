package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static Core.DriverFactory.getDriver;

public class BasePage {

    /********* DSL para Escrever e obter Textos ************/
    public void escreverTexto(By by, String texto){
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escreverTexto(String id_Texto, String texto){
        escreverTexto((By.id(id_Texto)),texto);
    }

    public void escreverTextoXpath(String xpath, String texto){
        escreverTexto((By.xpath(xpath)),texto);
    }

    public void escreverTextoCSS(String CSS, String texto){
        escreverTexto((By.cssSelector(CSS)),texto);
    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public void escreverSemClear(String id, String texto){
        getDriver().findElement(By.id(id)).sendKeys(texto);
    }

    /********* Botao ************/
    public void cliqueBotao(String id_Botao){
        getDriver().findElement(By.id(id_Botao)).click();
    }

    public void cliqueBotaoCSS(String CSS_Botao){
        getDriver().findElement(By.cssSelector(CSS_Botao)).click();
    }

    public void cliqueBotaoXpath(String xpath_Botao){
        getDriver().findElement(By.xpath(xpath_Botao)).click();
    }


    /********* Radio **********/
    public void cliqueRadio(String id_Radio){
        getDriver().findElement(By.id(id_Radio)).click();
    }

    /********* Combo **********/
    public void selecionarCombo(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByValue(valor);
    }

    /********* Link **********/
    public void clicarLink(String link) {
        getDriver().findElement(By.linkText(link)).click();
    }

    public void clicarLinkXpath(String xpath){
        getDriver().findElement(By.xpath(xpath)).click();
    }

    /******** mouse over *******/
    public void mouseOverXpath(String xpath_over) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(By.xpath(xpath_over));
        acao.moveToElement(menu).perform();
    }

    public void mouseOverCSS(String CSS_over) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(By.cssSelector(CSS_over));
        acao.moveToElement(menu).perform();
    }

    /******** Teclado *******/

    public void apertarEnterTeclado(String id_enter) {
        getDriver().findElement(By.id(id_enter)).sendKeys(Keys.ENTER);
    }


}
