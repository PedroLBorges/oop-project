import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        private static ArrayList<Usuario> usuarios = new ArrayList<>();

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nBem-Vindo ao sistema, escolha sua opção:");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Login");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu se cadastrar!");

                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite sua senha: ");
                    String senha = scanner.nextLine();

                    System.out.print("Digite sua data de nascimento (ex: 01/01/2000): ");
                    String nascimento = scanner.nextLine();

                    // Verifique se o nome já existe antes de criar um novo usuário
                   // if (usuarios.stream().anyMatch(u -> u.getNome().equals(nome))) {
                      //  System.out.println("Nome de usuário já existe. Tente outro nome.");
                       // break;
                    }

                    Usuario novoUsuario = new Usuario(nome, senha, nascimento);
                    usuarios.add(novoUsuario); // Adiciona o novo usuário à lista

                    System.out.println("\nUsuário criado com sucesso!");
                    System.out.println("Nome do usuário: " + novoUsuario.getNome());
                    break;

                case 2:
                    System.out.println("Você escolheu realizar o Login!");

                    System.out.print("Digite seu nome: ");
                    String loginNome = scanner.nextLine().trim();

                    System.out.print("Digite sua senha: ");
                    String loginSenha = scanner.nextLine().trim();

                    boolean loginValido = false;
                    Usuario usuarioLogado = null;
                    for (Usuario usuario : usuarios) {
                        // Verifique a comparação
                        if (usuario.getNome().equals(loginNome) && usuario.getSenha().equals(loginSenha)) {
                            System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario.getNome());
                            loginValido = true;
                            usuarioLogado = usuario;
                            break;
                        }
                    }

                    if (loginValido) {
                        exibirMenuUsuario(usuarioLogado);
                    } else {
                        System.out.println("Nome ou senha incorretos. Tente novamente.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenuUsuario(Usuario usuario) {
        // Verifica se o usuário logado é um Perfil
        if (!(usuario instanceof Perfil)) {
            System.out.println("Erro: O usuário não é um perfil válido.");
            return;
        }

        Perfil perfilLogado = (Perfil) usuario; // Faz o cast do usuário para Perfil
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu do Usuário: " + perfilLogado.getNome());
            System.out.println("1 - Adicionar amigo");
            System.out.println("2 - Ver amigos");
            System.out.println("3 - Logout");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do amigo que deseja adicionar: ");
                    String amigoNome = scanner.nextLine().trim();

                    // Procura o amigo na lista de usuários
                    Usuario amigoEncontrado = null;
                    for (Usuario u : usuarios) {
                        if (u.getNome().equals(amigoNome)) {
                            amigoEncontrado = u;
                            break;
                        }
                    }

                    // Adiciona o amigo, se encontrado
                    if (amigoEncontrado != null) {
                        perfilLogado.adicionarAmigo(usuarios); // Chama o método da instância do Perfil
                        System.out.println("Amigo " + amigoNome + " adicionado com sucesso!");
                    } else {
                        System.out.println("Usuário com o nome " + amigoNome + " não encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("Amigos de " + perfilLogado.getNome() + ":");
                    perfilLogado.exibirPerfil(); // Exibe o perfil e amigos
                    break;

                case 3:
                    System.out.println("Você saiu do menu do usuário.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3); // Enquanto não escolher sair (logout)
    }
}




//
//        System.out.println("2-Catálogo de Jogos");
//        System.out.println("2-Adicionar um jogo na sua conta");



//        Jogo[] jogos = new Jogo[10];
//
//        // Criando jogos com nomes, categorias e status
//        jogos[0] = new Jogo("The Legend of Zelda: Breath of the Wild", "Aventura", true, "2017-03-03", false);
//        jogos[1] = new Jogo("The Witcher 3: Wild Hunt", "RPG", true, "2015-05-19", true);
//        jogos[2] = new Jogo("Dark Souls III", "Ação/RPG", true, "2016-03-24", false);
//        jogos[3] = new Jogo("Super Mario Odyssey", "Plataforma", true, "2017-10-27", true);
//        jogos[4] = new Jogo("God of War", "Ação/Aventura", true, "2018-04-20", false);
//        jogos[5] = new Jogo("Minecraft", "Sandbox", true, "2011-11-18", true);
//        jogos[6] = new Jogo("Overwatch", "FPS", false, "2016-05-24", false);
//        jogos[7] = new Jogo("Hollow Knight", "Metroidvania", true, "2017-02-24", true);
//        jogos[8] = new Jogo("Celeste", "Plataforma", true, "2018-01-25", false);
//        jogos[9] = new Jogo("Stardew Valley", "Simulação", true, "2016-02-26", true);

//        // Exibindo as informações dos jogos
//        for (Jogo jogo : jogos) {
//            jogo.mostraInformacao();
//            System.out.println();
//
//        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------




