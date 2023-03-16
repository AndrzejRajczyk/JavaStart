package pl.javastart.TabliceOperacje;

public class testpersondatabase
{
    public static void main(String[] args) {


        Person person1 = new Person("Adam", "Słodowy", "12344");
        Person person2 = new Person("Adam1", "Słodowy1", "12344");
        Person person3 = new Person("Adam2", "Słodowy2", "12344");
        Person person4 = new Person("Adam3", "Słodowy2", "12344");
        PersonDatabse db = new PersonDatabse();
        System.out.println("--------------------------");
        int index = 2 ;
        db.add(person1);
        db.add(person2);
        db.add(person3);
        db.add(person4);
        System.out.println(db);
        System.out.println("--------------------------");
        db.remove(person1);
        System.out.println(db);
        System.out.println("--------------------------");
        db.get(2);
        db.size();
    }
}
