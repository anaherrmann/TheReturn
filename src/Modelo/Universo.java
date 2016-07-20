package Modelo;

import Enums.NomeUniverso;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Universo implements Comparable<Universo>{
    
    Scanner input = new Scanner(System.in);
     
    private String nome;
    private TreeSet<String> criador;
    private int anoCriacao;
    
    /**
     *
     * @param nome está incluso um dos itens da enum NomeUniverso: DC, Marvel
     * @param criador lista com o(s) criador(es) do objeto de Universo
     * @param anoCriacao ano de criação do objeto Universo
     */
    public Universo(String nome, TreeSet<String> criador, int anoCriacao) {
        setNome(nome);
        this.anoCriacao = anoCriacao;
        this.criador = new TreeSet<>(criador);
    }

    public Universo() {
        this(null, new TreeSet<>(), 0);
    }

    public String getNome() {
        return nome;
    }
    
    /**
     * 
     * @param nome deve estar declarado em {@link NomeUniverso} 
     */

    public void setNome(String nome) {
        boolean encontrou = false;
        for (NomeUniverso iterator : NomeUniverso.values()) {
            if (nome.equalsIgnoreCase(iterator.toString())){
                this.nome = nome;
                encontrou = true;
            }
        }
        if (!encontrou){
            setNome(JOptionPane.showInputDialog(null, String.format("Você digitou \"%s\". Nome inválido! É aceito somente Marvel ou DC. Digite novamente!", nome), "Universo", JOptionPane.PLAIN_MESSAGE));
        }
    }

    public TreeSet<String> getCriador() {
        return criador;
    }


    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
    
    @Override
    public String toString(){
        String universo = "";
        universo += "UNIVERSO " + nome.toUpperCase() + "\n" + "Criador(es): ";
        for (Iterator<String> iterator = criador.iterator(); iterator.hasNext();) {
             universo += "\n\t" + iterator.next();
        }
        universo += "\nAno de criação do universo: " + anoCriacao + ".\n";
        return universo;
    }

    @Override
    public int compareTo(Universo obj) {
        return (getNome().compareTo(obj.getNome()));
    }

}
