import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testautomatizado {
    @Test

    public void webdrivergooglechrome() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.grupobancolombia.com/");
        WebElement menuEmpresas = driver.findElement(By.id("header-empresas"));
        Actions builder = new Actions(driver);
        builder.click(menuEmpresas);
        builder.perform();
        WebElement Capitalin = driver.findElement(By.linkText("Capital Inteligente"));
        builder.click(Capitalin);
        builder.perform();
        WebElement Acteco = driver.findElement(By.linkText("Actualidad económica"));
        builder.click(Acteco);
        builder.perform();
        WebElement evomac = driver.findElement(By.partialLinkText("Evolución del contexto macroeconómico y global al inicio de 2021"));
        builder.click(evomac);



    }



}


