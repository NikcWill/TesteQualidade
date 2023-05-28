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
                + "/Qualidade_teste/Driver/chromedriverMac";
        System.setProperty("webdriver.chrome.driver", chromedriver);

        driver = new ChromeDriver();
        //driver.manage().window().maximize();

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

    public void validarAlertSobrenome(){
        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();
        System.out.println("entrou");
        System.out.println(textoAlerta);
        Assert.assertEquals("Sobrenome eh obrigatorio", textoAlerta);

    }

    public void validarAlertSexo(){
        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();
        System.out.println("entrou");
        System.out.println(textoAlerta);
        Assert.assertEquals("Sexo eh obrigatorio", textoAlerta);

    }

    public  void preencherNome(){
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Jonh");
    }

    public void validarNome(){
        WebElement resposta = driver.findElement(By.id("descNome"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("Jonh", linha);
    }
    public void preencherSobrenome(){
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Kenedy");
    }

    public void validarSobrenome(){
        WebElement resposta = driver.findElement(By.id("descSobrenome"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("Kenedy", linha);}
    public void preencherSexo(){
        driver.findElement(By.id("elementosForm:sexo:0")).click();
    }

    public void validarSexo(){
        WebElement resposta = driver.findElement(By.id("descSexo"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("Masculino", linha);
    }
    public void preencherComidaFav(){
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
    }

    public void validarComidaFav(){
        WebElement resposta = driver.findElement(By.id("descComida"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("Frango", linha);
    }

    public void preencherEscolaridade(){

        WebElement select = driver.findElement(By.id("elementosForm:escolaridade"));
        Select select1 = new Select(select);
        select1.selectByValue("superior");
    }

    public void validarEscolaridade(){
        WebElement resposta = driver.findElement(By.id("descEscolaridade"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("superior", linha);
    }

    public void preencherEsporte(){
        WebElement select = driver.findElement(By.id("elementosForm:esportes"));
        Select select1 = new Select(select);
        select1.selectByValue("Corrida");

    }

    public void validarEsporte(){
        WebElement resposta = driver.findElement(By.id("descEsportes"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("Corrida", linha);
    }
    public  void preencherSugestoes(){
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Sugestão de mais feriados no ano!");
    }

    public void validarSugestoes(){
        WebElement resposta = driver.findElement(By.id("descSugestoes"));
        String linha = resposta.findElement(By.tagName("span")).getText();
        Assert.assertEquals("Sugestão de mais feriados no ano!", linha);
    }

}


