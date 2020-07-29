package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PagamentoPage {
    private WebDriver driver;
    public PagamentoPage(WebDriver driver) {
        this.driver = driver;
    }
    private By elSelect = By.id("installmentSelect");

  public Select encontraSelect(){
      return new Select(driver.findElement(elSelect));
      }
  public void selecionaOpcoes(){
      encontraSelect().selectByValue("2");
  }
}
