package pl.javastart.Listy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class RAdd {
    private  List<Integer> numbers = new LinkedList<>();
    public static final String EXIT = "exit";
    private int sum = 0 ;

    Scanner sc = new Scanner(System.in);

    public RAdd() {
        this.numbers = numbers;
    }

    void getNumbers (List<Integer> numbers) {
        System.out.println("Podaj liczbę całkowitą lub wpisz  \"exit\"");
        String s = sc.nextLine();

        if (s.equals(EXIT)) {
            System.out.println("Suma to: " + sum);
        } else {
            try {
                sum = Integer.parseInt(s);
                numbers.add(sum);
            } catch (NumberFormatException e) {
                System.err.println("Błąd danych");
            }
            getNumbers(numbers);
        }
    }


                void addNumbers (List<Integer> numbers){
                    int x=0;
                    int sum=0;
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < numbers.size(); i++) {
                        x=numbers.get(i);
                        sb = sb.append("+ " + x);
                        sb = sb.append(" ");
                        sum=sum+x;

                    }
                    System.out.println("Suma liczb: " + sb + "wynosi: " + sum);
                }



    }


