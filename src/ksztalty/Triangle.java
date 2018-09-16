package ksztalty;

public class Triangle {
    String shape;
    double bokA;
    double bokB;
    double bokC;

    Triangle(double A, double B, double C){
        bokA = A;
        bokB = B;
        bokC = C;
        shape = "trójkąt";
    }

    double trianglePerimeter(){
        return this.bokA + this.bokB + this.bokC;
    }
}
