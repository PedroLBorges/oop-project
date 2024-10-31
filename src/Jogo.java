public class Jogo {

    private String nome;
    private String categoria;
    private int vezesJogado;
    private boolean statusDoJogo;
    private String dataLancamento;

    public Jogo(String nome, String Categoria, int vezesJogado, boolean statusDoJogo, String dataLancamento) {

        this.nome = nome;
        this.categoria = Categoria;
        this.vezesJogado = vezesJogado;
        this.statusDoJogo = statusDoJogo;
        this.dataLancamento = dataLancamento;

    }

    public int mostrarVezesJogado(int num) {

        //Código que, usando o número que representa o jogo, exibe quantas vezes ele foi jogado

    }

    public getInformacao() {

        //Código que retorna um array com todas as informações do jogo, com um mesmo tipo

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

}