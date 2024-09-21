
public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
        listaConvidados.AdicionarConvidado("Ramon Melo", 101992);
        listaConvidados.AdicionarConvidado("Kaleb Melo", 102002);
        listaConvidados.AdicionarConvidado("Dalila Melo", 31999);
        listaConvidados.AdicionarConvidado("Ramon Melo", 101992);
        listaConvidados.AdicionarConvidado("Pedro Amaral", 21999);
        listaConvidados.AdicionarConvidado("Pedro Carlos", 51989);
        listaConvidados.AdicionarConvidado("Pedro Paulo", 21978);
        listaConvidados.MostraConvidados();
        listaConvidados.RemoverConvidado(102002);
        System.out.println("----------------depois remoção------------------");
        listaConvidados.MostraConvidados();
        System.out.println("número convidados: " + listaConvidados.ContarConvidados());
        System.out.println("----------------Convidados por nome------------------");
        System.out.println(listaConvidados.PesquisarConvidadoPorNome("Pedro"));

    }
}
