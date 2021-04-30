package Java.Poo.ExemploPolimorfismo;

public class Carro extends Veiculo {

    public double calculaImposto(){
        return this.getValorVenal() * 0.05;
    }
}
