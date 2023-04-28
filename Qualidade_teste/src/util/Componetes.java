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
        System.out.println(chromedriver + " aqui");
        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
    }

    public void entrarGoogle() {
        String url = "https://google.com.br";
        driver.get(url);
    }

    public void acessarGoogle(){
        driver.findElement(By.name("q")).sendKeys("SENAC Palhoça");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public void resultadoPesquisa(){
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("SENAC"));
    }
}
