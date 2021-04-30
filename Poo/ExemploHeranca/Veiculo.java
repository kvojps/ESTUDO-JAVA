package Java.Poo.ExemploHeranca;

public class Veiculo {

    private String modelo;
    private String marca;

    public String mostrarVeiculo(){
        return String.format("%s-%s", marca, modelo);
    }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }
}
