package pl.javastart.Zbiory;


import java.io.IOException;

public class NameSorterRunner {
    public static void main(String[] args) throws IOException {
        NameSorter ns = new NameSorter();

        ns.addNames(ns.getNameSet());
        ns.printName(ns.getNameSet());

    }
}
