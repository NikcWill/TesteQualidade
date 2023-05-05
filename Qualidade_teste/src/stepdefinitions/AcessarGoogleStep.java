package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componetes;

public class AcessarGoogleStep{

        Componetes componetes = new Componetes();
        @Dado("que o usuário instanciou o chrome-driver")
        public void que_o_usuario_instanciou_o_chrome_drive() {
            componetes.inicializar();
        }

        @Dado("que o usuário digitou o endereço do Google no navegador")
        public void que_o_usuário_digitou_o_endereço_do_Google_no_navegador() {
            componetes.acessarGoogle();
        }

        @Dado("que o usuário digitou SENAC palhoça")
        public void que_o_usuário_digitou_SENAC_palhoça() {
            // Write code here that turns the phrase above into concrete actions
            componetes.pesquisarGoogle();
        }
        @Quando("clicar em Enter")
        public void clicar_em_Enter() {
            // Write code here that turns the phrase above into concrete actions
            componetes.clicarEnter();
        }

        @Então("deve apresentar a lista de pesquisa com SENAC Palhoça")
            public void deve_apresentar_a_lista_de_pesquisa_com_SENAC_Palhoça() {
                // Write code here that turns the phrase above into concrete actions
                componetes.resultadoPesquisa();
                componetes.fecharNavegador();
        }


}
