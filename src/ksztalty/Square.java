package ksztalty;
import java.lang.Math;

public class Square {
    String shape;
    double bokA;

    Square(double A){
        bokA = A;
        shape = "kwadrat";
    }

    double SquareArea (){
        return Math.pow(this.bokA, 2);
    }
}
