public class Televisor {

    String  offOrOn ;


    Televisor (){
        offOrOn = "OFF";
    }


    void turnOn(){
    offOrOn = "ON";
    }

    void turnOff (){
    offOrOn = "OFF";
    }

    void ShowStatus(){
        System.out.println("TV is " + offOrOn);
    }

}
