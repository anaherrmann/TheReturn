package Modelo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Pessoa {

    private String nome;
    private TreeSet<String> criador;
    private int primeiraAparicao;
    private Personagem nomePersonagem;

    /**
     *
     * @param nome nome da pessoa a ser adicionada
     * @param criador lista com o(s) criador(es) do objeto de Pessoa
     * @param primeiraAparicao ano da primeira aparicao nas HQs ou Filmes
     * @param nomePersonagem personagem que o objeto de Pessoa representa
     */
    public Pessoa(String nome, TreeSet<String> criador, int primeiraAparicao, Personagem nomePersonagem) {
        this.nome = nome;
        this.criador = new TreeSet<>(criador);
        this.primeiraAparicao = primeiraAparicao;
        this.nomePersonagem = nomePersonagem;
    }

    public Pessoa() {
        this("", new TreeSet<>(), 0, new Personagem());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    public TreeSet<String> getCriador() {
        return criador;
    }

    public int getPrimeiraAparicao() {
        return primeiraAparicao;
    }

    public void setPrimeiraAparicao(int primeiraAparicao) {
        this.primeiraAparicao = primeiraAparicao;
    }

    public Personagem getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(Personagem nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    @Override
    public String toString() {
        String pessoa = "";
        pessoa += nomePersonagem.getNome().toUpperCase() + "\t" + nome.toUpperCase() + "\n" + "Criador(es): ";
        for (String string : criador) {
            pessoa += "\n\t" + string;
        }
        pessoa += "\nPrimeira Aparição: " + primeiraAparicao + ".\n";
        return pessoa;
    }
}
