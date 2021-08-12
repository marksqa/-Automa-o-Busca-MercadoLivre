package tests.mercadolivre.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import tests.mercadolivre.pageobjects.HomePage;
import tests.mercadolivre.pageobjects.SearchPage;
import tests.mercadolivre.setup.Driver;

public class Pesquisas {

    private WebDriver driver;

    @Before
    public void CriarDriver() {
        Driver wdriver = new Driver();
        driver = wdriver.WebDriver();
    }

    @Test
    public void fazerPesquisaVálida() {
        String termoBusca = "Notebook";
        termoBusca = termoBusca.toLowerCase();

        HomePage homePage = new HomePage(driver);
        homePage.fazerPesquisa(termoBusca);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.verificarResultadoValido(termoBusca);
    }

    @After
    public void fecharDriver() {
        driver.close();
        driver.quit();
    }
}
