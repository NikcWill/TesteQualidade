package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "TesteQualidade-master/Qualidade_teste/src/features/TrabalhoFinal.feature", glue = "", tags = "@Validar_obrigatoriedade")
public class TestRunner {
}
