package Modelo;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class HQ {

    private String titulo;
    private String editora;
    private int ano;
    private Pessoa personagemPrincipal;

    /**
     *
     * @param titulo Titulo da HQ
     * @param editora Editora que publicou a HQ
     * @param ano Ano de publicação da HQ
     * @param personagemPrincipal Nesta versao só vai ser tratado o personagem
     * principal da HQ
     */
    public HQ(String titulo, String editora, int ano, Pessoa personagemPrincipal) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.personagemPrincipal = personagemPrincipal;
    }

    public HQ() {
        this("", "", 0, new Pessoa());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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
        return "História em Quadrinhos\n" + titulo.toUpperCase() + "-" + personagemPrincipal.getNome().toUpperCase() + "\nEditora: " + editora + ".\nAno de Publicação: " + ano + ".\n";
    }

}
