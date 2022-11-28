package pl.javastart.Polimorfizm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import static pl.javastart.Polimorfizm.Hospital.personQuantity;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Person {
    String name;
    String secondName;
    int salary;


    public Person(String name, String secondName, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        personQuantity++;
    }
    public String getAllInfo() {
        return name + " " + secondName + " " + salary;
    }



}
