package Pages;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;

    @Before
    public void testInicio(){
        System.setProperty("webdriver.chrome.driver", "c:\\temp\\drivers\\chromedriver.exe");
        ChromeOptions navegador = new ChromeOptions();
        navegador.addArguments("--start-maximized");
        //  pots.addArguments("--headless"); //Rodar com navegador fechado
        driver = new ChromeDriver(navegador);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Não usar a Explicita e Implicita
        driver.get("https://pneustore.com.br");

    }

    @BeforeEach


    @After
    public void testfim(){
        driver.quit();
    }

}
