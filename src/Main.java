import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //USUARIOS!!!!!!!!!!!!!!!!!!
        String nome, senha, nascimento;
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setSenha(String senha);

        System.out.println("Bem vindo! Selecione seus dados");
        System.out.println("Nome:");
        nome = sc.nextLine();
        System.out.println("Senha:");
        sc.nextLine();
        System.out.println("Data de Nascimento:");








        // Criando um array para armazenar os usuários
        Usuario[] usuarios = new Usuario[10];

        // Criando usuários com nomes aleatórios
        usuarios[0] = new Usuario("Alice", "senha1", "1995-05-20");
        usuarios[1] = new Usuario("Bob", "senha2", "1992-03-15");
        usuarios[2] = new Assinante("Carol", "senha3", "1990-07-30", "2024-10-31", true);
        usuarios[3] = new Usuario("David", "senha4", "1988-12-10");
        usuarios[4] = new Assinante("Eve", "senha5", "1993-08-25", "2025-10-31", true);
        usuarios[5] = new Usuario("Frank", "senha6", "1991-04-18");
        usuarios[6] = new Assinante("Grace", "senha7", "1985-11-05", "2026-10-31", true);
        usuarios[7] = new Usuario("Heidi", "senha8", "1996-09-12");
        usuarios[8] = new Assinante("Ivan", "senha9", "1994-02-22", "2025-10-31", true);
        usuarios[9] = new Usuario("Judy", "senha10", "1989-06-28");

        // Exibindo os nomes e tipos de usuário
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Assinante assinante) {
                // Usando a variável de padrão para evitar declaração extra
                System.out.println("Assinante: " + assinante.getNome() + ", Validade: " + assinante.getValidadeAssinatura());
                System.out.println(" ");
            } else {
                System.out.println("Usuário: " + usuario.getNome());
                System.out.println(" ");
            }
        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //JOGOS!!!!!

        Jogo[] jogos = new Jogo[10];

        // Criando jogos com nomes, categorias e status
        jogos[0] = new Jogo("The Legend of Zelda: Breath of the Wild", "Aventura", true, "2017-03-03", false);
        jogos[1] = new Jogo("The Witcher 3: Wild Hunt", "RPG", true, "2015-05-19", true);
        jogos[2] = new Jogo("Dark Souls III", "Ação/RPG", true, "2016-03-24", false);
        jogos[3] = new Jogo("Super Mario Odyssey", "Plataforma", true, "2017-10-27", true);
        jogos[4] = new Jogo("God of War", "Ação/Aventura", true, "2018-04-20", false);
        jogos[5] = new Jogo("Minecraft", "Sandbox", true, "2011-11-18", true);
        jogos[6] = new Jogo("Overwatch", "FPS", false, "2016-05-24", false);
        jogos[7] = new Jogo("Hollow Knight", "Metroidvania", true, "2017-02-24", true);
        jogos[8] = new Jogo("Celeste", "Plataforma", true, "2018-01-25", false);
        jogos[9] = new Jogo("Stardew Valley", "Simulação", true, "2016-02-26", true);

        // Exibindo as informações dos jogos
        for (Jogo jogo : jogos) {
            jogo.mostraInformacao();
            System.out.println();

        }

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------


    }
}
