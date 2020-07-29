package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntregaPage {
    private WebDriver driver;
    public EntregaPage(WebDriver driver) {
        this.driver = driver;
    }
    private By elclickEntrega = By.id("deliveryMethodSubmit");

    public PagamentoPage ClickEntrega(){
        driver.findElement(elclickEntrega).click();
        return new PagamentoPage(driver);
    }
    // escolher endereço - id.input-3
}
