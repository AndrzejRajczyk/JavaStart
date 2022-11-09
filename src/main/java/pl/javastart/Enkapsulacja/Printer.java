package pl.javastart.Enkapsulacja;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Printer {

   Client client = new Client();


   void printOnScreen (Client client){
       String name = client.getName();
       String lastName = client.getLastName();

       if (name != null && lastName != null){
           System.out.println("witaj " +name + " "+ lastName);
       }
       else if (name != null && lastName!=null){
           System.out.println("witaj " + name + " " + lastName);
       }
       else if (name == null && lastName !=null) {
           System.out.println("dzień dobry  "  + lastName);
       }
       else
           System.out.println("Witaj nieznajomy");

   }


}
