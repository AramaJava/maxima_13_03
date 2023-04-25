package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    CardBJ[] cards = new CardBJ[52];

    public DeckOfCardsImpl() {

        cards[0] = new CardBJImpl("Двойка треф", 2);
        cards[1] = new CardBJImpl("Двойка черви", 2);
        cards[2] = new CardBJImpl("Двойка крести", 2);
        cards[3] = new CardBJImpl("Двойка буби", 2);

        cards[4] = new CardBJImpl("Тройка треф", 3);
        cards[5] = new CardBJImpl("Тройка черви", 3);
        cards[6] = new CardBJImpl("Тройка крести", 3);
        cards[7] = new CardBJImpl("Тройка буби", 3);

        cards[8] = new CardBJImpl("Четверка треф", 4);
        cards[9] = new CardBJImpl("Четверка черви", 4);
        cards[10] = new CardBJImpl("Четверка крести", 4);
        cards[11] = new CardBJImpl("Четверка буби", 4);

        cards[12] = new CardBJImpl("Пятерка треф", 5);
        cards[13] = new CardBJImpl("Пятерка черви", 5);
        cards[14] = new CardBJImpl("Пятерка крести", 5);
        cards[15] = new CardBJImpl("Пятерка буби", 5);

        cards[16] = new CardBJImpl("Шестерка треф", 6);
        cards[17] = new CardBJImpl("Шестерка черви", 6);
        cards[18] = new CardBJImpl("Шестерка крести", 6);
        cards[19] = new CardBJImpl("Шестерка буби", 6);

        cards[20] = new CardBJImpl("Семерка треф", 7);
        cards[21] = new CardBJImpl("Семерка черви", 7);
        cards[22] = new CardBJImpl("Семерка крести", 7);
        cards[23] = new CardBJImpl("Семерка буби", 7);

        cards[24] = new CardBJImpl("Восьмерка треф", 8);
        cards[25] = new CardBJImpl("Восьмерка черви", 8);
        cards[26] = new CardBJImpl("Восьмерка крести", 8);
        cards[27] = new CardBJImpl("Восьмерка буби", 8);

        cards[28] = new CardBJImpl("Девятка треф", 9);
        cards[29] = new CardBJImpl("Девятка черви", 9);
        cards[30] = new CardBJImpl("Девятка крести", 9);
        cards[31] = new CardBJImpl("Девятка буби", 9);

        cards[32] = new CardBJImpl("Десятка треф", 10);
        cards[33] = new CardBJImpl("Десятка черви", 10);
        cards[34] = new CardBJImpl("Десятка крести", 10);
        cards[35] = new CardBJImpl("Десятка буби", 10);

        cards[36] = new CardBJImpl("Валет треф", 11);
        cards[37] = new CardBJImpl("Валет черви", 2);
        cards[38] = new CardBJImpl("Валет крести", 2);
        cards[39] = new CardBJImpl("Валет буби", 2);

        cards[40] = new CardBJImpl("Дама треф", 2);
        cards[41] = new CardBJImpl("Дама черви", 2);
        cards[42] = new CardBJImpl("Дама крести", 2);
        cards[43] = new CardBJImpl("Дама буби", 2);

        cards[44] = new CardBJImpl("Кароль треф", 2);
        cards[45] = new CardBJImpl("Кароль черви", 2);
        cards[46] = new CardBJImpl("Кароль крести", 2);
        cards[47] = new CardBJImpl("Кароль буби", 2);

        cards[48] = new CardBJImpl("Туз треф", 2);
        cards[49] = new CardBJImpl("Туз черви", 2);
        cards[50] = new CardBJImpl("Туз крести", 2);
        cards[51] = new CardBJImpl("Туз буби", 2);

    }

    @Override
    public CardBJ getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0,51);
        return cards[randomIndex];
    }
}
