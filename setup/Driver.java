package tests.mercadolivre.setup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class Driver {
    public WebDriver WebDriver() {
        //Informar referência do seu driver...
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\marcos.ramos\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mercadolivre.com.br");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
