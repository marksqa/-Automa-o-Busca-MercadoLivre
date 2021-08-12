package tests.mercadolivre.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(how = How.CSS, using = "[name='as_word']")
    private WebElement barraPesquisa;

    @FindBy(how = How.CSS, using = ".nav-icon-search")
    private WebElement botaoPesquisa;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void fazerPesquisa(String termoBusca) {
        termoBusca = termoBusca.toLowerCase();
        barraPesquisa.sendKeys(termoBusca);
        botaoPesquisa.click();
    }

}
