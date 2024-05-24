package br.com.walace.conversordemoedas.models;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner leitura = new Scanner(System.in);

    public void menu() throws IOException, InterruptedException {
        boolean menu = true;
        while (menu) {
            System.out.println("""
                    1 - BRL --> USD
                    2 - BRL --> EUR
                    3 - USD --> BRL
                    4 - EUR --> BRL
                    5 - USD --> EUR
                    6 - EUR --> USD
                    7 - SAIR
                    Escolha uma das opções a ser convertido
                    """);
            String opcao = leitura.next();
            switch (opcao){
                case "1":
                    this.converter("BRL", "USD");
                    break;

                case "2":
                    this.converter("BRL", "EUR");
                    break;

                case "3":
                    this.converter("USD", "BRL");
                    break;

                case "4":
                    this.converter("EUR", "BRL");
                    break;

                case "5":
                    this.converter("USD", "EUR");
                    break;

                case "6":
                    this.converter("EUR", "USD");
                    break;

                default:
                    if (opcao.equals("7")){
                        System.out.println("Saindo...");
                        menu = false;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        }

    }

    public void converter(String base_code, String target_code) throws IOException, InterruptedException {
        System.out.println("Digite o valor para ser convertido");
        double valor = this.leitura.nextDouble();
        Conversor conversor = new Conversor(base_code, target_code, valor);
        Requisicao api = new Requisicao(conversor);
        System.out.println(api.requisicaoApi());
    }

}
