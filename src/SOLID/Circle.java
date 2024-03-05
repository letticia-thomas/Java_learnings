package SOLID;

public class Circle implements Shape {
    int radius;
    Circle(int radius){
        this.radius= radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
