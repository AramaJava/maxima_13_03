package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCards;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    CardBJ[] cardsOnDeck = new CardBJ[52];
    CardBJ[] cardsOnHands = new CardBJ[52];


    public DeckOfCardsImpl() {
        cardsOnDeck[0] = new CardBJImpl("Двойка Треф", 2);
        cardsOnDeck[1] = new CardBJImpl("Двойка Черви", 2);
        cardsOnDeck[2] = new CardBJImpl("Двойка Буби", 2);
        cardsOnDeck[3] = new CardBJImpl("Двойка Пики", 2);

        cardsOnDeck[4] = new CardBJImpl("Тройка Треф", 3);
        cardsOnDeck[5] = new CardBJImpl("Тройка Черви", 3);
        cardsOnDeck[6] = new CardBJImpl("Тройка Буби", 3);
        cardsOnDeck[7] = new CardBJImpl("Тройка Пики", 3);

        cardsOnDeck[8] = new CardBJImpl("Четверка Треф", 4);
        cardsOnDeck[9] = new CardBJImpl("Четверка Черви", 4);
        cardsOnDeck[10] = new CardBJImpl("Четверка Буби", 4);
        cardsOnDeck[11] = new CardBJImpl("Четверка Пики", 4);

        cardsOnDeck[12] = new CardBJImpl("Пятерка Треф", 5);
        cardsOnDeck[13] = new CardBJImpl("Пятерка Черви", 5);
        cardsOnDeck[14] = new CardBJImpl("Пятерка Буби", 5);
        cardsOnDeck[15] = new CardBJImpl("Пятерка Пики", 5);

        cardsOnDeck[16] = new CardBJImpl("Шестерка Треф", 6);
        cardsOnDeck[17] = new CardBJImpl("Шестерка Черви", 6);
        cardsOnDeck[18] = new CardBJImpl("Шестерка Буби", 6);
        cardsOnDeck[19] = new CardBJImpl("Шестерка Пики", 6);

        cardsOnDeck[20] = new CardBJImpl("Семерка Треф", 7);
        cardsOnDeck[21] = new CardBJImpl("Семерка Черви", 7);
        cardsOnDeck[22] = new CardBJImpl("Семерка Буби", 7);
        cardsOnDeck[23] = new CardBJImpl("Семерка Пики", 7);

        cardsOnDeck[24] = new CardBJImpl("Восьмерка Треф", 8);
        cardsOnDeck[25] = new CardBJImpl("Восьмерка Черви", 8);
        cardsOnDeck[26] = new CardBJImpl("Восьмерка Буби", 8);
        cardsOnDeck[27] = new CardBJImpl("Восьмерка Пики", 8);

        cardsOnDeck[28] = new CardBJImpl("Девятка Треф", 9);
        cardsOnDeck[29] = new CardBJImpl("Девятка Черви", 9);
        cardsOnDeck[30] = new CardBJImpl("Девятка Буби", 9);
        cardsOnDeck[31] = new CardBJImpl("Девятка Пики", 9);

        cardsOnDeck[32] = new CardBJImpl("Десятка Треф", 10);
        cardsOnDeck[33] = new CardBJImpl("Десятка Черви", 10);
        cardsOnDeck[34] = new CardBJImpl("Десятка Буби", 10);
        cardsOnDeck[35] = new CardBJImpl("Десятка Пики", 10);

        cardsOnDeck[36] = new CardBJImpl("Валет Треф", 10);
        cardsOnDeck[37] = new CardBJImpl("Валет Черви", 10);
        cardsOnDeck[38] = new CardBJImpl("Валет Буби", 10);
        cardsOnDeck[39] = new CardBJImpl("Валет Пики", 10);

        cardsOnDeck[40] = new CardBJImpl("Дама Треф", 10);
        cardsOnDeck[41] = new CardBJImpl("Дама Черви", 10);
        cardsOnDeck[42] = new CardBJImpl("Дама Буби", 10);
        cardsOnDeck[43] = new CardBJImpl("Дама Пики", 10);

        cardsOnDeck[44] = new CardBJImpl("Кароль Треф", 10);
        cardsOnDeck[45] = new CardBJImpl("Кароль Черви", 10);
        cardsOnDeck[46] = new CardBJImpl("Кароль Буби", 10);
        cardsOnDeck[47] = new CardBJImpl("Кароль Пики", 10);

        cardsOnDeck[48] = new CardBJImpl("Туз Треф", 11);
        cardsOnDeck[49] = new CardBJImpl("Туз Черви", 11);
        cardsOnDeck[50] = new CardBJImpl("Туз Буби", 11);
        cardsOnDeck[51] = new CardBJImpl("Туз Пики", 11);
    }

    @Override
    public CardBJ getRandomCard() {
        // количество колод в игре нужно указать заранее, их может быть от 1 до 8 нужно выдавать уникальные карты, без повторов

        int randomIndex = ThreadLocalRandom.current().nextInt(0, cardsOnDeck.length - 1);
        return cardsOnDeck[randomIndex];
    }


}
