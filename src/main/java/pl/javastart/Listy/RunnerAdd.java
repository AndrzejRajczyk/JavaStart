package pl.javastart.Listy;

import java.util.LinkedList;
import java.util.List;

public class RunnerAdd {
    public static void main(String[] args) {

        RAdd rAdd = new RAdd();
        List<Integer> list = new LinkedList<>();


        rAdd.getNumbers(list);
        rAdd.addNumbers(list);
    }
}
