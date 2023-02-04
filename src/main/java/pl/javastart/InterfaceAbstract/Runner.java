package pl.javastart.InterfaceAbstract;

import java.awt.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wejscie wejscie = new Wejscie();
        double x;
        double y;
        double z;
        int s=0;

        while (s<=0|| s>3){
            System.out.println("Podaj rodzaj figury:\n 1 Kwadrat \n 2 Trójkąt \n 3 Koło \n");
        s = (int)wejscie.pobierz();

        switch (s) {
            case 1:
                System.out.println("Podaj wymiary prostokąta");
                System.out.println("Długość Pierwszego boku to :");
                x = wejscie.pobierz();
                System.out.println("Długość Drugiego boku to :");
                y = wejscie.pobierz();
                Rectangle rectangle = new Rectangle(x, y);
                rectangle.calculateArea();
                rectangle.callculatePerimeter();
                System.out.println("\n");
                s=0;
                break;
            case 2:

                System.out.println("Podaj wymiary trójkąta");
                System.out.println("Długość podstawy to :");
                x = wejscie.pobierz();
                System.out.println("Długość pierwszego boku to :");
                y = wejscie.pobierz();
                System.out.println("Długość drugiego  boku:");
                z = wejscie.pobierz();
                Triangle triangle = new Triangle(x, y, z);
                triangle.calculateArea();
                triangle.callculatePerimeter();
                System.out.println("\n");
                s=0;
                break;
            case 3:
                System.out.println("Podaj promień koła");
                x = wejscie.pobierz();
                Circle circle = new Circle(x);
                circle.calculateArea();
                circle.callculatePerimeter();
                System.out.println("\n");
                s=0;
                break;
            default:
                System.out.println("Wybierz poprawnie swoją figurę");
                System.out.println("Podaj rodzaj figury:\n 1 Kwadrat \n 2 Trójkąt \n 3 Koło \n");
                s = (int)wejscie.pobierz();
                break;
        }










        }


    }
}
