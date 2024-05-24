package br.com.walace.conversordemoedas.models;

public class Conversor {
    // atributos
    private  String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;
    private double valor;

    // getts
    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public double getValor() {
        return valor;
    }

    // setts
    public void setValor(double valor) {
        this.valor = valor;
    }

    // metodos - contrutor
    public Conversor(String base_code, String target_code, double valor) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Convetendo valor: " +
                "De[" + base_code + "]" +
                ", Para[" + target_code + "]" +
                ", Taxa de conversão: % " + conversion_rate +
                ", valor convertido: $ " + conversion_result;
    }
}
