package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Core.DriverFactory.getDriver;

public class VitrinePage extends BasePage {

    /********* Verificação de Textos ************/

    public String vitrineObterTitulo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/h2")));
        return obterTexto(By.xpath("//div[3]/a/h2"));
    }

    public String vitrineObterPrecoAVista(){
        return obterTexto(By.xpath("//div[3]/div/div/span[1]"));
    }

    public String vitrineObterPrecoParcelado(){
        return obterTexto(By.xpath("//div[3]/div/div[3]/div/div[2]"));
    }

    /********* Busca por Medidas ************/

    public String vitrineObterLargura(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(2)"));
    }

    public String vitrineObterPerfil(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(3)"));
    }

    public String vitrineObterAro(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(4)"));
    }

    public String vitrineObterLarguraRun(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(2)"));
    }

    public String vitrineObterPerfilRun(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(3)"));
    }

    public String vitrineObterAroRun(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(4)"));
    }

    public String vitrineObterRunFlat(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(5)"));
    }

    /********* Busca por Veiculo ************/
    public String vitrineBuscaPorVeiculoMarca(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(1)"));
    }

    public String vitrineBuscaPorVeiculoModelo(){
       return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(2)"));
    }

    public String vitrineBuscaPorVeiculoAno(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(3)"));
    }

    public String vitrineBuscaPorVeiculoVersao(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(4)"));
    }

    /********* Busca por Placa ************/

    public String vitrineBuscaPorPlaca(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(1)"));
    }

    /********* Cliques ************/

    public void clickItem(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/div/div/a/img")));
        clicarLinkXpath("//ul/div/div/a/img");
    }
}
