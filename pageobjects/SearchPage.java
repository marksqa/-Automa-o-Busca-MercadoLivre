package tests.mercadolivre.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    private WebDriver driver;

    private List<WebElement> resultados;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void verificarResultadoValido(String termoBusca) {
        resultados = driver.findElements(By.className("ui-search-item__title"));
        System.out.print("Quantidade de itens encontrados: " + resultados.size());
        System.out.println("\nItens encontrados: ");

        boolean result = false;

        for (int i = 0; i < resultados.size(); i++) {
            String valorResultado = resultados.get(i).getText().toLowerCase();
            System.out.println(valorResultado);
            //System.out.println(termoBusca);
            //System.out.println(valorResultado.contains(termoBusca));
            if(valorResultado.contains(termoBusca)) {
                result= true;
            }
        }
        Assert.assertTrue(result);
    }
}
