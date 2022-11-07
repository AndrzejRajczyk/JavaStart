package pl.javastart.Metody.Konwerter;

public class Calculatror {


    public static void main(String[] args) {
        double mm = 1234;
        double cm = 235;
        double m=22;
        double h = 3;
        double min = 124;
        double s= 123;


        MetricSystem metricSystem = new MetricSystem();
        metricSystem.mm2cm(mm);
        metricSystem.cm2m(cm);
        metricSystem.m2mm(m);
        metricSystem.mm2m(mm);


        Time time = new Time();
        time.h2m(h);
        time.m2s(min);
        time.s2milis(s);

    }


}

