package SuiteDeTestes;

import Pages.*;
import org.junit.Test;

public class CasosDeTestes extends BasePage {
    HomePage homePage;
    VitrinePage vitrinePage;
    CarinhoPage carinhoPage;
    IdentificacaoPage identificacaoPage;
    EntregaPage entregaPage;
    PagamentoPage pagamentoPage;
    @Test
    public void testLoginComSucesso(){
        acessoPagina();
        loginPage.usuario();
        loginPage.senha();
        homePage = loginPage.btnLogin();
    }

    @Test
    public void testPesquisaPneu(){
        testLoginComSucesso();
        homePage.pesquisaPneu();
        vitrinePage = homePage.clickLupa();
        carinhoPage =  vitrinePage.btnCompra();
    }

    @Test
    public void testFinalizarPedido(){
        testPesquisaPneu();
        identificacaoPage = carinhoPage.finalizarPedido();
        entregaPage = identificacaoPage.ClickEndereco();
        pagamentoPage = entregaPage.ClickEntrega();
        pagamentoPage.selecionaOpcoes();
    }


}
