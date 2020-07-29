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
    protected  LoginPage loginPage;

    @Before
    public void testInicio(){
        System.setProperty("webdriver.chrome.driver", "c:\\temp\\drivers\\chromedriver.exe");
        ChromeOptions navegador = new ChromeOptions();
        navegador.addArguments("--start-maximized");
        //  pots.addArguments("--headless"); //Rodar com navegador fechado
        driver = new ChromeDriver(navegador);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Não usar a Explicita e Implicita
    }

    @BeforeEach
    public void acessoPagina(){
        driver.get("https://pneustore.com.br/login");
        loginPage = new LoginPage(driver);
    }

    @After
    public void testfim(){
        driver.quit();
    }

}
