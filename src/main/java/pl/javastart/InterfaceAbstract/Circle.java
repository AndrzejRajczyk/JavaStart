package pl.javastart.InterfaceAbstract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle implements Shape{

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        double result;
        result = PI*r*r;
        System.out.println("Pole koła to: "+ result);
        return result;
    }

    @Override
    public double callculatePerimeter() {
        double result;
        result = 2*PI*r;
        System.out.println("Obwód koła to: "+ result);
        return result;
    }
}
