package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

        private WebDriver driver;
        public LoginPage(WebDriver driver){
                this.driver = driver;
        }
        private By elUsuario = By.id("j_username");
        private By elSenha = By.id("j_password");
        private By elBtnLogin = By.id("btn-login");

        public void usuario(){

                driver.findElement(elUsuario).sendKeys("prod-pneus@yopmail.com");
        }

        public void senha(){

                driver.findElement(elSenha).sendKeys("josi2020");
        }

        public HomePage btnLogin(){
                driver.findElement(elBtnLogin).click();
                return new HomePage(driver);
        }
}
