import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicao {

    // Método para efetuar a requisição e obter reposta da API
    public String RequisicaoBusca() throws IOException, InterruptedException {

        String APIkey = "362d8f2a182479f2f397c9c3";
        String endereco = "https://v6.exchangerate-api.com/v6/" + APIkey + "/latest/USD";

        // Requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Resposta
        HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();

    }
}