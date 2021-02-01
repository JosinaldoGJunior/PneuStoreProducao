package Core;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Core.Propriedades.TipoExecucao;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
        @Override
        protected synchronized WebDriver initialValue() {
            return initDriver();
        }
    };

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        return threadDriver.get();
    }

    public static WebDriver initDriver(){
        WebDriver driver = null;
        if(Propriedades.TIPO_EXECUCAO == TipoExecucao.LOCAL) {
            switch (Propriedades.BROWSER) {
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;

            }

        }
        if(Propriedades.TIPO_EXECUCAO == TipoExecucao.GRID) {
            DesiredCapabilities cap = null;
            switch (Propriedades.BROWSER) {
                case FIREFOX: cap = DesiredCapabilities.firefox(); break;
                case CHROME: cap = DesiredCapabilities.chrome(); break;
            }
            try {
                driver = new RemoteWebDriver(new URL("http://10.0.0.102:4444/wd/hub"), cap);
            } catch (MalformedURLException e) {
                System.err.println("Falha na conexão com o GRID");
                e.printStackTrace();
            }

        }   if(Propriedades.TIPO_EXECUCAO == TipoExecucao.NUVEM) {
            DesiredCapabilities cap = null;
            switch (Propriedades.BROWSER) {
                case FIREFOX: cap = DesiredCapabilities.firefox(); break;
                case CHROME: cap = DesiredCapabilities.chrome(); break;
            }
            try {
                driver = new RemoteWebDriver(new URL("https://Jgsj96:8e59c9a6-bb2c-450b-89ae-b9e6bcc5ccee@ondemand.us-west-1.saucelabs.com:443/wd/hub"), cap);
            } catch (MalformedURLException e) {
                System.err.println("Falha na conexão com o GRID");
                e.printStackTrace();
            }

        }

        driver.manage().window().maximize();
        return driver;
        /*   driver = new ChromeDriver();
        // ChromeOptions navegador = new ChromeOptions();
        //navegador.addArguments("--headless"); //Rodar com navegador fechado
        //navegador.addArguments("--start-maximized");
        // getDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Não usar a Explicita e Implicita
         */

    }


    public static void killDriver() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        if (threadDriver != null) {
            threadDriver.remove();
        }
    }
}