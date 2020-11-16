package Core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if(driver == null) {
            switch (Propriedades.browser) {
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;
            }

            System.setProperty("webdriver.chrome.driver", "c:\\temp\\drivers\\chromedriver.exe");
           driver.manage().window().maximize();
           //   driver = new ChromeDriver();
           // ChromeOptions navegador = new ChromeOptions();
             //navegador.addArguments("--headless"); //Rodar com navegador fechado
            //navegador.addArguments("--start-maximized");
            // getDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Não usar a Explicita e Implicita
        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}