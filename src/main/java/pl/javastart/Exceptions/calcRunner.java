package pl.javastart.Exceptions;

import java.util.Scanner;

import static pl.javastart.Exceptions.Calculate.calculate;
import static pl.javastart.Exceptions.Calculator.*;

public class calcRunner {
     static double x;
     static double y;
     static String ope;
    public static void main(String[] args) {
        IntOut iO = new IntOut();
        Calculate calculate = new Calculate();


        System.out.println("Witaj \n ");

        System.out.println(FIRST+ "\n");
        iO.getNumber();
        x=iO.numberIn;

        System.out.println(ACTION+ "\n");
        iO.getOperator();
        ope= iO.op;

        System.out.println(SECOND+"\n");
        iO.getNumber();
        y=iO.numberIn;


        calculate(x,y,ope);









    }

}
