package Tests;

import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class CadastroTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    VitrinePage vitrinePage = new VitrinePage();
    EntregaPage entregaPage = new EntregaPage();
    ItemPage itemPage = new ItemPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();

    @Test
    public void fazerCadastro () throws InterruptedException {
        Thread.sleep(2000);
        homePage.clicarLogin();
        loginPage.primeiroNomeUsuarioNovo("Josi");
        loginPage.ultimoNomeUsuarioNovo("XPTO");
        loginPage.cpfUsuarioNovo();
        loginPage.dataNascimentoUsuarioNovo("10021996");
        loginPage.telefoneUsuarioNovo("11987876765");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("pneu2020");
        loginPage.confirmarSenhaUsuarioNovo("pneu2020");
        loginPage.termosUsuarioNovo();
        loginPage.btnFinalizarCadastro();
        Assert.assertEquals("Olá Josi!",loginPage.verificarLogin());

    }
    @Test
    public void fazerCadastroComPedido() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clicarLogin();
        loginPage.primeiroNomeUsuarioNovo("Josi");
        loginPage.ultimoNomeUsuarioNovo("Silva");
        loginPage.cpfUsuarioNovo();
        loginPage.dataNascimentoUsuarioNovo("10021996");
        loginPage.telefoneUsuarioNovo("11987876765");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("pneu2020");
        loginPage.confirmarSenhaUsuarioNovo("pneu2020");
        loginPage.termosUsuarioNovo();
        loginPage.btnFinalizarCadastro();
        Thread.sleep(2000);
        homePage.barraDePesquisa("1012");
        Thread.sleep(1000);
        homePage.barraDePesquisa("0011");
        homePage.apertarEnter();
        homePage.clickLupa();
        Thread.sleep(5000);
        vitrinePage.clickItemCss();
        Thread.sleep(5000);
        itemPage.clickBtnComprar();
        Thread.sleep(5000);
        carrinhoPage.clickFinalizarCompra();
        Thread.sleep(2000);
        enderecoPage.adicionarEndereco();
        Thread.sleep(2000);
        enderecoPage.escreverCasa();
        Thread.sleep(2000);
        enderecoPage.escreverCEP();
        enderecoPage.clickNumeroDaCasa();
        Thread.sleep(2000);
        enderecoPage.escreverNumeroDaCasa();
        Thread.sleep(2000);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(7000);
        entregaPage.clickTipoDeEntregueNormal();
        Thread.sleep(7000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(7000);
        pagamentoPage.PagBoleto();
        Thread.sleep(7000);
        pagamentoPage.FinalizaSuaCompra();
        Thread.sleep(1000);
    }
}
