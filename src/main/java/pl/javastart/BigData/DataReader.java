package pl.javastart.BigData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class DataReader {

    public static void main(String[] args)  {
        final String data = "Data.txt";

        try (var fr = new FileReader(data); var br = new BufferedReader(fr)){
           int a = Integer.parseInt(br.readLine());
           int b = Integer.parseInt(br.readLine());
           int c = Integer.parseInt(br.readLine());
           System.out.println("Pierwsza odpowiedź suma pierwszych trzech liczb to: " + (a+b+c));

            BigInteger d= new BigInteger(br.readLine());
            BigInteger e =new BigInteger(br.readLine());
            BigInteger sum = d.add(e);
            System.out.println("Druga odpowiedź to: "+ sum);

        }
        catch (FileNotFoundException e){
            System.out.println("Brak pliku Data.txt");
        }
        catch (IOException f){
            System.out.println("Bład odczytu pliku");
        }

    }

}
