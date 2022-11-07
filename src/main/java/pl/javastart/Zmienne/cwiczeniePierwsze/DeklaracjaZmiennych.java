package pl.javastart.Zmienne.cwiczeniePierwsze;

public class DeklaracjaZmiennych {
    static String marka;
   static String model;
   static int rocznik;
   static double price;

    public static void main(String[] args) {
        marka = "opel ";
        model = "kadet ";
        rocznik = 1990;
        price = 2500.90;

        System.out.println(marka + model + rocznik+ " " + price);

    }
}
