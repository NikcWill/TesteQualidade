package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componetes;

public class ComponetesStep {

    Componetes componetes = new Componetes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componetes.inicializar();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        componetes.testarTextField();
    }

    @Então("no campo textfield deve apresentar a palavra Batatinha")
    public void no_campo_textfield_deve_apresentar_a_palavra_Batatinha() {
        componetes.validarTextField();
        componetes.fecharNavegador();

    }
}
