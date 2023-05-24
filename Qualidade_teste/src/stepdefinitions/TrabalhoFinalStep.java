package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;
public class TrabalhoFinalStep {
    Componentes componentes = new Componentes();

    @Dado("que o usuário pesquisou pela empresa Nexxera Florianópolis no google")
    public void que_o_usuário_pesquisou_pela_empresa_Nexxera_Florianópolis_no_google() {
        componentes.inicializar();
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

    }

    @Dado("que o usuário não preencheu o campo Nome")
    public void que_o_usuário_não_preencheu_o_campo_Nome() {
        componentes.testarSobrenome();
        componentes.testarSexo();
        componentes.validarSobrenome();
        componentes.validarSexo();

    }

    @Quando("clicar em Salvar")
    public void clicar_em_Salvar() {
        componentes.clicarCadastrar();
    }

    @Então("deve apresentar a mensagem de feedback informando que o campo Nome é obrigatório")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_o_campo_Nomeé_obrigatório() {
        componentes.validarAlertNome();
    }

    @Dado("que o usuário não preencheu o campo Sobrenome")
    public void que_o_usuário_não_preencheu_o_campo_Sobrenome() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar a mensagem de feedback informando que o campo Sobrenomeé obrigatório")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_o_campo_Sobrenomeé_obrigatório() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("que o usuário não preencheu o campo Sexo")
    public void que_o_usuário_não_preencheu_o_campo_Sexo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar a mensagem de feedback informando que o campo Sexoé obrigatório")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_o_campo_Sexoé_obrigatório() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("que o usuário não preencheu os campos Nome e Sobrenome")
    public void que_o_usuário_não_preencheu_os_campos_Nome_e_Sobrenome() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome e Sobrenomesão obrigatórios")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_e_Sobrenomesão_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("que o usuário não preencheu os campos Nome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Nome_e_Sexo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome e Sexosão obrigatórios")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_e_Sexosão_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("que o usuário não preencheu os campos Sobrenome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Sobrenome_e_Sexo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Sobrenome e Sexosão obrigatórios")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Sobrenome_e_Sexosão_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Dado("que o usuário não preencheu os campos Nome, Sobrenome e Sexo")
    public void que_o_usuário_não_preencheu_os_campos_Nome_Sobrenome_e_Sexo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve apresentar a mensagem de feedback informando que os campos Nome, Sobrenome e Sexosão obrigatórios")
    public void deve_apresentar_a_mensagem_de_feedback_informando_que_os_campos_Nome_Sobrenome_e_Sexosão_obrigatórios() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
