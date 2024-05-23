package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    //adicionarNumero
    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    //calcularSoma
    public int calcularSoma() {
        int somaTotal = 0;
        for (Integer i : numeros) {
            somaTotal += i;
        }
        return somaTotal;
    }

    //encontrarMaiorNumero
    public int encontrarMaiorNumero() {
        int maiorValor = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i > maiorValor) {
                    maiorValor = i;
                }
            }
            return maiorValor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //encontrarMenorNumero
    public int encontrarMenorNumero() {
        int menorValor = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i < menorValor) {
                    menorValor = i;
                }
            }
            return menorValor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //exibirNumeros
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
       SomaNumeros soma = new SomaNumeros();
        // Adicionando números à lista
        soma.adicionarNumero(5);
        soma.adicionarNumero(0);
        soma.adicionarNumero(0);
        soma.adicionarNumero(-2);
        soma.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        soma.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + soma.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + soma.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + soma.encontrarMenorNumero());
    }
}

