package pl.javastart.Exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

import static pl.javastart.Exceptions.Calculator.*;

@Getter
@Setter
public class Calculate extends Exception {

    static double calculate(double x, double y, String operator ) {
       double result =0;
        switch (operator) {
            case PLUS:
                 result = x + y;
            break;
            case MINUS:
                 result = x - y;
            break;
            case MULTIPLY:
                 result = x * y;
            break;
            case DIVIDE:
                if (y == 0)
                    throw new ArithmeticException("Dzielenie przez zero jest zabronione");
                     result = 0;
                break;
                default:
                    if(operator!=PLUS || operator!=MINUS || operator!=MULTIPLY|| operator!=DIVIDE|| operator==null )
                throw new MismashOperatorException("Podany niewłasciwy  rodzaj działania: +, -, /, * ");
        }
        System.out.println("Wynik: " + result);
        return result;


    }
}
