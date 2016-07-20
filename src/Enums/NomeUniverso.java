package Enums;

/**
 *
 * @author Ana Luiza Herrmann
 * @author Leticia Torres
 *
 */
public enum NomeUniverso {

    DC {
        @Override
        public String toString() {
            return "DC";
        }
    },
    Marvel {
        @Override
        public String toString() {
            return "Marvel";
        }
    };
}
