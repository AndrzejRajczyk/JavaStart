package pl.javastart.Object;


import static pl.javastart.Object.DataStore.numberOfComputer;

public class NoteShop {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell",1234);
        Computer computer2 = new Computer("John",12345);
        Computer computer3 = new Computer("Bob",1234564);
        Computer computer4 = new Computer("Fred",12564);
        Computer computer5 = new Computer("George",1234);
        Computer computer6 = new Computer("Alice",1234);
        Computer computer7 = new Computer("Alice",1234);
        Computer computer8 = new Computer("Alice",1234);//to find
        DataStore dataStore = new DataStore();
        dataStore.addComputer(computer1);
        dataStore.addComputer(computer2);
        dataStore.addComputer(computer3);
        dataStore.addComputer(computer4);
        dataStore.addComputer(computer5);
        dataStore.addComputer(computer6);
        dataStore.addComputer(computer7);
        dataStore.addComputer(computer8);

        dataStore.checkAviability(computer8);
        dataStore.Print(dataStore);




    }
}
