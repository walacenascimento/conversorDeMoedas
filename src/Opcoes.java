import java.util.Scanner;

public class Opcoes {
    public int showMenu() {
        System.out.println("Menu de opções:");

        System.out.println("escolha uma das opções");

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("1 - opção ");
            System.out.println("2 - opção");
            System.out.println("3 - Sair");

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("você escolheu a opção 1");
                    break;
                }
                case 2: {
                    System.out.println("você escolheu a opção 2 ");
                    break;
                }
                case 3: {
                    System.out.println("Sair");
                    break;
                }
            }
        }
        return opcao;
    }
}
