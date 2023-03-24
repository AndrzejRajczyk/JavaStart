package pl.javastart.InterfaceComparable;

public class test implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0; // albo -1 lub 1 z definicją jak sortować
    }
}
