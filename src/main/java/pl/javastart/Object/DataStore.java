package pl.javastart.Object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class DataStore {
    final static int MAXCOMPUTERS = 100;
    public static int numberOfComputer = 0;
    Computer[] store = new Computer[MAXCOMPUTERS];


    void addComputer(Computer computer){
        store[numberOfComputer]=computer;
        numberOfComputer++;
    }
    public Computer[] getComputer(){
       Computer[] tempStore = new Computer[numberOfComputer] ;
        for (int i = 0; i <numberOfComputer ; i++) {
            tempStore[i] = store[i];
        }
        return tempStore;
    }
    int checkAviability(Computer searchForcomputer){

        if (searchForcomputer==null){
            return 0;
        }
        int findedComp = 0;
        for (int i = 0; i < numberOfComputer ; i++) {
            if (searchForcomputer.equals(store[i])){
                findedComp++;
            }

        }
        System.out.println("Istnieją " + searchForcomputer.toString() + findedComp + " takie komputery");
        return findedComp;
    }
    public Computer getComputerOne(int x){
       Computer c = new Computer();
                c = store[x];
        return c;
    }

    public  void   Print(DataStore ds){
    for (int i = 0; i < numberOfComputer; i++)
    {
        String s =    ds.getComputerOne(i).toString();
        System.out.println(" " + s + "\n");}}
}