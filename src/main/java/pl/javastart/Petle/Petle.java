package pl.javastart.Petle;

import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
        int sum =0;
        int a;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Podaj ile liczb chcesz zsumować");
        a=scanner.nextInt();


        while (a > 0){
            System.out.println("Podaj liczbę, którą chcesz zsumować");
            sum=sum+ scanner.nextInt();
            a=a-1;
            System.out.println("Aktualna suma " + sum);
        }
       scanner.close();
    }


}
