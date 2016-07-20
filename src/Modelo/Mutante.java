package Modelo;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Mutante extends Personagem {

    private TreeSet<String> poder;

    /**
     *
     * @param poder Lista com o(s) poder(es) do Mutante
     * @param nome Alter Ego da pessoa
     * @param ideal está incluso um dos itens da enum Ideal: Heroi, AntiHeroi e
     * Vilao
     * @param nomeUniverso Universo ao qual o objeto de Personagem pertence
     * (nesse model são abordados Marvel e DC)
     * @param equipePrimaria Equipe a qual o objeto de Personagem participa
     */
    public Mutante(TreeSet<String> poder, String nome, String ideal, Universo nomeUniverso, String equipePrimaria) {
        super(nome, ideal, nomeUniverso, equipePrimaria);
        this.poder = poder;
    }

    public Mutante() {
        super();
    }

    public TreeSet<String> getPoder() {
        return poder;
    }

    /**
     * Adicionar poder a lista de poder
     *
     * @param poder a ser adicionado
     * @return boolean para verificar se foi inserido
     */
    public boolean addPoder(String poder) {
        return this.poder.add(poder);
    }

    /**
     * Remover da lista de poder
     *
     * @param poder a ser removido
     * @return boolean para verificar se foi removido
     */
    public boolean removePoder(String poder) {
        return this.poder.remove(poder);
    }

    @Override
    public String toString() {
        String mutante = super.toString();
        mutante += "Poderes: ";
        for (String string : poder) {

            mutante += "\n\t" + string;
        }
        mutante += "\n";
        return mutante;
    }

}
