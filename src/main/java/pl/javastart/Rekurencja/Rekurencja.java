package pl.javastart.Rekurencja;

public class Rekurencja {

//warto dac typ double - slnia szybko wyczerpuje inta
    static int factorial(int y){
        int result = y;
        if (y>1){
            result = y * factorial(y - 1);
        }
        return result ;
    }

    public static void main(String[] args) {
        int x = 12;
        int result = factorial(x);
        System.out.println("silnia " + x + " wynosi: " + result);


    }
}
