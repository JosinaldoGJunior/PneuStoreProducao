package Tests;

import Core.BaseTest;
import Pages.HomePage;
import Pages.VitrinePage;
import org.junit.Assert;
import org.junit.Test;

public class BuscaPorMedidaTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();

    @Test
    public void buscaPorMedidaSemRunFlat() throws InterruptedException {
        homePage.buscarPorMedidaLargura("215");
        Thread.sleep(2000);
        homePage.buscarPorMedidaPerfil("65");
        Thread.sleep(2000);
        homePage.buscarPorMedidaAro("16");
        homePage.btnBuscaMedida();
        Thread.sleep(2000);
        Assert.assertEquals("215 ", vitrinePage.vitrineObterLargura());
        Assert.assertEquals("65 ", vitrinePage.vitrineObterPerfil());
        Assert.assertEquals("16 ", vitrinePage.vitrineObterAro());
    }

    @Test
    public void buscaPorMedidaComRunFlat() throws InterruptedException {
        homePage.buscarPorMedidaLargura("195");
        Thread.sleep(2000);
        homePage.buscarPorMedidaPerfil("55");
        Thread.sleep(2000);
        homePage.buscarPorMedidaAro("16");
        homePage.runFlat();
        homePage.btnBuscaMedida();
        Thread.sleep(2000);
        Assert.assertEquals("195 ", vitrinePage.vitrineObterLarguraRun());
        Assert.assertEquals("55 ", vitrinePage.vitrineObterPerfilRun());
        Assert.assertEquals("16 ", vitrinePage.vitrineObterAroRun());
        Assert.assertEquals("Sim ", vitrinePage.vitrineObterRunFlat());
    }

    @Test
    public void buscaPorVeiculo() throws InterruptedException {
        homePage.buscaPorVeiculo();
        homePage.selecionarMarca("FIAT");
        Thread.sleep(7000);
        homePage.selecionarModelo("SIENA");
        Thread.sleep(7000);
        homePage.selecionarAno("2005");
        Thread.sleep(7000);
        homePage.selecionarVersao("1.0 8V ELX");
        Thread.sleep(7000);
        homePage.btnBuscarVeiculo();
        Thread.sleep(1000);
        Assert.assertEquals("FIAT ", vitrinePage.vitrineBuscaPorVeiculoMarca());
        Assert.assertEquals("SIENA ", vitrinePage.vitrineBuscaPorVeiculoModelo());
        Assert.assertEquals("2005 ", vitrinePage.vitrineBuscaPorVeiculoAno());
        Assert.assertEquals("1.0 8V ELX ", vitrinePage.vitrineBuscaPorVeiculoVersao());
    }

    @Test
    public void buscaPorPlaca() throws InterruptedException {
        Thread.sleep(2000);
        homePage.buscaPorPlaca();
        Thread.sleep(2000);
        homePage.escrevrePlaca("FHX5939");
        homePage.apertarEnter();
        homePage.btnBuscaPlaca();
        Thread.sleep(2000);
        Assert.assertEquals("185 ", vitrinePage.vitrineBuscaPorPlaca());
    }
}
