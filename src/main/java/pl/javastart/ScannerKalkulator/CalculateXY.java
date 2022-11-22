package pl.javastart.ScannerKalkulator;

public class CalculateXY {
    public double calculate (double x,double y,String dzialanie){
        double result = 0;
        switch (dzialanie){
            case "*":
                result= x*y;
                break;
            case "/":
                result=x/y;
                break;
            case "+":
                result =x+y;
                break;
            case"-":
                result = x-y;
                break;
            default:
                System.out.println("Musisz wybrać + - / lub *");
             return result;


        }
        System.out.println("Wybnik to: "+ result);
        return result;

    }



}
