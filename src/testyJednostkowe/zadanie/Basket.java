package testyJednostkowe.zadanie;

import java.util.HashMap;
import java.util.Map;

public class Basket {


Map <Integer, Item> orderedItems;

    public Basket (HashMap <Integer, Item> orderedItems) {
    this.orderedItems = orderedItems;
    }

    public void addItem (int id, Item item) {

    orderedItems.put(id,item);

}

    public void removeItem (int id, Item item) {
        orderedItems.remove(id, item);
    }

    public void showAll (Map orderedItems) {

        System.out.println(orderedItems.entrySet());

    }



//public void addItem (Item item) {
//
//    Integer position = 1;
//    orderedItems.put(position,item);
//    position ++;
//
//}



}
