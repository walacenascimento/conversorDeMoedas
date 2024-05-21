
public class App {
    public static void main(String[] args) {
        System.out.println("****** Conversor de Moedas ******");

        Requisicao requisicao = new Requisicao();
        String url = requisicao.RequisicaoBusca();
        System.out.println(url);

    }
}
