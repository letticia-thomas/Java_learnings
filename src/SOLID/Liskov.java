package SOLID;

public class Liskov {
    public static void main(String[] args){
    Rectangles r = new Rectangles(2, 3);
    Square s = new Square(3);
    Shape[] shapes = {s,r};
    for(Shape shape: shapes){
        System.out.println(shape.area());
    }
    }
}

