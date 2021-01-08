package SuiteDeTestes;

import Tests.BuscaPorMedidaTest;
import Tests.BuscarTest;
import Tests.CadastroTest;
import Tests.FluxoCompraTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CadastroTest.class,
        BuscarTest.class,
        BuscaPorMedidaTest.class,
        FluxoCompraTest.class
})
public class SuiteDeTestes {
}