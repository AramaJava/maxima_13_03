package lessons.lesson12a.game.entities;

import lessons.lesson12a.game.interfaces.CardBJ;
import lessons.lesson12a.game.interfaces.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCardsImpl implements DeckOfCards {
    List<CardBJ> cardsOnDeck = new ArrayList<CardBJ>();

    public DeckOfCardsImpl() {

        cardsOnDeck.add(0, new CardBJImpl("2♣ - Двойка Треф", 2));
        cardsOnDeck.add(1, new CardBJImpl("2♥ - Двойка Черви", 2));
        cardsOnDeck.add(2, new CardBJImpl("2♦ - Двойка Буби", 2));
        cardsOnDeck.add(3, new CardBJImpl("2♠ - Двойка Пики", 2));
        cardsOnDeck.add(4, new CardBJImpl("3♣ - Тройка Треф", 3));
        cardsOnDeck.add(5, new CardBJImpl("3♥ - Тройка Черви", 3));
        cardsOnDeck.add(6, new CardBJImpl("3♦ - Тройка Буби", 3));
        cardsOnDeck.add(7, new CardBJImpl("3♠ - Тройка Пики", 3));
        cardsOnDeck.add(8, new CardBJImpl("4♣ - Четверка Треф", 4));
        cardsOnDeck.add(9, new CardBJImpl("4♥ - Четверка Черви", 4));
        cardsOnDeck.add(10, new CardBJImpl("4♦ - Четверка Буби", 4));
        cardsOnDeck.add(11, new CardBJImpl("4♠ - Четверка Пики", 4));
        cardsOnDeck.add(12, new CardBJImpl("5♣ - Пятерка Треф", 5));
        cardsOnDeck.add(13, new CardBJImpl("5♥ - Пятерка Черви", 5));
        cardsOnDeck.add(14, new CardBJImpl("5♦ - Пятерка Буби", 5));
        cardsOnDeck.add(15, new CardBJImpl("5♠ - Пятерка Пики", 5));
        cardsOnDeck.add(16, new CardBJImpl("6♣ - Шестерка Треф", 6));
        cardsOnDeck.add(17, new CardBJImpl("6♥ - Шестерка Черви", 6));
        cardsOnDeck.add(18, new CardBJImpl("6♦ - Шестерка Буби", 6));
        cardsOnDeck.add(19, new CardBJImpl("6♠ - Шестерка Пики", 6));
        cardsOnDeck.add(20, new CardBJImpl("7♣ - Семерка Треф", 7));
        cardsOnDeck.add(21, new CardBJImpl("7♥ - Семерка Черви", 7));
        cardsOnDeck.add(22, new CardBJImpl("7♦ - Семерка Буби", 7));
        cardsOnDeck.add(23, new CardBJImpl("7♠ - Семерка Пики", 7));
        cardsOnDeck.add(24, new CardBJImpl("8♣ - Восьмерка Треф", 8));
        cardsOnDeck.add(25, new CardBJImpl("8♥ - Восьмерка Черви", 8));
        cardsOnDeck.add(26, new CardBJImpl("8♦ - Восьмерка Буби", 8));
        cardsOnDeck.add(27, new CardBJImpl("8♠ - Восьмерка Пики", 8));
        cardsOnDeck.add(28, new CardBJImpl("9♣ - Девятка Треф", 9));
        cardsOnDeck.add(29, new CardBJImpl("9♥ - Девятка Черви", 9));
        cardsOnDeck.add(30, new CardBJImpl("9♦ - Девятка Буби", 9));
        cardsOnDeck.add(31, new CardBJImpl("9♠ - Девятка Пики", 9));
        cardsOnDeck.add(32, new CardBJImpl("10♣ - Десятка Треф", 10));
        cardsOnDeck.add(33, new CardBJImpl("10♥ - Десятка Черви", 10));
        cardsOnDeck.add(34, new CardBJImpl("10♦ - Десятка Буби", 10));
        cardsOnDeck.add(35, new CardBJImpl("10♠ - Десятка Пики", 10));
        cardsOnDeck.add(36, new CardBJImpl("В♣ - Валет Треф", 10));
        cardsOnDeck.add(37, new CardBJImpl("В♥ - Валет Черви", 10));
        cardsOnDeck.add(38, new CardBJImpl("В♦ - Валет Буби", 10));
        cardsOnDeck.add(39, new CardBJImpl("В♠ - Валет Пики", 10));
        cardsOnDeck.add(40, new CardBJImpl("Д♣ - Дама Треф", 10));
        cardsOnDeck.add(41, new CardBJImpl("Д♥ - Дама Черви", 10));
        cardsOnDeck.add(42, new CardBJImpl("Д♦ - Дама Буби", 10));
        cardsOnDeck.add(43, new CardBJImpl("Д♠ - Дама Пики", 10));
        cardsOnDeck.add(44, new CardBJImpl("К♣ - Кароль Треф", 10));
        cardsOnDeck.add(45, new CardBJImpl("К♥ - Кароль Черви", 10));
        cardsOnDeck.add(46, new CardBJImpl("К♦ - Кароль Буби", 10));
        cardsOnDeck.add(47, new CardBJImpl("К♠ - Кароль Пики", 10));
        cardsOnDeck.add(48, new CardBJImpl("Т♣ - Туз Треф", 11));
        cardsOnDeck.add(49, new CardBJImpl("Т♥ - Туз Черви", 11));
        cardsOnDeck.add(50, new CardBJImpl("Т♦ - Туз Буби", 11));
        cardsOnDeck.add(51, new CardBJImpl("Т♠ - Туз Пики", 11));
        Collections.shuffle(cardsOnDeck); // перетасовали колоду
    }

    @Override
    public CardBJ getCardFromDeck(int CardNum) {
        // в нашем случае количество колод в игре 1

        return cardsOnDeck.get(CardNum);
    }


}
