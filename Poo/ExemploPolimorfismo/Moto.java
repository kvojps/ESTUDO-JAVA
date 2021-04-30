package Java.Poo.ExemploPolimorfismo;

public class Moto extends Veiculo {

    public double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }
}
