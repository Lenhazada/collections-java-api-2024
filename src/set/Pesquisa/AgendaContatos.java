package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    //construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //adicionar contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    //testes
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agenda = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agenda.exibirContatos();

        // Adicionando contatos à agenda
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Maria Fernandes", 55555555);
        agenda.adicionarContato("Ana", 88889999);
        agenda.adicionarContato("Fernando", 77778888);
        agenda.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agenda.exibirContatos();
        // Pesquisando contatos pelo nome
        System.out.println(agenda.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agenda.exibirContatos();
    }

}
