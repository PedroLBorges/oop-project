import java.util.ArrayList;

public class Colecao extends Biblioteca {

    protected static ArrayList<Jogo> listaDeJogosColecao = new ArrayList<Jogo>();

    private final String nomeColecao;
    private String dataCriacao;
    private String descricaoColecao;

    //contrutor de coleção que adiciona quantidade de jogos, nome da coleçao, data e descrição
    public Colecao(int quantidadeDeJogos,String nomeColecao, String dataCriacao, String descricaoColecao) {
        super(quantidadeDeJogos);
        this.nomeColecao = nomeColecao;
        this.dataCriacao = dataCriacao;
        this.descricaoColecao = descricaoColecao;
    }

    //adiciona um jogo na coleção
    public static void adicionarJogo(String nome, String Categoria, String dataLancamento, boolean favorito) {

        Jogo jogotemp = new Jogo(nome, Categoria,  dataLancamento, favorito);
        listaDeJogosColecao.add(jogotemp);

    }

    //mostra a coleçao criada pelo usuario, contendo seu jogos e se é favorito ou não
    public void mostarColecao(){ //mostra todos os jogos presentes na coleção

        if(listaDeJogosColecao.isEmpty()){
            System.out.println("Não há jogos na biblioteca!");
        }

        else {
            for (Jogo jogos : listaDeJogosColecao) {

                if(jogos.getFavorito()){
                    System.out.println(jogos.getNome() + "Favorito");
                }else {
                    System.out.println(jogos.getNome());
                }
            }
        }
    }


    public String getNome(){
        return this.nomeColecao;

    }

}