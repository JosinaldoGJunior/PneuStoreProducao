package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Core.DriverFactory.getDriver;

public class HomePage extends BasePage {

    public void barraDePesquisa(String id_item){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-site-search-input")));
        escreverSemClear("js-site-search-input",id_item);

    }

    public void apertarEnter(){
        apertarEnterTeclado("js-site-search-input");
    }

    public void clickLupa(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-7 .glyphicon")));
        cliqueBotaoCSS(".col-md-7 .glyphicon");
    }

    public void runFlat(){
        cliqueBotao("runFlatMeasure");
    }

    /********* Buscar por Medida ************/

    public void btnBuscaMedida(){
        cliqueBotao("searchButtonMeasure");
    }

    public void buscarPorMedidaLargura(String largura){
        selecionarCombo("tireWidth",largura);
    }

    public void buscarPorMedidaPerfil(String perfil){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tireHeight")));
        selecionarCombo("tireHeight",perfil);

    }

    public void buscarPorMedidaAro(String aro){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tireDiameter")));
        selecionarCombo("tireDiameter",aro);
    }

    /********* Buscar por Veiculo ************/

    public void btnBuscarVeiculo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vehicleSearchBtn")));
        cliqueBotao("searchButtonVehicle"); }

    public void buscaPorVeiculo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vehicleSearchBtn")));
        cliqueBotao("vehicleSearchBtn");
    }

    public void selecionarMarca(String marca){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("brand")));
        selecionarCombo("brand",marca);
    }

    public void selecionarModelo(String modelo){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("model")));
        selecionarCombo("model",modelo);
    }

    public void selecionarAno(String ano){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        selecionarCombo("year",ano);
    }

    public void selecionarVersao(String versao){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("version")));
        selecionarCombo("version",versao);
    }

    /********* Buscar por Placa ************/

    public void btnBuscaPlaca(){cliqueBotao("searchButtonPlate"); }

    public void buscaPorPlaca(){
        cliqueBotao("plateSearchBtn");
    }

    public void escrevrePlaca(String placa){
        escreverTexto("plate", placa );
    }

    /********* Mudar para página de Login ************/
    public void clicarLogin(){
        mouseOverCSS(".not_logged_in__login");
        cliqueBotao("login");
    }

    /********* Clicar Pneus Passeio ************/

    public  void  clickPneuPasseio(){
        mouseOverXpath("//a[contains(text(),'Qual Pneu você precisa?')]");
        cliqueBotaoXpath("//a[contains(text(),'Qual Pneu você precisa?')]");
        cliqueBotaoXpath("//a[contains(@href, '/categorias/passeio')]");
    }

    public void clickNoMenu(){
        cliqueBotaoXpath("//a[contains(text(),'Qual Pneu você precisa?')]");
    }

}
