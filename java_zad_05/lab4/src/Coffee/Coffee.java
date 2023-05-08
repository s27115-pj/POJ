package Coffee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coffee {
    public static void main(String[] args) {
        List<String> coffees = new ArrayList<>();
        coffees.add("espresso");
        coffees.add("latte");
        coffees.add("cappuccino");
        coffees.add("mocha");
        coffees.add("auLait");
        coffees.add("macchiato");

        // wypisz nazwy kaw z użyciem iteratora
        Iterator<String> iterator = coffees.iterator();
        while (iterator.hasNext()) {
            String coffee = iterator.next();
            System.out.println(coffee);
        }

        // wypisz nazwy kaw dużymi literami z użyciem pętli foreach
        for (String coffee : coffees) {
            System.out.println(coffee.toUpperCase());
        }

        // wypisz pierwsze 4 litery z każdej nazwy kawy z użyciem pętli for
        for (String coffee : coffees) {
            for (int i = 0; i < 4 && i < coffee.length(); i++) {
                System.out.print(coffee.charAt(i));
            }
            System.out.println();
        }
    }
}
