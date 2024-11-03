import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Perfil> perfis = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int qtdPerfis = 0;

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

                    System.out.println("Vamos criar um perfil para você agora: ");
                    System.out.println("Apelido para seu perfil: ");
                    String apelido = scanner.nextLine();

                    //Verifique se o nome já existe antes de criar um novo usuário
                    if (perfis.stream().anyMatch(p -> p.getNome().equals(nome))) {
                        System.out.println("Apelido já existe. Tente outro.");
                    }else {
                        Perfil novoPerfil = new Perfil(nome, senha, nascimento, apelido, true, "nada", scanner);
                        perfis.add(novoPerfil);
                        qtdPerfis++;
                        System.out.println("\nPerfil criado com sucesso!");
                        System.out.println("Apelido: " + apelido + "(ID = " + qtdPerfis + ")");
                    }

                break;

                case 2:
                    System.out.println("Você escolheu realizar o Login!");

                    System.out.print("Digite seu nome: ");
                    String loginNome = scanner.nextLine().trim();

                    System.out.print("Digite sua senha: ");
                    String loginSenha = scanner.nextLine().trim();

                    boolean loginValido = false;
                    Perfil perfilLogado = null;
                    for (Perfil perfil : perfis) {
                        // Verifique a comparação
                        if (perfil.getNome().equals(loginNome) && perfil.getSenha().equals(loginSenha)) {
                            System.out.println("Login realizado com sucesso! Bem-vindo, " + perfil.getNome());
                            loginValido = true;
                            perfilLogado = perfil;
                            break;
                        }
                    }

                    if (loginValido) {
                        exibirMenuUsuario(perfilLogado);
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

    private static void exibirMenuUsuario(Perfil perfil) {
        // Verifica se o usuário logado é um Perfil
        if (!(perfil instanceof Perfil)) {
            System.out.println("Erro: O usuário não é um perfil válido.");
            return;
        }

        Perfil perfilLogado = (Perfil) perfil; // Faz o cast do usuário para Perfil
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu do Usuário: " + perfilLogado.getNome());
            System.out.println("1 - Exibir perfil");
            System.out.println("2 - Adicionar amigo");
            System.out.println("3 - Ver amigos");
            System.out.println("4 - Logout");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:

                    perfilLogado.exibirPerfil();

                break;

                case 2:
                    System.out.print("Digite o nome do amigo que deseja adicionar: ");
                    String amigoNome = scanner.nextLine().trim();

                    // Procura o amigo na lista de usuários
                    Usuario amigoEncontrado = null;
                    for (Perfil p : perfis) {
                        if (p.getNome().equals(amigoNome)) {
                            amigoEncontrado = p;
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

                case 3:
                    System.out.println("Amigos de " + perfilLogado.getNome() + ":");
                    perfilLogado.exibirPerfil(); // Exibe o perfil e amigos
                break;

                case 4:
                    System.out.println("Você saiu do menu do usuário.");
                break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                break;
            }
        } while (opcao != 4); // Enquanto não escolher sair (logout)
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




