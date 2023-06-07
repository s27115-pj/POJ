package zad_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad_04 {
    public static void main(String[] args) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "Styczeń");
        months.put(2, "Luty");
        months.put(3, "Marzec");
        months.put(4, "Kwiecień");
        months.put(5, "Maj");
        months.put(6, "Czerwiec");
        months.put(7, "Lipiec");
        months.put(8, "Sierpień");
        months.put(9, "Wrzesień");
        months.put(10, "Październik");
        months.put(11, "Listopad");
        months.put(12, "Grudzień");

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Podaj numer miesiąca (1-12): ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                if (number >= 1 && number <= 12) {
                    validInput = true;
                } else {
                    System.out.println("Podano niewłaściwy numer miesiąca. Spróbuj ponownie.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format danych. Spróbuj ponownie.");
            }
        }

        String monthName = months.get(number);
        System.out.println("Miesiąc o numerze " + number + " to " + monthName + ".");
    }
}