package pl.javastart.Petle.Hospital;

import lombok.*;

import java.util.Arrays;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Hospital {
    private final int maxList = 10;
    Patient[] patientsList = new Patient[maxList];
    Patient patient = new Patient();

    private int listOfpatients = 0;


    public void addPatient(Patient patient) {
        if (listOfpatients <= maxList) {
            patientsList[listOfpatients] = patient;
            listOfpatients++;
        } else {
            System.out.println("Lista pełna nie możesz nikogo dodać");
        }


    }

    public void print() {
        for (int i = 0; i < listOfpatients; i++) {
            patient = patientsList[i];
            System.out.println(patient.getName() + " " + patient.getSecondName());

        }

    }
}






