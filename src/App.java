
public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
        listaConvidados.AdicionarConvidado("Ramon Melo", 101992);
        listaConvidados.AdicionarConvidado("Kaleb Melo", 102002);
        listaConvidados.AdicionarConvidado("Dalila Melo", 31999);
        listaConvidados.AdicionarConvidado("Ramon Melo", 101992);
        listaConvidados.MostraConvidados();
        listaConvidados.RemoverConvidado(102002);
        System.out.println("----------------depois remoção------------------");
        listaConvidados.MostraConvidados();

    }
}
