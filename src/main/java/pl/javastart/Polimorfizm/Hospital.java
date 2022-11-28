package pl.javastart.Polimorfizm;

import lombok.Setter;



@Setter

public class Hospital {
    public static final int  PERSONNUMBER = 10;
    public static int personQuantity=0;
    private Person[] personList =new Person [PERSONNUMBER];

    void  add(Person person){
        if(personQuantity<PERSONNUMBER){
        personList[personQuantity-1] = person;
        }

        }


    String printPerson(){
    String result=" ";
        for(int i=0;i<personQuantity;i++){
            result = result + personList[i].getAllInfo() + "\n";
        }
        return result;
    }

}






