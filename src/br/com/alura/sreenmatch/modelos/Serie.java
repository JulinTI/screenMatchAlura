package br.com.alura.sreenmatch.modelos;

public class Serie {

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodeos;


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodeos() {
        return minutosPorEpisodeos;
    }

    public void setMinutosPorEpisodeos(int minutosPorEpisodeos) {
        this.minutosPorEpisodeos = minutosPorEpisodeos;
    }
}
