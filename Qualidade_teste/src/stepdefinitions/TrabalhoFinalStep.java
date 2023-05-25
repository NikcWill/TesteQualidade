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


}
