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
    public void fluxoCompletoBoletoItemPorPesquisaNormal() throws Exception {
        Thread.sleep(2000);
        homePage.barraDePesquisa("1012");
        Thread.sleep(2000);
        homePage.barraDePesquisa("0011");
        Thread.sleep(2000);
        homePage.apertarEnter();
        Thread.sleep(2000);
        homePage.clickLupa();
        Thread.sleep(2000);
        vitrinePage.clickItemCss();
        Thread.sleep(2000);
        itemPage.clickBtnComprar();
        Thread.sleep(5000);
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        Thread.sleep(7000);
        enderecoPage.selecionarEndereco();
        Thread.sleep(7000);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(7000);
        entregaPage.clickTipoDeEntregueNormal();
        Thread.sleep(7000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(7000);
        pagamentoPage.PagBoleto();
        Thread.sleep(7000);
        pagamentoPage.FinalizaSuaCompra();
        Thread.sleep(7000);
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

//    @Test
//    public void fluxoCompletoBoletoItemPorCategoriaNormal() throws Exception {
//        Thread.sleep(2000);
//        homePage.clickNoMenu();
//        homePage.clickPneuPasseio();
//        vitrinePage.clickItemCss();
//        itemPage.clickBtnComprar();
//        Thread.sleep(5000);
//        carrinhoPage.clickFinalizarCompra();
//        Thread.sleep(1000);
//        loginPage.emailUsuarioAntigo();
//        Thread.sleep(2000);
//        loginPage.senhaUsuarioAntigo();
//        loginPage.btnEntrar();
//        Thread.sleep(7000);
//        enderecoPage.selecionarEndereco();
//        Thread.sleep(7000);
//        enderecoPage.btnProximoEndereco();
//        Thread.sleep(7000);
//        entregaPage.clickTipoDeEntregueNormal();
//        Thread.sleep(7000);
//        entregaPage.btnProximoEntrega();
//        Thread.sleep(7000);
//        pagamentoPage.PagBoleto();
//        Thread.sleep(7000);
////        pagamentoPage.FinalizaSuaCompra();
////        Thread.sleep(7000);
////        System.out.println(pagamentoPage.ObterNumeroPedido());
//    }


    @Test
    public void fluxoCompletoBoletoItemPorPesquisaRetira() throws Exception {
        Thread.sleep(2000);
        homePage.barraDePesquisa("1012");
        Thread.sleep(2000);
        homePage.barraDePesquisa("0011");
        homePage.apertarEnter();
        homePage.clickLupa();
        Thread.sleep(5000);
        vitrinePage.clickItemCss();
        Thread.sleep(5000);
        itemPage.clickBtnComprar();
        Thread.sleep(5000);
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        Thread.sleep(7000);
        enderecoPage.selecionarEndereco();
        Thread.sleep(7000);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(7000);
        entregaPage.clickTipoDeEntregaRetira();
        Thread.sleep(7000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(7000);
        pagamentoPage.PagBoleto();
        Thread.sleep(7000);
        pagamentoPage.FinalizaSuaCompra();
        Thread.sleep(7000);
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

//    @Test
//    public void fluxoCompletoBoletoItemPorCategoriaRetira() throws Exception {
//        Thread.sleep(2000);
//        homePage.clickNoMenu();
//        homePage.clickPneuPasseio();
//        Thread.sleep(2000);
//        vitrinePage.clickItemCss();
//        Thread.sleep(2000);
//        itemPage.clickBtnComprar();
//        Thread.sleep(5000);
//        carrinhoPage.clickFinalizarCompra();
//        loginPage.emailUsuarioAntigo();
//        loginPage.senhaUsuarioAntigo();
//        loginPage.btnEntrar();
//        Thread.sleep(7000);
//        enderecoPage.selecionarEndereco();
//        Thread.sleep(7000);
//        enderecoPage.btnProximoEndereco();
//        Thread.sleep(7000);
//        entregaPage.clickTipoDeEntregaRetira();
//        Thread.sleep(7000);
//        entregaPage.btnProximoEntrega();
//        Thread.sleep(7000);
//        pagamentoPage.PagBoleto();
//        Thread.sleep(7000);
//        pagamentoPage.FinalizaSuaCompra();
//        Thread.sleep(7000);
//        System.out.println(pagamentoPage.ObterNumeroPedido());
//    }
//


}
