package pl.javastart.TabliceOperacje;



import java.util.Arrays;

public class PersonDatabse {
    public static int DATABASESIZE=1;

    int counter = 0;
    Person[] personDatabase = new Person[DATABASESIZE];



    public  void add(Person p){
        if (p==null){
            throw new NullPointerException("Musisz podać dane osoby");}
        if (counter == personDatabase.length){
            personDatabase=Arrays.copyOf(personDatabase,personDatabase.length*2);
        }
        if(counter< personDatabase.length){
                personDatabase[counter]=p;
                counter++;

            }
        }





    void remove(Person p){
        if (p==null){
            throw new NullPointerException("Musisz podać dane osoby");}

        for (int i = 0; i < counter; i++) {
            if(personDatabase[i].equals(p)){
                System.arraycopy(personDatabase,i,personDatabase,i,personDatabase.length-i);
                i=counter;
            }
            personDatabase[personDatabase.length-1]=null;
            counter=counter-1;
        }

    }
        Person get(int index){
        System.out.println( "Osoba z pozycji nr " + index+ " to: " + personDatabase[index]);
        return personDatabase[index];
        }

        int size(){
        System.out.println("Wielkość tablicy to: " + counter);
        return counter;
        }






    @Override
    public String toString() {
        return "personDatabase=" + Arrays.toString(personDatabase) +
                '}';
    }
}
