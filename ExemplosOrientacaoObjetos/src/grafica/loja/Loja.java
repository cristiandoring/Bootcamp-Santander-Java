package grafica.loja;

import grafica.equipamentos.impressora.Deskjet;
import grafica.equipamentos.impressora.Impressora;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}
