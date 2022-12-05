package pl.javastart.Object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Computer {
    String producer;
    int model;


    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer  +  ", model=" + model + "}";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;

        Computer computer = (Computer) o;

        if (getModel() != computer.getModel()||getProducer() != computer.getProducer() ) return false;
        return getProducer().equals(computer.getProducer());
    }

    @Override
    public int hashCode() {
        int result = getProducer().hashCode();
        result = 31 * result + getModel();
        return result;
    }
}
