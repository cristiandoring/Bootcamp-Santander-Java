package veículos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("898984");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("474844");
        z400.ligar();
    }
}
