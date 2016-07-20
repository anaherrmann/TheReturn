package Modelo;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Filme {

    private String titulo;
    private int ano;
    private Pessoa personagemPrincipal;

    /**
     *
     * @param titulo Titulo do filme
     * @param ano Ano em que o filme foi lançado
     * @param personagemPrincipal personagem principal a qual o filme se refere
     */
    public Filme(String titulo, int ano, Pessoa personagemPrincipal) {
        this.titulo = titulo;
        this.ano = ano;
        this.personagemPrincipal = personagemPrincipal;
    }

    public Filme() {
        this("", 0, new Pessoa());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getPersonagemPrincipal() {
        return personagemPrincipal;
    }

    public void setPersonagemPrincipal(Pessoa personagemPrincipal) {
        this.personagemPrincipal = personagemPrincipal;
    }

    @Override
    public String toString() {
        return "Filme\n" + titulo.toUpperCase() + "-" + personagemPrincipal.getNome().toUpperCase() + ".\nAno: " + ano + ".\n";
    }

}
