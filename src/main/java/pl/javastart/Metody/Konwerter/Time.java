package pl.javastart.Metody.Konwerter;

public class Time {

  //  double h;
    //double m;
    //double s;
    //double milis;


    double h2m(double h){
        double result = h*60;
        System.out.print(result);
        return result;
    }

    double m2s(double m){
        double result = m*60;
        System.out.print(result);
        return result;
    }

    double s2milis(double s){
        double result = s*1000;
        System.out.print(result);
        return result;
    }

}
