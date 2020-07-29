package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentificacaoPage {
   private WebDriver driver;
   public IdentificacaoPage(WebDriver driver) {
      this.driver = driver;
   }

   private By elclickEndereco = By.id("btn-select-address-0");

   public EntregaPage ClickEndereco(){
      driver.findElement(elclickEndereco).click();
      return new EntregaPage(driver);
   }

}
