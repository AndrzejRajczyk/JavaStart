package pl.javastart.Zbiory;

import lombok.Getter;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


@Getter
public class NameSorter {
    final String fileName ="namespl.txt";
    String name;
    FileReader reader = new FileReader(fileName);
    Scanner sc = new Scanner(reader);
   private TreeSet<String> nameSet = new TreeSet<>(
           (o1, o2) -> -o1.compareTo(o2)
   );

/*
private TreeSet<String> nameSet = new TreeSet<>( lepiej zastąpic lambdą
           new Comparator<String>() {
       @Override
       public int compare(String o1, String o2) {
           return -o1.compareTo(o2);
       }
   }
   );*/




    public NameSorter() throws FileNotFoundException {
        System.out.println("Brak pliku "+ fileName);
    }
    void addNames(TreeSet<String> t) throws IOException {

        while(sc.hasNext()){
       name= sc.nextLine();

        nameSet.add(name);
        }

    }

    void printName(TreeSet<String> t) {
        System.out.println(t);
        System.out.println("Pierwsze imię to: " + t.first());
        System.out.println("Ostatnie imię to: " + t.last());
        System.out.println("Wszystkich imion jest: " + t.size());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NameSorter that)) return false;

        if (getFileName() != null ? !getFileName().equals(that.getFileName()) : that.getFileName() != null)
            return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getReader() != null ? !getReader().equals(that.getReader()) : that.getReader() != null) return false;
        if (getSc() != null ? !getSc().equals(that.getSc()) : that.getSc() != null) return false;
        return getNameSet() != null ? getNameSet().equals(that.getNameSet()) : that.getNameSet() == null;
    }

    @Override
    public int hashCode() {
        int result = getFileName() != null ? getFileName().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getReader() != null ? getReader().hashCode() : 0);
        result = 31 * result + (getSc() != null ? getSc().hashCode() : 0);
        result = 31 * result + (getNameSet() != null ? getNameSet().hashCode() : 0);
        return (-result);
    }


}
