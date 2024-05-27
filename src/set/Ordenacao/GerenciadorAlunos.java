package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunosSet.remove(alunoParaRemover);

        if (alunoParaRemover == null)
            System.out.println("Matricula não encontrada!");
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciador.adicionarAluno("João", 123456L, 7.5);
        gerenciador.adicionarAluno("Maria", 123457L, 9.0);
        gerenciador.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciador.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciador.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciador.removerAlunoPorMatricula(000L);
        gerenciador.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciador.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciador.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciador.exibirAlunosPorNota();
    }
}

