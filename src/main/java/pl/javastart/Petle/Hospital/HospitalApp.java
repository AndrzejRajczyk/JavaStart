package pl.javastart.Petle.Hospital;

import java.util.Scanner;

public class HospitalApp {



    public static void main(String[] args) {

       Patient patient =new Patient();
             Hospital hospital = new Hospital();
             Scanner scanner = new Scanner(System.in);
             final int exit = 3;
             final int print =2;
             final int add =1;
             int choice = 4;


        while(choice!=exit){
            System.out.println("Witaj w procedurze wybierz opcje ");
            System.out.println("1: Dopisz pacjenta ");
            System.out.println("2: Wyświetl Listę pacjentów");
            System.out.println("3: wyjdź z programu ");

            choice = scanner.nextInt();
            scanner.nextLine();


         switch (choice) {
            case add: {


                System.out.println("Podaj imie pacjenta:  ");

                patient.setName(scanner.nextLine());


                System.out.println("Podaj nazwisko pacjenta:  ");
                patient.setSecondName( scanner.nextLine());

                System.out.println("Podaj PESEL pacjenta:  ");
                patient.setPesel(scanner.nextLine());

                System.out.println("Zapisuję nowego pacjenta");
                hospital.addPatient(patient);
                String name = patient.getName();
                System.out.println(name);


                break;

            }
            case print: {

                hospital.print();
                break;
            }
            case exit: {
                System.out.println("By by");
                break;
            }
            default: {
                System.out.println("wybierz jedeną z opcji: ");

            }
            scanner.close();
        }



        }











    }
}
