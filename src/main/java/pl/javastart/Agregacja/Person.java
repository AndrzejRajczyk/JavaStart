package pl.javastart.Agregacja;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Person {
    String firstName;
    String lastName;
    long pesel;
    AdressFirst adressFirst;
    AdressSecond adressSecond;
}
