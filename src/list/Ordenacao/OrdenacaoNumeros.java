package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> numerosList;

    //construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    //adicionando numeros na lista
    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    //ordenar lista em ordem crescente

    public List<Integer> OrdenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    //ordenar lista em ordem descrescente
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.OrdenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}

