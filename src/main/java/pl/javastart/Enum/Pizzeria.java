package pl.javastart.Enum;

import lombok.Getter;

import java.util.Scanner;

import static pl.javastart.Enum.Pizza.*;

@Getter
public class Pizzeria {
   static String choice;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz swoją pizze:\n");

        for (Pizza pizza: values() ){
            System.out.println(pizza);
        }
        choice = scanner.nextLine();



            Pizza pizza = valueOf(choice);

            System.out.println("Zamówiłeś pizzę : " + pizza.name());
        scanner.close();

    }


    }



