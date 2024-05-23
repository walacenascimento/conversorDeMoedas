package br.com.walace.conversordemoedas.models;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.awt.Menu;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Requisicao extends Menu {
    // atributos
    private String base_code = "USD/";
    private String target_code = "BRL/";
    private double amout = 0;

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getAmout() {
        return amout;
    }

    // Método para efetuar a requisição e obter reposta da API
    public String busca()  throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o valor a ser convertido: ");
        amout = leitura.nextDouble();

        // https://v6.exchangerate-api.com/v6/362d8f2a182479f2f397c9c3/pair/BRL/USD/1
        String APIkey = "362d8f2a182479f2f397c9c3";
        String endereco = "https://v6.exchangerate-api.com/v6/"
                + APIkey + "/pair/" + getBase_code() + getTarget_code() + getAmout();

        // Requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        // Resposta
        HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Valor convertido:");
        return response.body();

    }

    //Gson gson = new Gson();
}