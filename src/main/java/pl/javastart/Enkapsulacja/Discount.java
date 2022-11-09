package pl.javastart.Enkapsulacja;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Discount {
    Client client = new Client();

       void discountcheck (Client client){
           if (client.getCasch()<1000){
               int price = (int) (client.getCasch()*0.85);
                       System.out.print(" Cena po rabacie: "+price);
           }
           else {
               int price = (int) (client.getCasch()*0.95);
               System.out.print(" Cena po rabacie: "+ price);}

       }

}
