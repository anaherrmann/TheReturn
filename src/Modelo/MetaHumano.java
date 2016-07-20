package Modelo;

import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class MetaHumano extends Personagem {

    private TreeSet<String> poder;
    private String descricaoOrigemPoder;

    /**
     *
     * @param poder Lista com o(s) poder(es) do Meta Humano
     * @param descricaoOrigemPoder Como o Meta Humano conseguiu o(s) poder(es)
     * @param nome Alter Ego da pessoa
     * @param ideal está incluso um dos itens da enum Ideal: Heroi, AntiHeroi e
     * Vilao
     * @param nomeUniverso Universo ao qual o objeto de Personagem pertence
     * (nesse model são abordados Marvel e DC)
     * @param equipePrimaria Equipe a qual o objeto de Personagem participa
     */
    public MetaHumano(TreeSet<String> poder, String descricaoOrigemPoder, String nome, String ideal, Universo nomeUniverso, String equipePrimaria) {
        super(nome, ideal, nomeUniverso, equipePrimaria);
        this.poder = new TreeSet<>(poder);
        this.descricaoOrigemPoder = descricaoOrigemPoder;
    }

    public MetaHumano() {
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

    public String getDescricaoOrigemPoder() {
        return descricaoOrigemPoder;
    }

    public void setDescricaoOrigemPoder(String descricaoOrigemPoder) {
        this.descricaoOrigemPoder = descricaoOrigemPoder;
    }

    @Override
    public String toString() {
        String meta = super.toString();
        meta += "Descrição do MetaHumano: " + descricaoOrigemPoder + ".\nPoderes: ";
        for (String string : poder) {
            meta += "\n\t" + string;
        }
        meta += "\n";
        return meta;
    }

}
