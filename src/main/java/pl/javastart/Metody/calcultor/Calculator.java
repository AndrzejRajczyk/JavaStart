package pl.javastart.Metody.calcultor;

public class Calculator {
    double x;
    double y;

    double addXY (double x, double y){
        double result = x=y;
        System.out.println(result);
        return result;
    }
    double substract (double x, double y){
        double result =x-y;
        System.out.println(result);
        return result;
    }

    double multily (double x, double y){
        double result = x*y;
        System.out.println(result);
        return result;
    }

    double divide (double x, double y){
      double result = 0;
        if (y != 0) {
            double result1 = x/y;
            result=result1;
            
        }
        if(y==0){
            System.out.println("bład nie dziel przez 0");
            double result2 =  0;
            result=result2;
        }
        System.out.println(result);
        return result;
    }

}
