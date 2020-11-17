package Tests;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;

public class FluxoCompraTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    ItemPage itemPage = new ItemPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();

    @Test
    public void fluxoCompletoDeCompraBoleto() throws Exception {
        homePage.barraDePesquisa("10040261");
        homePage.clickLupa();
        vitrinePage.clickItem();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.selecionarEndereco();
        Thread.sleep(3000);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(5000);
        entregaPage.clickTipoDeEntregue();
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.PagBoleto();
        Thread.sleep(5000);
        pagamentoPage.FinalizaSuaCompra();
    }
}
