package pl.javastart.Metody.Konwerter;

public class MetricSystem {
   // double mm;
   // double cm;
 //   double m;


double mm2cm(double mm){
    double result = mm/10;
    System.out.println("mm na cm " + result);
    return result;
}

double m2mm(double m) {
    double result = m*1000;
    System.out.println("metry na mm " + result);
    return result;
}

double cm2m(double cm ){
    double result = cm/100;
    System.out.println("cm na metry " + result);
    return result;


}

double mm2m(double mm){
    double result = mm/1000;
    System.out.println("mm na metry " + result);
    return result;

}
}



