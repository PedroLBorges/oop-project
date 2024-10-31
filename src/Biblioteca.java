import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Biblioteca {

    protected int quantidadeDeJogos;
    protected ArrayList <Jogo> listaDeJogos = new ArrayList<Jogo>();

    public Biblioteca(int quantidadeDeJogos){
        this.quantidadeDeJogos = quantidadeDeJogos;
    }

    public Biblioteca(){

    }


    public void setQuantidadeDeJogos(int quantidadeJogos) {

        this.quantidadeDeJogos = quantidadeJogos;

    }

    public void ordenarJogos() {

        Collections.sort(listaDeJogos, new Comparator<Jogo>() {
            public int compare(Jogo j1, Jogo j2) {
                return j1.getNome().compareTo(j2.getNome());

            }
        });
    }


    public void favoritarJogo(String nome) {

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                listaDeJogos.get(i).setFavorito(true);

            }

        }

    }

    public void desfavoritarJogo(String nome) {

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                listaDeJogos.get(i).setFavorito(false);

            }

        }

    }

    public boolean buscarJogoPorNome(String nome) {

        boolean possui = false;

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                possui = true;

            }

        }

        return possui;

    }

    public void adicionarJogo(String nome, String Categoria, boolean statusDoJogo, String dataLancamento, boolean favorito) {

        Jogo jogotemp = new Jogo(nome, Categoria, statusDoJogo, dataLancamento, favorito);
        listaDeJogos.add(jogotemp);

    }

    public void removerJogo(String nome) {

        for (int i = 0; i < listaDeJogos.size(); i++) {

            if (listaDeJogos.get(i).getNome().equals(nome)) {

                listaDeJogos.remove(i);

            }

        }

    }

}