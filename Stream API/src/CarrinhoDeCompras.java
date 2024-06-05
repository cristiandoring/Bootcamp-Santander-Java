import java.util.ArrayList;
public class CarrinhoDeCompras{

    //atributos
    private List<Item> itemList;

    //construtor
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    
    //método para calcular valor total da compra
    public double calcularValorTotal(){
        if(itemList.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }

        return itemList.stream()
            .mapToDouble(item -> item.getPreco()*item.getQuant())
            .sum();
    }

}