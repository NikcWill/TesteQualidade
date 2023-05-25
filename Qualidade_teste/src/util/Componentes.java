package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.SocketOption;

public class Componentes {
    private WebDriver driver;

    public void inicializar(){

        String chromedriver = System.getProperty("user.dir")
                + "/Qualidade_teste/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriver);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///" + System.getProperty("user.dir") + "/Qualidade_teste/Driver/componentes.html");
    }
    public void acessarGoogle() {
        String url = "https://google.com.br";
        System.out.println(driver);
        driver.get(url);
    }

    public void pesquisarGoogle(){
        driver.findElement(By.name("q")).sendKeys("SENAC Palhoça");
    }

    public void pesquisarGoogleNexxra(){
        driver.findElement(By.name("q")).sendKeys("Nexxera Florianópolis");
    }

    public  void clicarEnter(){
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public void resultadoPesquisa(){
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("SENAC"));
    }

    public void resultadoPesquisaNexxera(){
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("Nexxera"));
    }

    public void acessarResultadoPesquisa(){
        driver.findElement(By.className("VuuXrf")).click();
    }
    public void validarAcessoResultado(){
        String resultado = driver.getCurrentUrl();
        Assert.assertEquals("https://www.nexxera.com/",
                resultado);
    }

    public void clicarCadastrar(){
        driver.findElement(By.id("elementosForm:cadastrar")).click();

    }
    public  void fecharNavegador(){
        driver.quit();
    }

    public void validarAlertNome(){
        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();
        System.out.println("entrou");
        System.out.println(textoAlerta);
        Assert.assertEquals("Nome eh obrigatorio", textoAlerta);

    }

    public  void testarNome(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Jonh");
    }

    public void validarNome(){
        Assert.assertEquals("Jonh",
                driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
    }

    public void testarSobrenome(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Kenedy");
    }

    public void validarSobrenome(){
        Assert.assertEquals("Kenedy",
                driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
    }

    public void testarSexo(){
        driver.findElement(By.id("elementosForm:sexo:1")).click();
    }

    public void validarSexo(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());
    }

    public void testarComidaFav(){
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }

    public void validarComidaFav(){
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:1")).isSelected());
    }

    public void testarEscolaridade(){
        WebElement select = driver.findElement(By.id("elementosForm:escolaridade"));
        Select select1 = new Select(select);
        select1.selectByValue("superior");
    }

    public void validarEscolaridade(){
        Assert.assertEquals("superior",
                driver.findElement(By.id("elementosForm:escolaridade")).getAttribute("value"));
    }
    public  void testarSugestoes(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Batatinha Batatinha");
    }

    public void validarSugestoes(){
        Assert.assertEquals("Batatinha Batatinha",
                driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
    }


}


