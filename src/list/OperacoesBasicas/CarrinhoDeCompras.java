package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //adicionar itens
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    //remover itens
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    //calcular o valor total do itens
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // exibir os itens da lista
    public void exibirItens() {
        if(!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public String toString() {
        return "carrinhoDeCompras{" + "itens=" + itemList+'}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("celular", 1000d, 1);
        carrinho.adicionarItem("carregador", 40d, 1);
        carrinho.adicionarItem("carregador", 40d, 1);
        carrinho.adicionarItem("capinha", 20d, 2);

        carrinho.exibirItens();

        carrinho.removerItem("carregador");

        carrinho.exibirItens();

        System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());
    }
}
