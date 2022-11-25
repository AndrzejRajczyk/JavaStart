package pl.javastart.Algorytmy;

public class CalculatorRunner {

    public static void main(String[] args){
       Calculator calculator = new Calculator ();

        calculator.start();

       do {
           calculator.getNumbers();
       }
       while (calculator.sum<=100);
       calculator.end();
    }
}
