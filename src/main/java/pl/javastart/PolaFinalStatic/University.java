package pl.javastart.PolaFinalStatic;

public class University {




    public static void main(String[] args) {
        System.out.println("Witaj: ");
        Student student1 = new Student("jan", "Kowalski");
        Student student2= new Student("janek", "Kowalik");
        Student student4 = new Student("janko", "Ryzykant");
        System.out.println("Ilość zapisanych  Studentów: " + Student.STUD_NUMBERS);



    }


        }




