package ksztalty;
import java.lang.Math;


public class ShapeCalculator {

    double squareArea(Square square){
        return square.bokA * square.bokA;
    }

    double circleArea(Circle cirle){
        return 3.14*Math.pow(cirle.promien, 2);
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.bokA + triangle.bokB + triangle.bokC;
    }

    double rectPerimeter(Rectangle rectangle){
        return (rectangle.bokA + rectangle.bokB ) * 2.0;
    }
}
