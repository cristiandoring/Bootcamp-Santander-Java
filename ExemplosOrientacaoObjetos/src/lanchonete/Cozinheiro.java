package lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCÃO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    public void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }

}
