package testyProba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testyJednostkowe.zadanie.Basket;
import testyJednostkowe.zadanie.Item;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class BasketTest {

    HashMap <Integer, Item> orderedItemsT = new HashMap<>();
    Basket basket = new Basket(orderedItemsT);

    Item mydło = new Item ("mydło", 3.5);
    Item szampon = new Item ("szampon", 5.5);
    Item pasta = new Item ("pasta do zębów", 4.2);
    Item dezodorant = new Item ("dezodorant", 9.75);



    @Test
    void addItem2() {

        basket.addItem(1,mydło);
        basket.addItem(2,szampon);
        Assertions.assertFalse(orderedItemsT.isEmpty());
        System.out.println(orderedItemsT);

    }

    @Test
    void removeItem () {

        basket.addItem(1, szampon);
        basket.removeItem(1,szampon);
        Assertions.assertTrue(orderedItemsT.isEmpty());
    }

    @Test
    void showAllTest () {
        basket.addItem(1, mydło);
        basket.addItem(5, szampon);
        basket.showAll(orderedItemsT);
    }



//    @Test
//    void addItem1() {
//        Item mydło = new Item ("mydło", 3.5);
//        Item szampon = new Item ("szampon", 5.5);
//        basket.addItem(mydło);
//        basket.addItem(szampon);
//        Assertions.assertFalse(orderedItemsT.isEmpty());
//        System.out.println(orderedItemsT);
//
//    }
}