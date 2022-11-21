package pl.javastart.Enkapsulacja.processor;

import lombok.NoArgsConstructor;
import pl.javastart.Enkapsulacja.data.Client;

@NoArgsConstructor
public class Discount {
    Client client = new Client();

      public void discountcheck (Client client){
           if (client.getCasch()<1000){
               int price = (int) (client.getCasch()*0.85);
                       System.out.println(" Cena po rabacie: "+price);
           }
           else {
               int price = (int) (client.getCasch()*0.95);
               System.out.println(" Cena po rabacie: "+ price);}

       }

}
