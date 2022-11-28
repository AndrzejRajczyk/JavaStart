package pl.javastart.Super;

public class GroceryShop {

    public static void main(String[] args) {
        Apple apple1 = new Apple(100, "Makintosz");
        Apple apple2 = new Apple(80, "Ligol");
        Apple apple3 = new Apple(48, "Papierówka");


        System.out.println(apple3.getInfo()+" "+ apple2.getInfo()+ " " + apple1.getInfo());
    }

}
