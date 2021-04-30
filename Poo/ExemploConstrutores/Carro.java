package Java.Poo.ExemploConstrutores;

public class Carro {
    // Trabalhando o conceito de construtores
    private final String marca;
    private final String modelo;
    private final int ano;
    private String variante;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String mostrarCarro(){
        return String.format("%s-%s(%s)", marca, modelo, ano);
    }

    public String getMarca() { return marca; }

    public String getModelo() { return marca; }

    public int getAno() { return ano; }

    public void setVariante(String variante) { this.variante = variante; }

    public String getVariante() { return variante; }
}
