package pl.javastart.Obiekty;

public class Company {

    public static void main(String[] args) {

        Emploee emploee1 = new Emploee("Jan", "Kowalski",30, "Adidas");
        Emploee emploee2 = new Emploee("Stanisław", "Paluch", 35, "Weglokoks");
        Emploee emploee3 = new Emploee();
        emploee3.firstName="Zenobiusz";
        emploee3.surename="Furman";
        emploee3.age=35;
        emploee3.companyName="Instytut";
    System.out.print(emploee1+ ", \n" + emploee2+ ", \n"+ emploee3+ ", \n")   ;

    }

}

