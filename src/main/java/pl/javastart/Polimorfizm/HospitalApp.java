package pl.javastart.Polimorfizm;



public class HospitalApp {


    public static void main(String[] args) {
        Hospital hospital = new Hospital();


        Person person1 = new Person("Adam", "Nowak", 4000);
        hospital.add(person1);
        Person person2= new Doctor("Jan", "Kowalski", 5000, 4000);
        hospital.add(person2);
        Person person3 = new Nurse("Halina", "Kiepska", 4000, 21);
        hospital.add(person3);
        Person person4 = new Nurse ("Halinka", "Mostowiak", 2000, 1);
        hospital.add(person4);




        System.out.println("____________________");
        // print person
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println("____________________");
        System.out.println("\n");

        System.out.println(hospital.printPerson());
        }





    }



