package zad_02;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> teaType = new HashSet<>();
        System.out.println("HashSet:");
        teaType.add("early gray");
        teaType.add("Green Tea");
        teaType.add("Oolong Tea");
        teaType.add("White tea");
        teaType.add("Pu-erh");
        teaType.add("Yellow Tea");
        teaType.add("Herbai Tea");

        for (String i : teaType) {
            System.out.println(i);
        }


        String[] arr = new String[teaType.size()];
        teaType.toArray(arr);
        System.out.println("\nArray:");
        for (int i = 0 ; i < teaType.size(); i++) {
        System.out.println(arr[i]);
        }
    }
}
