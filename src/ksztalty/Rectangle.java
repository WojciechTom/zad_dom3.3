package ksztalty;

public class Rectangle {
    String shape;
    double bokA;
    double bokB;


    Rectangle(double A, double B){
        bokA = A;
        bokB = B;
        shape = "prostokąt";
    }

    double rectPerimeter(){
        return (this.bokA + this.bokB ) * 2.0;
    }
}
