public class Perfil extends Usuario{

    private int amigos;
    private String apelido;
    private boolean status;
    private String jogoAtual;

    public Perfil(int amigos, String apelido, boolean status, String jogoAtual) {

        this.amigos = amigos;
        this.apelido = apelido;
        this.status = status;
        this.jogoAtual = jogoAtual;

    }

    public void adicionarAmigo(String iD) {

        //Código para adicionar um novo amigo na conta pelo ID

    }

    public void removerAmigo(String iD) {

        //Código para remover um amigo na conta pelo ID

    }

    public void trocarApelido(String novoapelido) {

        this.apelido = novoapelido;

    }

}