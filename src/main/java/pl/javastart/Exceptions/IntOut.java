package pl.javastart.Exceptions;

import java.util.Scanner;



public class IntOut extends MismashOperatorException {
    private static final String message = "Witaj";
    public double numberIn;

    String op;
    Scanner sc1 = new Scanner(System.in);



    public IntOut() {
        super(message);
    }




    double getNumber(){
       int check=0;

        numberIn= sc1.nextDouble();


       if(check==0){ //L    EPIEJ BOOLEAN
        try{
            String s = new Double(numberIn).toString();
            Double.parseDouble(s);
            return check=1;
        }
        catch(NumberFormatException nfe){
            System.out.println("Podaj liczbę");
            sc1.nextLine();
            return check=0;
        }

       }

        return numberIn;
    }
    String getOperator(){

        op = sc1.next();
        sc1.nextLine();
        return op;


    }

}
