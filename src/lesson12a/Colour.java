package lesson12a;

public enum Colour {
        HEART('♥'),
        DIAMOND('♦'),
        CLUB('♣'),
        SPADE('♠');

        final char symbol;

        Colour(char symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return String.valueOf(this.symbol);
        }
    }

