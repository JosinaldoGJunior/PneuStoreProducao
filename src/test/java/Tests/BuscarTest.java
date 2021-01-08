package Tests;

import Core.BaseTest;
import Pages.CarrinhoPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.VitrinePage;
import org.junit.Assert;
import org.junit.Test;

public class BuscarTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();
    private ItemPage itemPage = new ItemPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Test
    public void testBuscarPorItemPirelli() throws InterruptedException {

        homePage.barraDePesquisa("1007");
        Thread.sleep(2000);
        homePage.barraDePesquisa("0090");
        homePage.apertarEnter();
        homePage.clickLupa();
        Assert.assertEquals("Pneu Pirelli Aro 16 Cinturato P7 195/55R16 91V XL",vitrinePage.vitrineObterTitulo());
        Assert.assertEquals("R$ 579,90",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 12x de R$ 48,32",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath();
        Assert.assertEquals("R$ 579,90",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("em até 12x de R$ 48,33 sem juros",itemPage.obterPrecoParceladoItem());
//        itemPage.clickBtnComprar();
//        Assert.assertEquals("R$ 579,90",carrinhoPage.verificarSubTotal());
    }

    @Test
    public void testBuscarPorItemContinental() throws InterruptedException {
        homePage.barraDePesquisa("1012");
        Thread.sleep(2000);
        homePage.barraDePesquisa("0011");
        homePage.clickLupa();
        Assert.assertEquals("Pneu Continental Aro 16 ContiPowerContact 195/55R16 87V",vitrinePage.vitrineObterTitulo());
        Assert.assertEquals("R$ 449,90",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 12x de R$ 39,89",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath();
        Assert.assertEquals("R$ 449,90à vista no boleto e no cartão de débito",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("ou R$ 478,62 em até 12x de R$ 39,89 sem juros\n" +
                "Veja mais opções de parcelamento clicando aqui!",itemPage.obterPrecoParceladoItem());
//        itemPage.clickBtnComprar();
//        Assert.assertEquals("R$ 478,62",carrinhoPage.verificarSubTotal());
    }

    @Test
    public void testBuscarPorItemFarroad() throws InterruptedException {
        homePage.barraDePesquisa("1004");
        Thread.sleep(2000);
        homePage.barraDePesquisa("0478");
        homePage.clickLupa();
        Assert.assertEquals("Pneu Farroad Aro 16 FRD16 215/70R16 100H",vitrinePage.vitrineObterTitulo());
        Assert.assertEquals("R$ 524,32",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 12x de R$ 46,48",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath();
        Assert.assertEquals("R$ 524,32à vista no boleto e no cartão de débito",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("ou R$ 557,79 em até 12x de R$ 46,48 sem juros\n" +
                "Veja mais opções de parcelamento clicando aqui!",itemPage.obterPrecoParceladoItem());
//        itemPage.clickBtnComprar();
//        Assert.assertEquals("R$ 557,79",carrinhoPage.verificarSubTotal());
    }

    @Test
    public void testBuscarPorItemAptany() throws InterruptedException {
        homePage.barraDePesquisa("1001");
        Thread.sleep(2000);
        homePage.barraDePesquisa("0556");
        homePage.clickLupa();
        Assert.assertEquals("Pneu Aptany Aro 16 RP203 215/65R16 98H",vitrinePage.vitrineObterTitulo());
        Assert.assertEquals("R$ 374,90",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 12x de R$ 33,24",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath();
        Assert.assertEquals("R$ 374,90à vista no boleto e no cartão de débito",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("ou R$ 398,83 em até 12x de R$ 33,24 sem juros\n" +
                "Veja mais opções de parcelamento clicando aqui!",itemPage.obterPrecoParceladoItem());
        // itemPage.clickBtnComprar();
        // Assert.assertEquals("R$ 398,83",carrinhoPage.verificarSubTotal());
    }




//    @Test
//    public void testCliquePneuPasseio(){
//        homePage.clickPneuPasseio();
//    }
}

