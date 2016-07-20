package Modelo;

import Enums.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Personagem implements Comparable<Personagem>{

    Scanner input = new Scanner(System.in);

    protected String nome;
    protected String ideal;
    protected Universo nomeUniverso;
    protected String equipePrimaria;

    /**
     *
     * @param nome Alter Ego da pessoa
     * @param ideal está incluso um dos itens da enum Ideal: Heroi, AntiHeroi e Vilao 
     * @param nomeUniverso Universo ao qual o objeto de Personagem pertence
     * (nesse model são abordados Marvel e DC)
     * @param equipePrimaria Equipe a qual o objeto de Personagem participa
     */
    public Personagem(String nome, String ideal, Universo nomeUniverso, String equipePrimaria) {
        this.nome = nome;
        setIdeal(ideal);
        this.nomeUniverso = nomeUniverso;
        setEquipePrimaria(equipePrimaria);
    }

    public Personagem() {
        this("", null, new Universo(), "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    public String getIdeal() {
        return ideal;
    }

    public Universo getNomeUniverso() {
        return nomeUniverso;
    }

    /**
     *
     * @param ideal deve estar declarado em {@link Ideal}
     */
    public void setIdeal(String ideal) {
        boolean encontrou = false;
        for (Ideal iterator : Ideal.values()) {
            if (ideal.equalsIgnoreCase(iterator.toString())){
                this.ideal = ideal;
                encontrou = true;
            }
        }
        if (!encontrou){
            setIdeal(JOptionPane.showInputDialog(null, String.format("Ideal do %s inválido! Digite novamente um nome para o ideal: ", nome.toUpperCase()), "Ideal", JOptionPane.PLAIN_MESSAGE));
        }
    }
    
    public void setNomeUniverso(Universo nomeUniverso) {
        this.nomeUniverso = nomeUniverso;
    }

    public String getEquipePrimaria() {
        return equipePrimaria;
    }
 
    /**
     * 
     * @param equipePrimaria deve estar no {@link EquipePrimaria}
     * 
     */

    public void setEquipePrimaria(String equipePrimaria) {
        boolean encontrou = false;
        for (EquipePrimaria iterator : EquipePrimaria.values()) {
            if (equipePrimaria.equalsIgnoreCase(iterator.toString())){
                this.equipePrimaria = equipePrimaria;
                encontrou = true;
            }
        }
        if (!encontrou){
            setEquipePrimaria(JOptionPane.showInputDialog(null, String.format("Você digitou \"%s\". Equipe Primária do %s não é válida! Caso seu personagem não faça parte de uma EP, digite \"outro\"", equipePrimaria.toUpperCase(), nome.toUpperCase()), "Equipe Primária", JOptionPane.PLAIN_MESSAGE));
        }
    }
       
    @Override
    public String toString(){
        return nome.toUpperCase() + "\n\t" + ideal.toUpperCase() + "\n" + "Equipe Primaria: " + equipePrimaria + ".\n"; 
    }

    @Override
    public int compareTo(Personagem obj) {
        return this.nome.compareTo(obj.nome);
    }

}
