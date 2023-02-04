package pl.javastart.InterfaceAbstract;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.sqrt;

@Getter
@Setter
public class Triangle implements Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double perHalf = a+b+c;
        double result = sqrt(perHalf*(perHalf-a)*(perHalf-b)*(perHalf-c));
        System.out.println("Pole trójkąta to: " + result);
        return result;

    }

    @Override
    public double callculatePerimeter() {
        double result = a+b+c;
        System.out.println("Obwód trójkąta to: " + result);
        return result;
    }

}
