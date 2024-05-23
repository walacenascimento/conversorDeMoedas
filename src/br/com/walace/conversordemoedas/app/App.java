package br.com.walace.conversordemoedas.app;

import br.com.walace.conversordemoedas.models.Menu;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("****** Conversor de Moedas ******");

        Menu menu = new Menu();
        menu.menu();
    }
}
