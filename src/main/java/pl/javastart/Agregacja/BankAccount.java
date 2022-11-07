package pl.javastart.Agregacja;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankAccount {
    Person person;
    int account;

    public static void main(String[] args) {
        AdressFirst adressFirst1 = new AdressFirst("Warszawa","Piękna",123,15);
        AdressSecond adressSecond1 = new AdressSecond("Warszawa","Piękna",123,15);
        AdressSecond adressSecond2 = new AdressSecond("Kraków","wawelska",9,12);
        Person person1 = new Person("Jan", "Kowalski",12122300999L,adressFirst1,adressSecond1);
        Person person2 = new Person("Bianka", "Kowalska",12344599345L,adressFirst1, adressSecond2);


        BankAccount account1 = new BankAccount();
         account1.person=person1;
         account1.account = 5000;
         BankAccount account2 = new BankAccount();
         account2.person=person2;
         account2.account=10_000;

         System.out.println(account1);
         System.out.println(account2);











    }



}
