import java.util.Scanner;

public class zad2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszy string: ");
        String pierwszyString = scanner.nextLine();

        System.out.print("Podaj drugi string: ");
        String drugiString = scanner.nextLine();

        if (pierwszyString.equals(drugiString)) {
            System.out.println("Stringi są takie same");
        } else {
            System.out.println("Stringi są różne");
        }
    }
}
