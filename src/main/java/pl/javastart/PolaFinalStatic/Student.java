package pl.javastart.PolaFinalStatic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class Student {
    String name;
            String secondName;
            static int STUD_NUMBERS=0;



    public Student (String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
        STUD_NUMBERS++;
    }


}
