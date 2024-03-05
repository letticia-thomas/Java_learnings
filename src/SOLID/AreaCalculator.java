package SOLID;

import java.util.List;

public class AreaCalculator {
    public double findArea(List<Shape> shapes){
        double sum =0;
        for(Shape shape: shapes)
        {
            sum+=shape.area();
        }
        return sum;
    }
}
