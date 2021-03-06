package shapes;

public class Circle {
    private Double radius;


    public Circle(double radius){
        radius = this.radius;
    };

    public double getArea(){
        return Math.PI * (Math.pow(this.radius, 2));
    };
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    };

}
