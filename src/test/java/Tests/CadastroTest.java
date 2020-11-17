package Tests;

import Core.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class CadastroTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void fazerCadastro (){
        homePage.clicarLogin();
        loginPage.primeiroNomeUsuarioNovo("Usuario");
        loginPage.ultimoNomeUsuarioNovo("Teste");
        loginPage.cpfUsuarioNovo();
        loginPage.dataNascimentoUsuarioNovo("10021996");
        loginPage.telefoneUsuarioNovo("11987876765");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("pneu2020");
        loginPage.confirmarSenhaUsuarioNovo("pneu2020");
        loginPage.termosUsuarioNovo();
        loginPage.btnFinalizarCadastro();
        Assert.assertEquals("Olá Usuario!",loginPage.verificarLogin());

    }

}
