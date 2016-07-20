package Main;

import Enums.EquipePrimaria;
import Modelo.Alienigena;
import Modelo.Deus;
import Modelo.Filme;
import Modelo.HQ;
import Modelo.Humano;
import Modelo.MetaHumano;
import Modelo.Mutante;
import Modelo.Pessoa;
import Modelo.Seguidor;
import Modelo.Universo;
import java.util.TreeSet;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 */
public class Main {

    /**
     * Só será tratado NullPointerException nessa fase do projeto, pois somos
     * nós que estamos fazendo a inserção, na próxima etapa, onde um outro
     * usuário fará a inserção, trataremos outros tipos de exception
     */
    public static void DC() {

        /**
         * TreeSet<String> criador é a lista de criadores da DC
         */
        TreeSet<String> criador = new TreeSet<>();
        criador.add("Major Malcolm Wheeler-Nicholson");

        TreeSet<String> criadorBruceWayne = new TreeSet<>();
        criadorBruceWayne.add("Bill Finger");
        criadorBruceWayne.add("Bob Kane");

        TreeSet<String> criadorBarryAllen = new TreeSet<>();
        criadorBarryAllen.add("Gardner Fox");
        criadorBarryAllen.add("Carmine Infantino");
        criadorBarryAllen.add("Bob Kanigher");

        TreeSet<String> criadorWallyWest = new TreeSet<>();
        criadorWallyWest.add("John Broome");
        criadorWallyWest.add("Carmine Infantino");

        TreeSet<String> criadorClarkKent = new TreeSet<>();
        criadorClarkKent.add("Jerry Siegel");
        criadorClarkKent.add("Joe Shuster");

        TreeSet<String> habilidadesBatman = new TreeSet<>();
        habilidadesBatman.add("Intelecto genial");
        habilidadesBatman.add("Perito em artes-maciais");

        TreeSet<String> poderesFlash = new TreeSet<>();
        poderesFlash.add("Super velocidade");
        poderesFlash.add("Aerocinese");
        poderesFlash.add("Visao Camera Lenta enquanto corre");
        poderesFlash.add("Viagem Temporal");
        poderesFlash.add("Intangibilidade");
        poderesFlash.add("Fator de cura");
        poderesFlash.add("Reflexo sobrehumano");
        poderesFlash.add("Raciocínio super rápido");

        TreeSet<String> poderesSuperHomem = new TreeSet<>();
        poderesSuperHomem.add("Super Forca");
        poderesSuperHomem.add("Visao de Calor");
        poderesSuperHomem.add("Super Audicao");
        poderesSuperHomem.add("Sopro Congelante");
        poderesSuperHomem.add("Super Velocidade");
        poderesSuperHomem.add("Voo");
        poderesSuperHomem.add("Invulnerabilidade");

        try {
            Universo universoDC = new Universo("DC", criador, 1934);
            System.out.println(universoDC);
            Humano batman = new Humano(habilidadesBatman, "Batman", "Heroi", universoDC, "Liga da Justica");
            System.out.println(batman);
            System.out.println("=====================================");
            MetaHumano flash = new MetaHumano(poderesFlash, "Explosão no S.T.A.R Labs", "Flash", "Heroi", universoDC, "Liga da Justica");
            System.out.println(flash);
            System.out.println("=====================================");
            Alienigena superHomem = new Alienigena("Super Homem", "Kryptoniano", "Krypton", poderesSuperHomem, "Heroi", universoDC, "Liga da Justica");
            System.out.println(superHomem);
            System.out.println("=====================================");

            try {
                Pessoa bruceWayne = new Pessoa("Bruce Wayne", criadorBruceWayne, 1939, batman);
                Seguidor alfred = new Seguidor("Alfred", "Tutor", bruceWayne);
                HQ hqBatman = new HQ("A Piada Mortal", "Panini Books", 2004, bruceWayne);
                Filme filmeBatman = new Filme("O cavaleiro das trevas", 2008, bruceWayne);

                System.out.println(bruceWayne);
                System.out.println(hqBatman);
                System.out.println(filmeBatman);
                System.out.println("=====================================");

            } catch (NullPointerException exBruceWayne) {
                System.out.println("NullPointerException ao criar Bruce Wayne");
            }

            try {
                Pessoa barryAllen = new Pessoa("Barry Allen", criadorBarryAllen, 1997, flash);
                Seguidor irisAllen = new Seguidor("Iris Allen", "Esposa", barryAllen);
                Seguidor donAllen = new Seguidor("Don Allen", "Filho", barryAllen);
                HQ hqBarryAllen = new HQ("Crise das Muitas Terras", "Panini Books", 1985, barryAllen);

                System.out.println(barryAllen);
                System.out.println(irisAllen);
                System.out.println(donAllen);
                System.out.println(hqBarryAllen);
                System.out.println("=====================================");

            } catch (NullPointerException exBarryAllen) {
                System.out.println("NullPointerException ao criar Barry Allen");
            }

            try {
                Pessoa wallyWest = new Pessoa("Wally West", criadorWallyWest, 1959, flash);
                Seguidor lindaPark = new Seguidor("Linda Park", "Esposa", wallyWest);

                System.out.println(wallyWest);
                System.out.println(lindaPark);
                System.out.println("=====================================");
            } catch (NullPointerException exWallyWest) {
                System.out.println("NullPointerException ao criar Wally West");
            }

            try {
                Pessoa clarkKent = new Pessoa("Clark Kent", criadorClarkKent, 1938, superHomem);

                System.out.println(clarkKent);
                System.out.println("=====================================");
            } catch (NullPointerException exClarkKent) {
                System.out.println("NullPointerException ao criar Clark Kent");
            }
        } catch (Exception exDC) {
            System.out.println("Exception Geral DC");
        }
    }

