package pl.javastart.Metody.PrzeciazenieMetod;

public class CalcTest {
    public static void main(String[] args) {
        int x =1;
        int y=2;
        int z=3;
        int a =4;

        Calculator calculator = new Calculator();
        calculator.add(x,y);
        calculator.add(x,y,z);
        calculator.add(x,y,z,a);
        calculator.substract(x,y);
        calculator.substract(x,y,z);
        calculator.substract(x,y,z,a);
    }
}
