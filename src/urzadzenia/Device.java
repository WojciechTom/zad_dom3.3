package urzadzenia;

public class Device {
    String code;
    String producer;
    String typ;
    double price;

    Device (String code, String producer, String typ, double price){
        this(code, producer, typ);
        this.price = price;
    }

    Device (String code, String producer, String typ){
        this.code = code;
        this.producer = producer;
        this.typ = typ;
    }

    String getInfo (){
        return (" KOD: " + this.code + ", producent: " + this.producer + ", typ: " + this.typ + ", cena: " + this.price);
    }

}
