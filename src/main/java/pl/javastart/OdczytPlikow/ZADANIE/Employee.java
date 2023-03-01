package pl.javastart.OdczytPlikow.ZADANIE;

import lombok.AllArgsConstructor;
import lombok.ToString;




public class Employee extends Person {
    Person person;
    int salary;

    public Employee(String firstName, Person person, int salary) {
        super(firstName);
        this.person = person;
        this.salary = salary;
    }

    public Employee(String firstName, String secondName,  int salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", salary=" + salary +
                '}';
    }
}
