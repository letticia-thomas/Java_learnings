package SOLID;

public class Rectangle implements Shape{
    int len;
    int b;
    Rectangle(int len, int b){
        this.len = len;
        this.b = b;
    }
    @Override
    public double area() {
        return len*b;
    }
}
