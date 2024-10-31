import java.util.ArrayList;
import java.util.Scanner;

public class Perfil extends Usuario {

    private int quantidadeAmigos = 0;
    private String apelido;
    private boolean status;
    private String jogoAtual;
    private ArrayList<Integer> listaAmigos;  // Lista de IDs de amigos como inteiros
    private Scanner scanner;  // Scanner compartilhado para entrada do usuário

    public Perfil(String nome, String senha, String nascimento, String apelido, boolean status, String jogoAtual, Scanner scanner) {
        super(nome, senha, nascimento);
        this.apelido = apelido;
        this.status = status;
        this.jogoAtual = jogoAtual;
        this.listaAmigos = new ArrayList<>(); // Inicializa a lista de amigos
        this.scanner = scanner;
    }

    private int solicitarID(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextInt();
    }

    public void adicionarAmigo(ArrayList<Usuario> usuarios) {
        int iD = solicitarID("Digite o ID do usuário que deseja adicionar como amigo:");
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == iD) {
                quantidadeAmigos++;
                listaAmigos.add(iD); // Adiciona o ID diretamente como um inteiro
                System.out.println("Amigo " + usuario.getNome() + " (ID: " + iD + ") adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Usuário com ID " + iD + " não encontrado.");
    }

    public void removerAmigo() {
        int iD = solicitarID("Digite o ID do amigo que deseja remover:");
        if (listaAmigos.contains(iD)) { // Verifica se a lista contém o ID como inteiro
            listaAmigos.remove(Integer.valueOf(iD)); // Remove o ID como um objeto Integer
            quantidadeAmigos--;
            System.out.println("Amigo com ID " + iD + " removido com sucesso.");
        } else {
            System.out.println("Amigo com ID " + iD + " não encontrado na sua lista de amigos.");
        }
    }

    public void trocarApelido(String novoApelido) {
        this.apelido = novoApelido;
        System.out.println("Apelido atualizado para: " + novoApelido);
    }

    public void exibirPerfil() {
        System.out.println("Perfil do usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Amigos: " + quantidadeAmigos);
        System.out.println("Status: " + (status ? "Online" : "Offline"));
        System.out.println("Jogo atual: " + (jogoAtual.isEmpty() ? "Nenhum" : jogoAtual));
        System.out.println("Lista de amigos: " + listaAmigos);
    }
}