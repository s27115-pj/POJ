package zad_03;


import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // a. Tworzenie drzewa TreeSet tree1
        TreeSet<String> tree1 = new TreeSet<>();

        // b. Dodawanie pięciu nazw kolorów do drzewa tree1
        tree1.add("Czerwony");
        tree1.add("Zielony");
        tree1.add("Niebieski");
        tree1.add("Żółty");
        tree1.add("Pomarańczowy");

        // Wypisanie elementów drzewa tree1
        System.out.println("Elementy drzewa tree1:");
        for (String color : tree1) {
            System.out.println(color);
        }

        // c. Tworzenie drzewa TreeSet tree2
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Biały");
        tree2.add("Różowy");
        tree2.add("Fioletowy");

        // Wypisanie elementów drzewa tree2
        System.out.println("\nElementy drzewa tree2:");
        for (String color : tree2) {
            System.out.println(color);
        }

        // Dodawanie wszystkich elementów drzewa tree2 do tree1
        tree1.addAll(tree2);

        // Wypisanie elementów drzewa tree1 po dodaniu elementów z tree2
        System.out.println("\nElementy drzewa tree1 po dodaniu elementów z tree2:");
        for (String color : tree1) {
            System.out.println(color);
        }

        // d. Wypisanie elementów drzewa tree1 w odwrotnej kolejności
        System.out.println("\nElementy drzewa tree1 w odwrotnej kolejności:");
        Iterator<String> descendingIterator = tree1.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // e. Wypisanie pierwszego i ostatniego elementu drzewa tree1
        String firstElement = tree1.first();
        String lastElement = tree1.last();
        System.out.println("\nPierwszy element drzewa tree1: " + firstElement);
        System.out.println("Ostatni element drzewa tree1: " + lastElement);

        // f. Klonowanie drzewa tree1 do tree3
        TreeSet<String> tree3 = (TreeSet<String>) tree1.clone();

        // g. Wypisanie liczby elementów w drzewie tree1
        System.out.println("\nLiczba elementów w drzewie tree1: " + tree1.size());

        // h. Porównywanie dwóch drzew binarnych tree1 i tree3
        boolean areEqual = tree1.equals(tree3);
        System.out.println("Czy drzewa tree1 i tree3 są równe? " + areEqual);
    }


    }
