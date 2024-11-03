public class Usuario {


    protected String nome;
    protected int iD;
    private String senha;
    protected String nascimento;


    public Usuario(String nome, int iD, String senha, String nascimento) {
        this.nome = nome;
        this.iD = iD;
        this.senha = senha;
        this.nascimento = nascimento;
    }


    public void trocarSenha(String novaSenha) {

        this.senha = novaSenha;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setSenha(String senha) {
        this.senha = senha;

    }

    public String getNome() {

        return this.nome;

    }

    public String getSenha() {
        return this.senha;
    }

    public String getNascimento() {
        return this.nascimento;
    }


    public void setID(int iD) {
        this.iD = iD;
    }

    public int getID() {
        return this.iD;
    }

}