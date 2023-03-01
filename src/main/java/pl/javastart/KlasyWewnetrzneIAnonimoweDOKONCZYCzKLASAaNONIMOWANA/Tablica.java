package pl.javastart.KlasyWewnetrzneIAnonimoweDOKONCZYCzKLASAaNONIMOWANA;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tablica {
    int x=100;


    public Tablica(int x) {
        this.x = x;
    }
    int [] bubbleArray = new int[x];

   int[] fillTable(){
       { for (int i=0; i<x; i++){
         int a;
            bubbleArray[i]=1;}
           return bubbleArray;

   }

    }





}
