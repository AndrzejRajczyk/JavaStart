package pl.javastart.OdczytPlikowPowtorzNaKOniec1111111111111111.ZADANIE;


public class Employee extends Person {
    Person person;
    int salary;



    public Employee(String firstName, String secondName, int salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    public Person getPerson() {
        return person ;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + getFirstName() + " "+ getSecondName() +
                ", salary=" + salary +
                '}';
    }
}
