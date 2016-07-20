package Modelo;

/**
 * 
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */

public class Seguidor {
    private String nome;
    private String relacionamento;
    private Pessoa nomePessoa;

    /**
     *
     * @param nome Nome do seguidor
     * @param relacionamento Relacionamento que o seguidor tem com o objeto Pessoa
     * @param nomePessoa nome do objeto Pessoa relacionada com o seguidor
     */
    
    public Seguidor(String nome, String relacionamento, Pessoa nomePessoa) {
        this.nome = nome;
        this.relacionamento = relacionamento;
        this.nomePessoa = nomePessoa;
    }

    public Seguidor(){
        this("", "", new Pessoa());
    }

    public String getNome() {
        return nome;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public Pessoa getNomePessoa() {
        return nomePessoa;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }
    
    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento.toLowerCase();
    }

    public void setNomePessoa(Pessoa nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    @Override
    public String toString(){
        return "Seguidor: " + nome + ".\n" + "Relacionamento com " + nomePessoa.getNome() + ": " + relacionamento + ".\n";
    }
            
}
