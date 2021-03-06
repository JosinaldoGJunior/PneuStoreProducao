package Pages;

import Core.BasePage;
import Core.GeradorDeCPF;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Core.DriverFactory.getDriver;

public class LoginPage  extends BasePage {
        GeradorDeCPF geradorDeCPF = new GeradorDeCPF();

        public String verificarLogin(){
                WebDriverWait wait = new WebDriverWait(getDriver(), 10);
                wait.until(ExpectedConditions.elementToBeClickable(By.id("logged")));
                return obterTexto(By.id("logged"));
        }

        public void logar(){
                emailUsuarioAntigo();
                senhaUsuarioAntigo();
                btnEntrar();
                verificarLogin();
        }

        /********* Usuário Antigo ************/

        public void emailUsuarioAntigo(){
                WebDriverWait wait = new WebDriverWait(getDriver(), 10);
                wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
                escreverTexto("j_username","jmtudfqfteste@gmail.com");
        }

        public void senhaUsuarioAntigo(){
                escreverTexto("j_password","pneu2020");
        }

        public void btnEntrar(){
                cliqueBotao("btn-login");
        }

        /********* Usuário Novo ************/

        public void primeiroNomeUsuarioNovo(String nome){
                WebDriverWait wait = new WebDriverWait(getDriver(), 10);
                wait.until(ExpectedConditions.elementToBeClickable(By.id("register.firstName")));
                escreverTexto("register.firstName",nome);
        }

        public void ultimoNomeUsuarioNovo(String ultimo){
                escreverTexto("register.lastName",ultimo);        }

        public void cpfUsuarioNovo(){
                escreverTexto("register.cpf",geradorDeCPF.geraCPFFinal());
                System.out.println(geradorDeCPF.geraCPFFinal());
        }

        public void dataNascimentoUsuarioNovo(String data){
                escreverTexto("register.birthDay",data);
        }

        public void telefoneUsuarioNovo(String tel){
                escreverTexto("register.phone",tel);
        }

        static String emailnovo = "";
        public void emailUsuarioNovo(){
                String email =  (RandomStringUtils.randomAlphabetic (8)+"teste@gmail.com");
                escreverTexto("register.email",email);
                emailnovo = email;
                System.out.println(emailnovo);
        }

        public void criarSenhaUsuarioNovo(String password){
                escreverTexto("password",password);
        }

        public void confirmarSenhaUsuarioNovo(String confirmarpassword){
                escreverTexto("register.checkPwd",confirmarpassword);
        }

        public void termosUsuarioNovo(){
                cliqueRadio("registerChkTermsConditions");
        }

        public void btnFinalizarCadastro(){
                cliqueBotao("registerBtn");
        }
}