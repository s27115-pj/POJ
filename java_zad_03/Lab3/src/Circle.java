public class Circle {
    private double radius;
    private String color;

    public Circle(){
      this.color = "red";
      this.radius =  5.0;
    }
    public Circle(double radius){
        this.color = "blue";
        this.radius =  radius;
    }
    public Circle(double radius,String color){
        this.color = color;
        this.radius =  radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color= color;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return(Math.PI*Math.sqrt(radius));
    }

    @Override
    public String toString() {
        return ("Circle \n radius: "+radius+"\n color: "+color+"\n area :" + getArea());
    }
}
