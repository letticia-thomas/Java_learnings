package SOLID;

public class Rectangles implements Shape {
    int len;
    int b;
    Rectangles(int len, int b){
        this.len = len;
        this.b = b;
    }
    @Override
    public double area() {
       return len*b;
    }
}
