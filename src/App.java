import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("****** Conversor de Moedas ******");

        Opcoes opcoes = new Opcoes();
        System.out.print(opcoes.showMenu());

        Requisicao requisicao = new Requisicao();
        String url = requisicao.RequisicaoBusca();
        System.out.println(url);



    }
}
