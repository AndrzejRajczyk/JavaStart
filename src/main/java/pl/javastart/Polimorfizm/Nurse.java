package pl.javastart.Polimorfizm;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Nurse extends Person {
    int overtime;

    public Nurse(String name, String secondName, int salary, int overtime) {
        super(name, secondName, salary);
        this.overtime = overtime;
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + " " + overtime;
    }
}

