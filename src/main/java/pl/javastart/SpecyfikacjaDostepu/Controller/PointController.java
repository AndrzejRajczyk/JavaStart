package pl.javastart.SpecyfikacjaDostepu.Controller;

import pl.javastart.SpecyfikacjaDostepu.Data.Point;

public class PointController {

    public   void addX(Point point){
         int x= point.getX();
       point.setX(x+1);
       System.out.println(point+"/n");

    }
    public void  minusX(Point point){
        int x= point.getX();
        point.setX(x-1);
        System.out.println(point+"/n");
    }
    public void   addY(Point point){
        int y= point.getY();
        point.setY(y+1);
        System.out.println(point+"/n");
    }
    public void  minusY(Point point){
        int y= point.getY();
        point.setY(y-1);
        System.out.println(point+"/n");
    }
}
