import br.com.alura.sreenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Piratas do Caribe");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        System.out.println(meuFilme.pegaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

    }
}
