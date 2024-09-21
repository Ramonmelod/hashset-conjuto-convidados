public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;

    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Código do Convite: " + getCodigoConvite();
    }

}
