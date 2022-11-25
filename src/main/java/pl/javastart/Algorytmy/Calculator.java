package pl.javastart.Algorytmy;

import java.util.Scanner;

public class Calculator {
    public static int sum = 0;
    public static boolean czyParzysta;
    Scanner scanner = new Scanner(System.in);


    void start() {
        System.out.println("Witaj w programie sumujemy liczby które podasz. \n Suma liczb nie może przekroczyc 100\n " +
                "każda licznba musi być z przedziału 0-99");
    }

    int getNumbers() {
        System.out.println("Podaj liczbę do zsumowania");
        sum += scanner.nextInt();
        if (sum % 2 == 0) {
            System.out.println("Aktualna suma to:" + sum + " i jest parzysta");
            czyParzysta = true;
            return sum;
        } else {
            System.out.println("Aktualna suma to:" + sum + " i nie jest parzysta");
            czyParzysta = false;
            return sum;
        }


    }


    public void end() {
        System.out.println("\n Dziękuję za współpracę do zobaczenia");
        scanner.close();
    }
}
