package pl.javastart.Enkapsulacja;

public class PrinterRunner {
    public static void main(String[] args) {
        Client client1  =new Client ("Jan", "Kowalski", 600 );
        Client client2 = new Client (null,"kowalski1", 98756);
        Client client3 =new Client ("Jan3", null,2345);
        Printer printer = new Printer();



       printer.printOnScreen(client1);

       printer.printOnScreen(client2);

       printer.printOnScreen(client3);


    }
}
