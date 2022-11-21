package pl.javastart.ScannerKalkulator;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {

      CalculateXY calculateXY = new CalculateXY()    ;


     Scanner scanner = new Scanner(System.in);
     scanner.useLocale(Locale.FRANCE);
     System.out.println("Podaj pierwszą liczbę: ");
     double x = scanner.nextDouble();
     scanner.nextLine();
     System.out.println("Podaj drugą  liczbę: ");
     double y = scanner.nextDouble();
     scanner.nextLine();
     System.out.println("Podaj działanie: ")  ;
     String dzialanie = scanner.next();
     scanner.nextLine();
     scanner.close();


      calculateXY.calculate(x,y,dzialanie) ;

     







}
}
