package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponetesStep {

    Componentes componetes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de Treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_Treinamento() {
        componetes.inicializar();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        componetes.testarNome();

    }

    @Então("no campo textfield deve apresentar a palavra Batatinha")
    public void no_campo_textfield_deve_apresentar_a_palavra_Batatinha() {
        componetes.validarNome();
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
        componetes.testarSexo();
    }

    @Então("o rádio button deve apresentar selecionado")
    public void o_rádio_button_deve_apresentar_selecionado() {
        componetes.validarSexo();
        componetes.fecharNavegador();
    }

    @Quando("o usuário clicar na checkbox")
    public void o_usuário_clicar_na_checkbox() {
        componetes.testarSexo();
    }

    @Então("o checkbox deve apresentar selecionado")
    public void o_checkbox_deve_apresentar_selecionado() {
        componetes.validarSexo();
        componetes.fecharNavegador();
    }

    @Dado("que o usuário prencheu os nome, sobrenome, sexo, comida preferida, escolaridade, esporte que pratica, sugestão com as Jonh, Kenedy, {int}, {int}, superior, Corrida, Sugestão de mais feriados no ano!")
    public void que_o_usuário_prencheu_os_nome_sobrenome_sexo_comida_preferida_escolaridade_esporte_que_pratica_sugestão_com_as_Jonh_Kenedy_superior_Corrida_Sugestão_de_mais_feriados_no_ano(Integer int1, Integer int2) {
        componetes.inicializar();
        componetes.testarNome();
        componetes.validarNome();
        componetes.testarSobrenome();
        componetes.validarSobrenome();
        componetes.testarSexo();
        componetes.validarSexo();
        componetes.testarComidaFav();
        componetes.validarComidaFav();
        componetes.testarEscolaridade();
        componetes.validarEscolaridade();
    }

    @Quando("clicar em Cadastrar")
    public void clicar_em_Cadastrar() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar o formulário preenchido com as Jonh, Kenedy, {int}, {int}, superior, Corrida, Sugestão de mais feriados no ano!")
    public void deve_apresentar_o_formulário_preenchido_com_as_Jonh_Kenedy_superior_Corrida_Sugestão_de_mais_feriados_no_ano(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
