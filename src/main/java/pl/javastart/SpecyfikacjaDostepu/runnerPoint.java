package pl.javastart.SpecyfikacjaDostepu;

import pl.javastart.SpecyfikacjaDostepu.Controller.PointController;
import pl.javastart.SpecyfikacjaDostepu.Data.Point;

public class runnerPoint {
    public static void main(String[] args) {
        Point point = new Point (10,20);
        PointController pointController=new PointController();


        pointController.addX(point);
        pointController.addY(point);
        pointController.minusX(point);
        pointController.minusY(point);

    }
}
