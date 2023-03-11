import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
    //zad_1();
    //zad_2();
    //zad_3();
    //zad_4();
    //zad_5();
    //zad_6();
    //zad_7();
    //zad_8();
    zad_12();
    }
    public static void zad_1(){
    float aRectangleSide = 0;
    float bRectangleSide = 0;
        Scanner scan = new Scanner(System.in);
        aRectangleSide = scan.nextFloat();
        bRectangleSide = scan.nextFloat();
        System.out.println(aRectangleSide*bRectangleSide);
    }
    public static void zad_2(){
    double squareRootOfPi =  Math.sqrt(Math.PI);
    System.out.println(new DecimalFormat("#.##").format(squareRootOfPi));
    }

    public static void zad_3(){
    Scanner scanner = new Scanner(System.in);
    String twoString;
    twoString = scanner.nextLine();
    String[] splitString = twoString.split(" ",2);;
     System.out.println("%"+splitString[1]+" "+splitString[0]+"%");


    }

    public static void zad_4(){
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if(a <= 0 || b <=0 || c <= 0 ) {
            System.out.println("BŁĄD");
        }
        else {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    public static void zad_5() {
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();

        int days;
        String name;
        switch (month) {
            case 1:
                days = 31;
                name = "Styczeń";
                break;
            case 2:
                days = 28;
                name = "Luty";
                break;
            case 3:
                days = 31;
                name = "Marzec";
                break;
            case 4:
                days = 30;
                name = "Kwiecień";
                break;
            case 5:
                days = 31;
                name = "Maj";
                break;
            case 6:
                days = 30;
                name = "Czerwiec";
                break;
            case 7:
                days = 31;
                name = "Lipiec";
                break;
            case 8:
                days = 31;
                name = "Sierpień";
                break;
            case 9:
                days = 30;
                name = "Wrzesień";
                break;
            case 10:
                days = 31;
                name = "Październik";
                break;
            case 11:
                days = 30;
                name = "Listopad";
                break;
            case 12:
                days = 31;
                name = "Grudzień";
                break;
            default:
                System.out.println("BŁĄD");
                return;

        }
        System.out.printf( name+" "+days);
    }
    public static void zad_6(){
        Scanner scanner = new Scanner(System.in);
        float a,b,c,temp;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
       if (a>b){temp = a;
                a = b;
                b = temp;
       }

        if (b>c){temp = b;
            b = c;
            c = temp;}

        if (a>c){temp = a;
            a = c;
            c = temp;}
    System.out.println(a + " " + b +" "+ c );
        System.out.println(c + " " + b +" "+ a );
    }

    public static void zad_7(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD");
            return;
        }
        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = input.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("B[%d] = ", i);
            B[i] = input.nextInt();
        }

        int scalarProduct = 0;
        int minSize = Math.min(n, m);
        for (int i = 0; i < minSize; i++) {
            scalarProduct += A[i] * B[i];
        }

        System.out.println(scalarProduct);



    }
  public static void zad_8(){

      Scanner input = new Scanner(System.in);

      int n;
      do {

          n = input.nextInt();
      } while (n <= 0);


      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }


      for (int i = 1; i <= n; i++) {
          for (int j = n; j >= i; j--) {
              System.out.print("*");
          }
          System.out.println();
      }


      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i - 1; j++) {
              System.out.print(" ");
          }
          for (int j = n; j >= i; j--) {
              System.out.print("*");
          }
          System.out.println();
      }


      for (int i = 1; i <= n; i++) {
          for (int j = n; j >= i+1 ; j--) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }


  }
    public static void zad_9(){
        Scanner scanner = new Scanner(System.in);
        char[] word = new char[100];
        int length = 0;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (length >= 100) {
                    System.out.println("BŁĄD");
                    return;
                }
                char c = line.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    word[length] = c;
                    length++;
                } else if (c == '\n') {
                    break;
                }
            }
        }

        for (int i = 0; i < length / 2; i++) {
            if (word[i] != word[length - i - 1]) {
                System.out.println("NIE");
                return;

            }
        }
        System.out.println("TAK");

    }
        public static void zad_10(){



        }

        public static void zad_11(){

            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            boolean[] alphabetFlags = new boolean[26]; // tablica flag dla liter alfabetu
            for(int i = 0;i < 25;i++){
                alphabetFlags[i]= false;

            }



            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) { // sprawdzenie, czy znak to litera
                    int index = Character.toLowerCase(c) - 'a'; // indeks litery w tablicy
                    alphabetFlags[index] = true; // ustawienie flagi dla litery
                }
            }

            for (boolean flag : alphabetFlags) {
                if (!flag) { // jeśli flaga dla litery jest fałszywa, to znaczy, że litera nie wystąpiła w tekście
                    System.out.println("NIE");
                    return;
                }
            }

            System.out.println("TAK");
        }

        public static void zad_12(){
        Scanner scanner = new Scanner(System.in);

        long seconds = scanner.nextLong();
          
        String planet = scanner.next();
            HashMap<String, Double> planetOrbits = new HashMap<>();
            planetOrbits.put("Merkury", 0.2408467);
            planetOrbits.put("Wenus", 0.61519726);
            planetOrbits.put("Ziemia", 1.0);
            planetOrbits.put("Mars", 1.8808158);
            planetOrbits.put("Jowisz", 11.862615);
            planetOrbits.put("Saturn", 29.447498);
            planetOrbits.put("Uran", 84.016846);
            planetOrbits.put("Neptun", 164.79132);
            double earthYearSeconds = 31557600;
            double age = seconds / earthYearSeconds;
            if (planetOrbits.containsKey(planet)) {

                System.out.println(new DecimalFormat("#.##").format(age /= planetOrbits.get(planet)));
            } else {
                System.out.println("Błąd");

            }

        }

    public static int getMax(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        } else {
            int max = getMax(tab, n - 1);
            return Math.max(max,tab[n - 1]);
        }
    }

}





















