package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class TrabalhoFinalStep {
    Componentes componentes = new Componentes();

    @Dado("que o usuário instanciou o chrome-driver")
    public void que_o_usuário_instanciou_o_chrome_driver() {
        componentes.inicializar();
    }

    @Dado("que o usuário prencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte que pratica, sugestão")
    public void que_o_usuário_prencheu_os_campos_nome_sobrenome_sexo_comida_preferida_escolaridade_esporte_que_pratica_sugestão() {
        componentes.preencherNome();
        componentes.preencherSobrenome();
        componentes.preencherSexo();
        componentes.preencherComidaFav();
        componentes.preencherEscolaridade();
        componentes.preencherEsporte();
        componentes.preencherSugestoes();
    }

    @Quando("clicar em Cadastrar")
    public void clicar_em_Cadastrar() {
        componentes.clicarCadastrar();
    }

    @Então("no campo nome deverá retornar o formulário preenchido com as Jonh")
    public void no_campo_nome_deverá_retornar_o_formulário_preenchido_com_as_Jonh() {
        componentes.validarNome();
        componentes.fecharNavegador();
    }

    @Então("no campo sobrenome deverá retornar o formulário preenchido com as Kenedy")
    public void no_campo_sobrenome_deverá_retornar_o_formulário_preenchido_com_as_Kenedy() {
       componentes.validarSobrenome();
       componentes.fecharNavegador();
    }

    @Então("no campo sexo deverá retornar o formulário preenchido com as {int}")
    public void no_campo_sexo_deverá_retornar_o_formulário_preenchido_com_as(Integer int1) {
        componentes.validarSexo();
        componentes.fecharNavegador();
    }

    @Então("no campo comida preferida deverá retornar o formulário preenchido com as {int}")
    public void no_campo_comida_preferida_deverá_retornar_o_formulário_preenchido_com_as(Integer int1) {
        componentes.validarComidaFav();
        componentes.fecharNavegador();
    }

    @Então("no campo escolaridade deverá retornar o formulário preenchido com as superior")
    public void no_campo_escolaridade_deverá_retornar_o_formulário_preenchido_com_as_superior() {
        componentes.validarEscolaridade();
        componentes.fecharNavegador();
    }

    @Então("no campo esporte que pratica deverá retornar o formulário preenchido com as Corrida")
    public void no_campo_esporte_que_pratica_deverá_retornar_o_formulário_preenchido_com_as_Corrida() {
        componentes.validarEsporte();
        componentes.fecharNavegador();
    }

    @Então("no campo sugestão deverá retornar o formulário preenchido com as Sugestão de mais feriados no ano!")
    public void no_campo_sugestão_deverá_retornar_o_formulário_preenchido_com_as_Sugestão_de_mais_feriados_no_ano() {
        componentes.validarSugestoes();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo Nome")
    public void que_o_usuário_não_preencheu_o_campo_Nome() {
        componentes.preencherSobrenome();
        componentes.preencherSexo();
    }

    @Quando("cadastrar")
    public void cadastrar() {
        componentes.clicarCadastrar();
    }

    @Então("deve apresentar a mensagem de feedback informando que Nome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_Nome_eh_obrigatorio() {
        componentes.validarAlertNome();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo Sobrenome")
    public void que_o_usuário_não_preencheu_o_campo_Sobrenome() {
        componentes.preencherNome();
        componentes.preencherSexo();
    }

    @Então("deve apresentar a mensagem de feedback informando que Sobrenome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_Sobrenome_eh_obrigatorio() {
        componentes.validarAlertSobrenome();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu o campo Sexo")
    public void que_o_usuário_não_preencheu_o_campo_Sexo() {
        componentes.preencherNome();
        componentes.preencherSobrenome();
    }

    @Então("deve apresentar a mensagem de feedback informando que Sexo eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_Sexo_eh_obrigatorio() {
        componentes.validarAlertSexo();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu os campos Nome e Sobrenome")
    public void que_o_usuário_não_preencheu_os_campos_Nome_e_Sobrenome() {
        componentes.preencherSexo();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome e SobrenomeNome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_e_SobrenomeNome_eh_obrigatorio() {
        componentes.validarAlertNome();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu os campos Nome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Nome_e_Sexo() {
        componentes.preencherSobrenome();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_e_SexoNome_eh_obrigatorio() {
       componentes.validarAlertNome();
       componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu os campos Sobrenome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Sobrenome_e_Sexo() {
        componentes.preencherNome();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Sobrenome e Sobrenome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Sobrenome_e_Sobrenome_eh_obrigatorio() {
        componentes.validarAlertSobrenome();
        componentes.fecharNavegador();
    }

    @Dado("que o usuário não preencheu os campos Nome, Sobrenome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Nome_Sobrenome_e_Sexo() {

    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome, Sobrenome e SexoNome eh obrigatorio")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_Sobrenome_e_SexoNome_eh_obrigatorio() {
        componentes.validarAlertNome();
        componentes.fecharNavegador();

    }

    @Dado("que o usuário pesquisou pela empresa Nexxera Florianópolis no google")
    public void que_o_usuário_pesquisou_pela_empresa_Nexxera_Florianópolis_no_google() {
        componentes.acessarGoogle();
        componentes.pesquisarGoogleNexxra();
        componentes.clicarEnter();
    }

    @Dado("que retornou pesquisas relacionadas a empresa Nexxera Florianópolis")
    public void que_retornou_pesquisas_relacionadas_a_empresa_Nexxera_Florianópolis() {
        componentes.resultadoPesquisaNexxera();
    }

    @Quando("clicar no site da empresa Nexxera")
    public void clicar_no_site_da_empresa_Nexxera() {
        componentes.acessarResultadoPesquisa();

    }

    @Então("deve acessar o site da Nexxera")
    public void deve_acessar_o_site_da_Nexxera() {
        componentes.validarAcessoResultado();
        componentes.fecharNavegador();

    }


}
