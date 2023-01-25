package pl.javastart.TypString;

import java.util.Arrays;
import java.util.Scanner;

public class LastLetter {



    public static void main(String[] args) {
        String invite = "Hello give me the number of words you would like to write: ";
        String nextWord = "Write next world and press enter";

        int number;

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        System.out.println(invite);
        number = scanner.nextInt();
        scanner.nextLine();

        String[] slowa = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println(nextWord);
            slowa[i]=scanner.nextLine();
        }
        for (int i = 0; i < number; i++) {
            sb.append(slowa[i].charAt(slowa[i].length()-1));
        }
        System.out.println("You types: " + Arrays.toString(slowa));
        System.out.println("Last leters of words you types, make word: " + sb.toString());
        System.out.printf("");

        scanner.close();
    }

}
