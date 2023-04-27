public class Cylinder extends Circle{
    private double height = 4.0;

    public Cylinder() {

    }


    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius){
        super(radius);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return(super.getArea()*height);
    }


}
