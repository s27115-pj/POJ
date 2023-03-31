public class zad2_5 {
    private int x;
    private int y;
    private boolean z;

    public zad2_5(int x, int y, boolean z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void incrementX() {
        System.out.println("Operator inkrementacji:");
        System.out.println("x przed inkrementacją: " + x);
        x++;
        System.out.println("x po inkrementacji: " + x);
    }

    public void decrementY() {
        System.out.println("\nOperator dekrementacji:");
        System.out.println("y przed dekrementacją: " + y);
        y--;
        System.out.println("y po dekrementacji: " + y);
    }

    public void arithmeticOperators() {
        System.out.println("\nOperatory arytmetyczne:");
        int suma = x + y;
        int roznica = y - x;
        int iloczyn = x * y;
        int iloraz = y / x;
        int reszta = y % x;
        System.out.println("x + y = " + suma);
        System.out.println("y - x = " + roznica);
        System.out.println("x * y = " + iloczyn);
        System.out.println("y / x = " + iloraz);
        System.out.println("y % x = " + reszta);
    }

    public void relationalOperators() {
        System.out.println("\nOperatory relacyjne:");
        System.out.println("x < y: " + (x < y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
    }

    public void negationOperator() {
        System.out.println("\nOperator negacji:");
        System.out.println("z: " + z);
        System.out.println("!z: " + !z);
    }

    public static void main(String[] args) {
        zad2_5 demo = new zad2_5(5, 10, true);
        demo.incrementX();
        demo.decrementY();
        demo.arithmeticOperators();
        demo.relationalOperators();
        demo.negationOperator();
    }
}
