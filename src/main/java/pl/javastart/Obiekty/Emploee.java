package pl.javastart.Obiekty;

public class Emploee {
    String firstName;
    String surename;
    int age;
    String companyName;

    public Emploee(String firstName, String surename, int age, String companyName) {
        this.firstName = firstName;
        this.surename = surename;
        this.age = age;
        this.companyName = companyName;

    }

    public Emploee() {
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "firstName='" + firstName + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
