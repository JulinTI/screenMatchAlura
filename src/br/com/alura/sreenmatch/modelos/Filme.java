package br.com.alura.sreenmatch.modelos;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public void exibeFichaTecnica (){
        System.out.println("Nome do filme: " + nome);
        System.out.println("O ano de lancamento é: " + anoDeLancamento);
    }

    public void avalia(double nota){

        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

}
