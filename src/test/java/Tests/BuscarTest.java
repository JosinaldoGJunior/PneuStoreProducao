package Tests;

import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class BuscarTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();
    private ItemPage itemPage = new ItemPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Test
    public void testBuscarPorItemPirelli(){
        homePage.barraDePesquisa("10070090");
        homePage.clickLupa();
        Assert.assertEquals("Pneu Pirelli Aro 16 Cinturato P7 195/55R16 91V XL",vitrinePage.vitrineObterTitulo());
        Assert.assertEquals("R$ 579,90",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 10x de R$ 57,99",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItem();
        Assert.assertEquals("R$ 579,90",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("em até 10x de R$ 57,99 sem juros",itemPage.obterPrecoParceladoItem());
        itemPage.clickBtnComprar();
        Assert.assertEquals("R$ 579,90",carrinhoPage.verificarSubTotal());
    }

    @Test
    public void testBuscarPorItemContinental(){
        homePage.barraDePesquisa("10120011");
        homePage.clickLupa();
        Assert.assertEquals("Pneu Continental Aro 16 ContiPowerContact 195/55R16 87V",vitrinePage.vitrineObterTitulo());
        Assert.assertEquals("R$ 449,90",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 10x de R$ 47,86",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItem();
        Assert.assertEquals("R$ 449,90à vista no boleto e no cartão de débito",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("ou R$ 478,62 em até 10x de R$ 47,86 sem juros\n" +
                "Veja mais opções de parcelamento clicando aqui!",itemPage.obterPrecoParceladoItem());
        itemPage.clickBtnComprar();
        Assert.assertEquals("R$ 478,62",carrinhoPage.verificarSubTotal());
    }
}

