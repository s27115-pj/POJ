import java.util.Scanner;

class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class zad2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień podstawy walca: ");
        double radius = scanner.nextDouble();
        System.out.print("Podaj wysokość walca: ");
        double height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        double volume = cylinder.getVolume();

        System.out.println(volume);
    }
}