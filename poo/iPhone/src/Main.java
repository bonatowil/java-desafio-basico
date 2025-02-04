public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        ReprodutorMusical iphoneMusica = iphone; // É um reprodutor musical
        AparelhoTelefonico iphoneTelefone = iphone; // É um aparelho telefônico
        NavegadorInternet iphoneNavegador = iphone; // Também é um navegador de internet

        iphoneMusica.selecionarMusica("Raça Negra - Cheia de Manias");
        iphoneMusica.tocar();
        iphoneMusica.pausar();

        iphoneTelefone.atender();
        iphoneTelefone.iniciarCorreioVoz();
        iphoneTelefone.ligar("55 11 1111-1111");

        iphoneNavegador.adicionarNovaAba();
        iphoneNavegador.exibirPagina("dio.me");
        iphoneNavegador.atualizarPagina();

        // É todos ao mesmo tempo
        iphone.selecionarMusica("Raça Negra - Cheia de Manias");
        iphone.tocar();
        iphone.pausar();

        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("55 11 1111-1111");

        iphone.adicionarNovaAba();
        iphone.exibirPagina("dio.me");
        iphone.atualizarPagina();
    }
}
