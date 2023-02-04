package pl.javastart.InterfaceAbstract;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Rectangle implements  Shape{
    double a;
    double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
         double result=a*b;
        System.out.println("Obwód kwadratu: " + result);
        return result;
    }

    @Override
    public double callculatePerimeter() {
         double result=2*(a+b);
        System.out.println("Obwód kwadratu: " + result);
        return result;
    }

}
