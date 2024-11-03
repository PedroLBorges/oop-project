import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//cria a classe Biblioteca de jogos
public class Biblioteca {

    protected int quantidadeDeJogos;
    protected static ArrayList <Jogo> listaDeJogos = new ArrayList<Jogo>();

    public Biblioteca(int quantidadeDeJogos){
        this.quantidadeDeJogos = quantidadeDeJogos;
    }


    public void setQuantidadeDeJogos(int quantidadeJogos) {

        this.quantidadeDeJogos = quantidadeJogos;

    }

    // metodos para ordenar os jogos
    public void ordenarJogos() {

        Collections.sort(listaDeJogos, new Comparator<Jogo>() {
            public int compare(Jogo j1, Jogo j2) {
                return j1.getNome().compareTo(j2.getNome());

            }
        });
    }

    //metodo para mostrar os jogos da biblioteca
    public static void mostarBibliotec(){ //mostra todos os jogos presentes na biblioteca

        if(listaDeJogos.isEmpty()){
            System.out.println("Não há jogos na biblioteca!");
        }

        else {
            System.out.println("Lista de jogos: ");

            for (Jogo jogos : listaDeJogos) {

                if(jogos.getFavorito()) {
                    System.out.println(jogos.getNome() + "( favorito)");
                }else{
                    System.out.println(jogos.getNome());
                }
            }
        }

    }


    //metodo para favoritar um jogo ja adicionado pelo usuario
    public void favoritarJogo(String nome) {

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                listaDeJogos.get(i).setFavorito(true);

            }

        }

    }

    //metodo para desfavoritar um jogo ja adicionado pelo usuario
    public void desfavoritarJogo(String nome) {

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                listaDeJogos.get(i).setFavorito(false);

            }

        }

    }

    //metodo para buscar um jogo, o usuario digitará um nome e o "if" verá se o jogo existe
    public boolean buscarJogoPorNome(String nome) {

        boolean possui = false;

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                possui = true;

            }

        }

        return possui;

    }

    //metodo que adiciona um jogo na biblioteca, utiliza o contrutor de JOGO
    public static void adicionarJogoBiblioteca(String nome, String Categoria, String dataLancamento, boolean favorito) {

        Jogo jogotemp = new Jogo(nome, Categoria,  dataLancamento, favorito);
        listaDeJogos.add(jogotemp);

    }

    //metodo que remove um jogo da biblioteca, faz um if com equals nome do jogo para verificar se o jogo realmente existe
    public static void removerJogo(String nome) {

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (!listaDeJogos.get(i).getNome().equals(nome)) {

                System.out.println("Não foi possivel localizar o jogo");
            }

            else {
                System.out.println("Jogo removido com sucesso!");
                listaDeJogos.remove(i);
            }
        }
    }

}