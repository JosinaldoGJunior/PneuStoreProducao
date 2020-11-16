package Core;

import Pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import static Core.DriverFactory.getDriver;
import static Core.DriverFactory.killDriver;

public class BaseTest {

    private LoginPage page = new LoginPage();

//    @BeforeEach
//    public void acessoPagina(){
//        DriverFactory.getDriver().get("https://pneustore.com.br/login");
//    }

    @Before
    public void Inicializa(){
        DriverFactory.getDriver().get("https://www.pneustore.com.br");

    }

    @Rule
    public TestName testName = new TestName();

    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                File.separator + testName.getMethodName() + ".jpg"));
        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }

}
