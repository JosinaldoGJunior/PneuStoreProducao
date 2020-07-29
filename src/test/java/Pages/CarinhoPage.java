package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarinhoPage {
    private WebDriver driver;
    public CarinhoPage(WebDriver driver) {
        this.driver = driver;
    }


    private By elFinalizarPedido = By.id("btn-continue-checkout");


    public IdentificacaoPage finalizarPedido(){

        driver.findElement(elFinalizarPedido).click();
        return new IdentificacaoPage(driver);
    }



    //  frete - id.zipcode
  //  calcular - id.btn-delivery
  //  radio - id.input-3
   // finalizar - pedido id.btn-continue-checkout

}
