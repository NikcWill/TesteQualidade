package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Componetes {
    private WebDriver driver;

    public void inicializar(){
        String chromedriver = System.getProperty("user.dir")
                + "/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Driver/componentes.html");
    }

    public void acessarGoogle() {
        String url = "https://google.com.br";
        driver.get(url);
    }

    public void pesquisarGoogle(){
        driver.findElement(By.name("q")).sendKeys("SENAC Palhoça");
    }

    public  void clicarEnter(){
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public void resultadoPesquisa(){
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("SENAC"));
    }
    public  void fecharNavegador(){
        driver.quit();
    }

    public  void testarTextField(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
    }

    public void validarTextField(){
        Assert.assertEquals("Batatinha",
        driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }
}
