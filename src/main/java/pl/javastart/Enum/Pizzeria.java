package pl.javastart.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

import static pl.javastart.Enum.Pizza.*;

@Getter
@Setter
@NoArgsConstructor
public class Pizzeria {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Wybierz swoją pizze:\n");
            for (Pizza pizza: values() ){
                System.out.println(pizza);}


        String p = scanner.nextLine();
         p=p.toUpperCase();


        switch (p){
            case ("MARGARITHA"):
            break;
            case("CAPRICIOSA"):
            break;
            case("PROSCIUTTIO"):
            break;
            default:
                System.out.println("Wybierz swoją pizze:\n");
                for (Pizza pizza: values() ){
                    System.out.println(pizza);}
                p=scanner.nextLine();
                p=p.toUpperCase();
                break;

        }
            Pizza pizza = Pizza.valueOf(p);

            System.out.println("Zamówiłeś pizzę : " + pizza.name());
        scanner.close();

    }


    }



