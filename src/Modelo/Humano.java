package Modelo;

import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 *
 */
public class Humano extends Personagem {

    private TreeSet<String> habilidades;

    /**
     *
     * @param habilidades Habilidades do humano
     * @param nome Alter Ego da pessoa
     * @param ideal está incluso um dos itens da enum Ideal: Heroi, AntiHeroi e
     * Vilao
     * @param nomeUniverso Universo ao qual o objeto de Personagem pertence
     * (nesse model são abordados Marvel e DC)
     * @param equipePrimaria Equipe a qual o objeto de Personagem participa
     */
    public Humano(TreeSet<String> habilidades, String nome, String ideal, Universo nomeUniverso, String equipePrimaria) {
        super(nome, ideal, nomeUniverso, equipePrimaria);
        this.habilidades = new TreeSet<>(habilidades);
    }

    public Humano() {
        super();
    }

    public TreeSet<String> getHabilidades() {
        return habilidades;
    }

    /**
     * Adicionar habilidades a lista de habilidades
     *
     * @param habilidade a ser adicionado
     * @return boolean para verificar se foi inserido
     */
    public boolean addHabilidades(String habilidade) {
        return this.habilidades.add(habilidade);
    }

    /**
     * Remover da lista de habilidades
     *
     * @param habilidade a ser removido
     * @return boolean para verificar se foi removido
     */
    public boolean removeHabilidade(String habilidade) {
        return this.habilidades.remove(habilidade);
    }

    @Override
    public String toString() {
        String humano = "";
        humano += super.toString() + "Habilidades: ";
        for (String string : habilidades) {
            humano += "\n\t" + string;
        }
        humano += "\n";
        return humano;
    }

}
