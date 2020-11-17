package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Core.DriverFactory.getDriver;

public class EntregaPage extends BasePage {

    public void clickTipoDeEntregue(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[3]/ul/li/div/label/span")));
        cliqueBotaoXpath("//li[3]/ul/li/div/label/span");
    }

    public void btnProximoEntrega() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }
}
