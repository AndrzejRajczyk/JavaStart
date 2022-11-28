package pl.javastart.Super;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Fruit {

    int weight;
    String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

     String getInfo() {
        String result = "Typ owocu: " + type + " Waga w gramach: " + weight;
        return result;
    }



}
