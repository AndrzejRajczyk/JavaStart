package pl.javastart.Dziedziczenie;

public class Test {
    public static void main(String[] args) {
       Tire tire1= new Tire();
       tire1.setSize(21);
       tire1.setHeight(20);
       tire1.setModel("Winter");
       tire1.setProducerName("Continental");
       tire1.setSeries(100020340);

       Tire tire2= new Tire();
       tire2.setSize(19);
       tire2.setHeight(28);
       tire2.setModel("Spring");
       tire2.setProducerName("Kormoran");
       tire2.setSeries(1020340);

       ExhaustParts exhaustParts1 = new ExhaustParts();
       exhaustParts1.setModel("wydech1");
       exhaustParts1.setProducerName("Producent1");
       exhaustParts1.setEuropeanNormOfexhaustPollution(true);
       exhaustParts1.setSeries(100203478);

       // print all
       System.out.println(tire1.toString()+tire1.getProducerName()+tire1.getModel()+tire1.getSeries());
       System.out.println(tire2.toString());
       System.out.println(exhaustParts1.toString());







    }
}
