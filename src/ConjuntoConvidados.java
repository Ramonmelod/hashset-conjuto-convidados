import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {

    private final Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void AdicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void RemoverConvidado(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoRemover = convidado;
                break;
            }

        }
        convidadoSet.remove(convidadoRemover);
    }

    public void MostraConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);

        }
    }

    public int ContarConvidados() {
        return convidadoSet.size();
    }

    public Set<Convidado> PesquisarConvidadoPorNome(String nome) {
        Set<Convidado> convidadoPorNomeSet = new HashSet<>();
        for (Convidado conv : convidadoSet) {
            if (conv.getNome().startsWith(nome)) {
                convidadoPorNomeSet.add(conv);
            }

        }
        return convidadoPorNomeSet;
    }

    public Set OrdenarConvidadosOrdemAlfabetica() {
        Set<Convidado> alf = new TreeSet<>(convidadoSet);
        return alf;
    }

}
