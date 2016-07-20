package Modelo;

import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Alienigena extends Personagem {

    private String especie;
    private String mundoOrigem;
    private TreeSet<String> poderes;

    /**
     *
     * @param mundoOrigem Mundo de origem do personagem
     * @param especie Espécie do personagem
     * @param poderes Lista de poderes
     * @param nome Alter Ego da pessoa
     * @param ideal está incluso um dos itens da enum Ideal: Heroi, AntiHeroi e
     * Vilao
     * @param nomeUniverso Universo ao qual o objeto de Personagem pertence
     * (nesse model são abordados Marvel e DC)
     * @param equipePrimaria Equipe a qual o objeto de Personagem participa
     */
    public Alienigena(String nome, String especie, String mundoOrigem, TreeSet<String> poderes, String ideal, Universo nomeUniverso, String equipePrimaria) {
        super(nome, ideal, nomeUniverso, equipePrimaria);
        this.especie = especie;
        this.mundoOrigem = mundoOrigem;
        this.poderes = new TreeSet<>(poderes);
    }

    public Alienigena() {
        super();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie.toLowerCase();
    }

    public String getMundoOrigem() {
        return mundoOrigem;
    }

    public void setMundoOrigem(String mundoOrigem) {
        this.mundoOrigem = mundoOrigem.toLowerCase();
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
        String alien = super.toString() + "Personagem Alienigena:\n" + "Espécie: " + especie + "\nMundo de Origem: " + mundoOrigem + "\n";
        alien += "Poderes: ";
        for (String string : poderes) {

            alien += "\n\t" + string;
        }
        alien += "\n";
        return alien;
    }
}
