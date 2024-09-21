
import java.util.HashSet;
import java.util.Set;

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

}
