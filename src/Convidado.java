
import java.util.Comparator;

public class Convidado implements Comparable<Convidado> {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;

    }

    @Override
    public int compareTo(Convidado c) { // when the sort mathod is called the variable nome is the main reference
        return nome.compareToIgnoreCase(c.nome);
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

class OrdenarPorCodigoConvite implements Comparator<Convidado> {

    @Override
    public int compare(Convidado c1, Convidado c2) {
        return Integer.compare(c1.getCodigoConvite(), c2.getCodigoConvite());
    }

}