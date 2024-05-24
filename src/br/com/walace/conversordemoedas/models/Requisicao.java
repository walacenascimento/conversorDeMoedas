package br.com.walace.conversordemoedas.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Requisicao {
    // Atributos
    private String base_code;
    private String target_code;
    private double amount;

    List<Conversor> listaConversor = new ArrayList<>();

    public Requisicao(Conversor conversor){
        this.base_code = conversor.getBase_code();
        this.target_code = conversor.getTarget_code();
        this.amount = conversor.getValor();

    };

    public List<Conversor> getListaConversor() {
        return listaConversor;
    }

    // Método para efetuar a requisição e obter reposta da API
    public String requisicaoApi( )  throws IOException, InterruptedException {

        String APIkey = "362d8f2a182479f2f397c9c3";
        String endereco = "https://v6.exchangerate-api.com/v6/"
                + APIkey + "/pair/" + this.base_code +  "/" + this.target_code + "/" + this.amount;

        // Requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Resposta
        HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        Conversor conversor = gson.fromJson(json, Conversor.class);
        listaConversor.add(conversor);
        return  conversor.toString();
    }

}