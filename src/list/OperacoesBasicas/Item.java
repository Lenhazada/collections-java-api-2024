package list.OperacoesBasicas;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade= quantidade;
    }

    //getter
    public String getNome() {
        return nome;
    }

    //getter
    public Double getPreco() {
        return preco;
    }

    //getter
    public Integer getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return "nome= " + nome + ", preco= " + preco + ", quantidade= " + quantidade + "}";
    }
}
