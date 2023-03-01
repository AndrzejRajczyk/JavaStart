package pl.javastart.OdczytPlikow.ZADANIE;

import lombok.*;

import java.io.Serializable;


public class Person implements Serializable {
   private  String firstName ;
    private String secondName ;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
