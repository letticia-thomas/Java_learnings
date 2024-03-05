package SOLID;

import java.util.ArrayList;
import java.util.List;

public class main {
   public static void main(String[] args){
    List<Shape> shapes = new ArrayList<Shape>();
    Shape c = new Circle(3);
    Shape r = new Rectangle(2,3);
    shapes.add(c);
    shapes.add(r);
    AreaCalculator calc = new AreaCalculator();
    double sum = calc.findArea(shapes);
    System.out.println("Calculated sum:"+sum);
   }
}
