package pl.javastart.SpecyfikacjaDostepu;

import pl.javastart.SpecyfikacjaDostepu.Controller.PointController;
import pl.javastart.SpecyfikacjaDostepu.Data.Point;

public class runnerPoint {
    public static void main(String[] args) {
        Point point = new Point (10,20);
        PointController pointController=new PointController();
            final int addX = 1;
            final int minX = 2;
            final int addY = 3;
            final int minY=4;

                int option = 5;


            switch (option){
                case addX:pointController.addX(point);
                break;
                case addY:pointController.addY(point);
                break;
                case minX:pointController.minusX(point);
                    break;
                case minY:pointController.minusY(point);
                    break;
                default:System.out.println ("błędna opcja ");

            }


        pointController.addX(point);
        pointController.addY(point);
        pointController.minusX(point);
        pointController.minusY(point);

    }
}
