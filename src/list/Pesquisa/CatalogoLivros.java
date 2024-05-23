package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    //adicionar livro na list
    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        livroList.add(new Livro(nome, autor, anoPublicacao));
    }

    //faz a pesquisa do livro por autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    //faz a pesquisa de livros entre o intervalo de determinados anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaPorIntervaloAnos.add(l);
                }
            }
        }
        return listaPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                }
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "autor 4", 1990);
    }
}
