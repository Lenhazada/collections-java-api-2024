package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastro.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastro.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastro.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastro.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastro.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastro.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
    }

