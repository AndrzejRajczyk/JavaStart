package pl.javastart.Polimorfizm;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static pl.javastart.Polimorfizm.Hospital.personQuantity;

@Setter
@Getter

public class Doctor extends Person {
    int bonus;

    public Doctor(String name, String secondName, int salary, int bonus) {
        super(name,secondName,salary);
        this.bonus = bonus;
    }

    @Override
    public String getAllInfo(){
        return super.getAllInfo()+" "+ bonus;
    }
    }