    public static void Marvel() {

        /**
         * TreeSet<String> criador lista de criadores da Marvel
         */
        TreeSet<String> criador = new TreeSet<>();
        criador.add("Martin Goodman");

        TreeSet<String> criadorThor = new TreeSet<>();
        criadorThor.add("Stan Lee");
        criadorThor.add("Larry Lieber");
        criadorThor.add("Jack Kirby");

        TreeSet<String> criadorTonyStark = new TreeSet<>();
        criadorTonyStark.add("Stan Lee");
        criadorTonyStark.add("Larry Lieber");
        criadorTonyStark.add("Don Heck");

        TreeSet<String> criadorJeanGrey = new TreeSet<>();
        criadorJeanGrey.add("Stan Lee");
        criadorJeanGrey.add("Jack Kirby");

        TreeSet<String> poderesJeanGrey = new TreeSet<>();
        poderesJeanGrey.add("Telecinese");
        poderesJeanGrey.add("Telepatia");
        poderesJeanGrey.add("Pirocinese");
        poderesJeanGrey.add("Rajadas Psonicas");
        poderesJeanGrey.add("Manipulacao Temporal");
        poderesJeanGrey.add("Poder cosmico descomunal");
        poderesJeanGrey.add("Ressurreicao");

        TreeSet<String> poderesThor = new TreeSet<>();
        poderesThor.add("Voo");
        poderesThor.add("Super Forca");
        poderesThor.add("Velocidade sobre-humana");
        poderesThor.add("Agilidade sobre-humana");
        poderesThor.add("Geracoes de raios");
        poderesThor.add("Imortalidade");
        poderesThor.add("Longevidade");
        poderesThor.add("Resistencia sobre-humana");
        poderesThor.add("Manipulacao do tempo");
        poderesThor.add("Manipulacao Magica");
        poderesThor.add("Teletransporte Dimensional");

        try {
            Universo universoMarvel = new Universo("Marvel", criador, 1930);
            System.out.println(universoMarvel);
            Humano homemFerro = new Humano(criadorTonyStark, "Homem de Ferro", "Heroi", universoMarvel, "Vingadores");
            System.out.println(homemFerro);
            Deus thor = new Deus("Deus", "Asgard", poderesThor, "Thor", "Heroi", universoMarvel, "Vingadores");
            System.out.println(thor);
            Mutante fenix = new Mutante(poderesJeanGrey, "Fenix - Jean Grey", "Heroi", universoMarvel, "X-Men");
            System.out.println(fenix);
            try {
                Pessoa tonyStark = new Pessoa("Tony Stark", criadorTonyStark, 1963, homemFerro);

                System.out.println(tonyStark);
                System.out.println("=====================================");
            } catch (NullPointerException exTonyStark) {
                System.out.println("NullPointerException ao criar Tony Stark");
            }
            try {
                Pessoa thorOdison = new Pessoa("Thor Odison", criadorThor, 1962, thor);

                System.out.println(thorOdison);
                System.out.println("=====================================");
            } catch (NullPointerException exThor) {
                System.out.println("NullPointerException ao criar Thor Odison");
            }
            try {
                Pessoa jeanGrey = new Pessoa("Jean Grey", criadorJeanGrey, 1963, fenix);

                System.out.println(jeanGrey);
                System.out.println("=====================================");
            } catch (NullPointerException exJeanGrey) {
                System.out.println("NullPointerException ao criar Jean Grey");
            }

        } catch (NullPointerException exGeral) {
            System.out.println("NullPointerException Geral Marvel");
        }
    }

    public static void main(String[] args) {

        try {
            DC();
            System.out.println("=====================================");
            System.out.println("=====================================");
            Marvel();
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
