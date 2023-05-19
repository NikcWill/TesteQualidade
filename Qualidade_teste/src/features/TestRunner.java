package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "Qualidade_teste/src/features/TrabalhoFinal.feature", glue = "", tags = "@acessar_site_nexxera")
public class TestRunner {
}
