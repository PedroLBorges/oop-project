public class Colecao extends Biblioteca {

    private final String nomeColecao;
    private String dataCriacao;
    private String descricaoColecao;

    public Colecao(int quantidadeDeJogos,String nomeColecao, String dataCriacao, String descricaoColecao) {
        super(quantidadeDeJogos);
        this.nomeColecao = nomeColecao;
        this.dataCriacao = dataCriacao;
        this.descricaoColecao = descricaoColecao;
    }

    public void mudarDescricao(String descricaoNova) {

        this.descricaoColecao = descricaoNova;

    }

    public void setDataCriacao(String data) {

        this.dataCriacao = data;

    }

}