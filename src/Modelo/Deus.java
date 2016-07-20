package Modelo;

import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Deus extends Personagem {

    private String categoria;
    private String mundoOrigem;
    private TreeSet<String> poderes;

    /**
     *
     * @param categoria No universo DC existem os Anjos, Campeões Divinos,
     * Deuses, Elementais, Entidades, e a espécie dos deuses também podem ser
     * inseridas
     * @param mundoOrigem mundo de origem do deus
     * @param poderes lista de poderes
     * @param nome Alter Ego da pessoa
     * @param ideal está incluso um dos itens da enum Ideal: Heroi, AntiHeroi e
     * Vilao
     * @param nomeUniverso Universo ao qual o objeto de Personagem pertence
     * (nesse model são abordados Marvel e DC)
     * @param equipePrimaria Equipe a qual o objeto de Personagem participa
     */
    public Deus(String categoria, String mundoOrigem, TreeSet<String> poderes, String nome, String ideal, Universo nomeUniverso, String equipePrimaria) {
        super(nome, ideal, nomeUniverso, equipePrimaria);
        this.categoria = categoria;
        this.mundoOrigem = mundoOrigem;
        this.poderes = new TreeSet<>(poderes);
    }

    public Deus() {
        super();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMundoOrigem() {
        return mundoOrigem;
    }

    public void setMundoOrigem(String mundoOrigem) {
        this.mundoOrigem = mundoOrigem;
    }

    public TreeSet<String> getPoderes() {
        return poderes;
    }

    /**
     * Adicionar poder a lista de poderes
     *
     * @param poder a ser adicionado
     * @return boolean para verificar se foi inserido
     */
    public boolean addPoder(String poder) {
        return this.poderes.add(poder);
    }

    /**
     * Remover da lista de poderes
     *
     * @param poder a ser removido
     * @return boolean para verificar se foi removido
     */
    public boolean removePoder(String poder) {
        return this.poderes.remove(poder);
    }

    @Override
    public String toString() {
        String deus = super.toString() + "Personagem Deus\n" + "Mundo de Origem: " + mundoOrigem + "\n Categoria: " + categoria + "\n";
        deus += "Poderes: ";
        for (String string : poderes) {

            deus += "\n\t" + string;
        }
        deus += "\n";
        return deus;
    }
}
