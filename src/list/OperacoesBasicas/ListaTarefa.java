package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adiciona tarefa na lista
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // remove a tarefa com essa descricao |
    //                                    V
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
        //se a descricao da tarefa for igual a descricao passada no parametro "removerTarefa"
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //retorna a quantidade de elementos dentro da lista
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //imprime a lista de tarefa
    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O numero total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O numero total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefa();
    }
}
