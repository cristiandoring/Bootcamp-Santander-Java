package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que não precisam estar disponíveis para toda a aplicação
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        
        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estar disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        almoxarife.entregarIngredientes();

        //ações que somente o pacote cozinha precisa ter ciência

        almoxarife.trocarGas();

    }
}
