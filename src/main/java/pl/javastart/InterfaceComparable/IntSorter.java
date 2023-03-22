package pl.javastart.InterfaceComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class IntSorter {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000];
        Random generator = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=generator.nextInt(1000);
        }

       System.out.println("Wygeneerowana tablica: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Tablica sortowana rosnąco" + Arrays.toString(numbers));

        Arrays.sort(numbers,
                (o1, o2) -> o1.compareTo(o2)*(-1));
        System.out.println("Tablica sortowana malejąco" + Arrays.toString(numbers) );
    }
}
