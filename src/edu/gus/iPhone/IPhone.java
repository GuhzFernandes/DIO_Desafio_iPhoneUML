package edu.gus.iPhone;
import edu.gus.iPhone.model.*;

public class IPhone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet{

    @Override
    public void ligar(String numero) {
        System.out.println("O iPhone está ligando para o numero" + numero);
    }

    @Override
    public void atender() {
        System.out.println("o iPhone está recebendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O iPhone está iniciando o correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("O iPhone está exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("O iPhone está abrindo uma nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O iPhone está atualizando a página atual");
    }

    @Override
    public void tocar() {
        System.out.println("O iPhone está tocando uma música");
    }

    @Override
    public void pausar() {
        System.out.println("O iPhone pausou a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("O iPhone selecionou a música: " + musica);
    }
}
