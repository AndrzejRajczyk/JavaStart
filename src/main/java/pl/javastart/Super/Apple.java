package pl.javastart.Super;

public class Apple extends Fruit {
    String appleType;
    public final static String FRUITTYPE = "Apple";

    public Apple(int weight,  String appleType) {
        super(weight, FRUITTYPE);
        this.appleType = appleType;
    }
    @Override
     String getInfo(){
        return super.getInfo() + " Nazwa Gatunku " + appleType + "\n";
    }



}