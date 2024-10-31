public class Assinante extends Usuario {

    private String validadeAssinatura;
    private boolean acessoJogos;

    public Assinante(String validadeAssinatura, boolean acessoJogos) {

        this.validadeAssinatura = validadeAssinatura;
        this.acessoJogos = acessoJogos;

    }

    public void renovarAssinatura() {

        //Código para mudar a validade de assinatura por uma nova

    }

}