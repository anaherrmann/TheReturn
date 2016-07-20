package Enums;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 *
 */
public enum Ideal {

    Heroi {
        @Override
        public String toString() {
            return "heroi";
        }
    },
    Vilao {
        @Override
        public String toString() {
            return "vilao";
        }
    },
    AntiHeroi {
        @Override
        public String toString() {
            return "anti heroi";
        }
    };

}
