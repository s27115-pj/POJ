public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10.5);
        Circle circle3 = new Circle(100,"green");
        Circle circle4 = new Circle();
        circle4.setRadius(1.1);
        circle4.setColor("pink");
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        System.out.println(circle4.toString());

    }

}
