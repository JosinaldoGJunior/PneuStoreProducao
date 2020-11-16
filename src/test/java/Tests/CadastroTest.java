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
        loginPage.primeiroNomeUsuarioNovo("Loo");
        loginPage.ultimoNomeUsuarioNovo("Leo");
        loginPage.cpfUsuarioNovo("76256324668"); // | 762.563.246-68 | 976.878.927-12 | 528.147.623-89
        loginPage.dataNascimentoUsuarioNovo("10021996");
        loginPage.telefoneUsuarioNovo("11987876765");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("pneu2020");
        loginPage.confirmarSenhaUsuarioNovo("pneu2020");
        loginPage.termosUsuarioNovo();
        loginPage.btnFinalizarCadastro();
        Assert.assertEquals("Olá Loo!",loginPage.verificarLogin());
    }

}
