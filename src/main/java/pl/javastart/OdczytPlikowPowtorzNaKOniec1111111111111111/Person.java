package pl.javastart.OdczytPlikowPowtorzNaKOniec1111111111111111;


import java.io.Serializable;


public class Person implements Serializable { //implements Serializable
    //@Serial
    private static final long serialVersionUID = 3812017177088226528L;

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}