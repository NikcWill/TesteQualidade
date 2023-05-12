package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "Qualidade_teste/src/features/Componentes.feature", glue = "", tags = "@validar_elemento_radiobutton_checkbox")
public class TestRunner {
}
