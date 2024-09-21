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
    public boolean equals(Object obj) { // overriding the method equal for determining that codigoConvite is unique
        if (this == obj)
            return true;
        if (!(obj instanceof Convidado convidado))
            return false;

        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() { // makes the hashcode to be related with codigoConvite
        return Integer.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Código do Convite: " + getCodigoConvite();
    }

}
