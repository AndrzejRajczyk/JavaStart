package pl.javastart.Debbuger;
import lombok.ToString;

import java.util.Arrays;
import java.util.Scanner;

class EvenAdder {
 
    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];


        for (int i = 0; i < result.length;) {
            System.out.println("Podaj kolejną liczbę:");

            int next = scanner.nextInt();

            if(next%2==0){
                result[i] = next;
                i++;

        }

    }
        return result;
    }

    /**
     *
     * @param number - number to be checked
     * @return true if number is even, or false otherwise
     */
   

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    public static int[] reverseArray(int[] array){
            int[] reversed = new int[array.length];
            for (int i = 0; i < reversed.length; i++) {
                int temp = array[array.length-1-i];
                reversed[i] = temp ;
            }
            return reversed;
        }


    private static boolean isEven(int next) {
        boolean result=false;
        if (next%2 == 0){
            result= true;
        }else if (next%2 != 0){
            result= false;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        reverseArray(array);


            System.out.print(Arrays.toString(reverseArray(array)));

        }


    }




