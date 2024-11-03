public class Jogo {

    private String nome;
    private String categoria;
    private String dataLancamento;
    private boolean favorito;
    private boolean acessoAssinante;

    //contrutor de jogo, adiciona um jogo com nome, categoria, datade lançamento e favorito
    public Jogo(String nome, String Categoria, String dataLancamento, boolean favorito) {

        this.nome = nome;
        this.categoria = Categoria;
        this.dataLancamento = dataLancamento;
        this.favorito = favorito;

    }

    //metodo que verifica se um jogo esta aberto ou fechado
    public void abertoOuFechado(boolean statusDoJogo) {

        if (statusDoJogo) {

            System.out.println("O jogo esta aberto");

        }else {

            System.out.println("O jogo esta fechado");

        }

    }

    //verifica se o jogo descrito pelo usuario é um jogo favorito ou nao
    public void statusFavorito(boolean favorito) {

        if (favorito) {

            System.out.println("O jogo eh um favorito");

        }else {

            System.out.println("O jogo nao eh um favorito");

        }

    }

    //metodo que mostra as informaçoes de algum jogo do usuario
    public void mostraInformacao() {

        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Data: " + dataLancamento);
        statusFavorito(favorito);

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;

    }

    public String getCategoria() {

        return categoria;

    }

    public boolean getFavorito() {

        return favorito;

    }

    public void setFavorito(boolean favorito) {

        this.favorito = favorito;

    }

}