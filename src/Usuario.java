
public class Usuario {


    protected String nome;
    protected int iD;
    private String senha;
    protected String nascimento;
    private String Nome;


    public Usuario(String nome, String senha, String nascimento) {
        this.nome = nome;
        this.senha = senha;
        this.nascimento = nascimento;
    }

    public Usuario(){

    }

    public void trocarSenha(String novaSenha) {

        this.senha = novaSenha;

    }

    public void setNome(String nome) {
        this.Nome = nome;

    }

    public void setSenha(String senha) {
        System.out.println("Digite a sua senha: ");
        this.senha = senha;

    }

    public String getNome() {

        return nome;

    }
    public int getID() {
        return iD;
    }

}

