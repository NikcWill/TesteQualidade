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
    @Quando("o usuário digitar Frita")
    public void o_usuário_digitar_Frita() {
        componetes.testarSobrenome();
    }

    @Então("no campo sobrenome deve apresentar a palavra Frita")
    public void no_campo_sobrenome_deve_apresentar_a_palavra_Frita() {
        componetes.validarSobrenome();
        componetes.fecharNavegador();
    }

    @Quando("o usuário digitar Batatinha Batatinha")
    public void o_usuário_digitar_Batatinha_Batatinha() {
        componetes.testarSugestoes();
    }

    @Então("no campo sugestoes deve apresentar a palavra Batatinha Batatinha")
    public void no_campo_sugestoes_deve_apresentar_a_palavra_Batatinha_Batatinha() {
        componetes.validarSugestoes();
        componetes.fecharNavegador();
    }

    @Quando("o usuário clicar na rádio button")
    public void o_usuário_clicar_na_rádio_button() {
        componetes.testarRadioButton();
    }

    @Então("o rádio button deve apresentar selecionado")
    public void o_rádio_button_deve_apresentar_selecionado() {
        componetes.validarRadioButton();
        componetes.fecharNavegador();
    }

    @Quando("o usuário clicar na checkbox")
    public void o_usuário_clicar_na_checkbox() {
        componetes.testarCheckbox();
    }

    @Então("o checkbox deve apresentar selecionado")
    public void o_checkbox_deve_apresentar_selecionado() {
        componetes.validarCheckbox();
        componetes.fecharNavegador();
    }

}
