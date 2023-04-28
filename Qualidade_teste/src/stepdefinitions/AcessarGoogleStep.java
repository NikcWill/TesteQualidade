package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componetes;

public class AcessarGoogleStep{

        Componetes componetes = new Componetes();
        @Dado("que o usuário instanciou o chrome-drive")
        public void que_o_usuário_instanciou_o_chrome_drive() {
            componetes.inicializar();
        }

        @Dado("que o usuário digitou o endereço do Google no navegador")
        public void que_o_usuário_digitou_o_endereço_do_Google_no_navegador() {
            componetes.entrarGoogle();
        }

        @Quando("clicar em Enter")
        public void clicar_em_Enter() {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        }

        @Então("a página do Google deve abrir")
        public void a_página_do_Google_deve_abrir() {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        }
}
