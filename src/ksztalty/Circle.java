package ksztalty;

public class Circle {
    String shape;
    double promien;

    Circle(double p){
        promien = p;
        shape = "koło";
    }

    double circleArea(){
        return 3.14*Math.pow(this.promien, 2);
    }
}
